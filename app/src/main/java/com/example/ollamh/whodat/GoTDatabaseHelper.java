package com.example.ollamh.whodat;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.renderscript.ScriptGroup;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by ollamh on 7/24/17.
 */

public class GoTDatabaseHelper extends SQLiteOpenHelper {

    private String PATH = "/data/data/com.example.ollamh.whodat/databases/";

    private static String NAME = "got.sql";

    private static SQLiteDatabase characterDB;

    private final Context myContext;


    public GoTDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, NAME, null, 1);
        this.myContext = context;
//        PATH = myContext.getDatabasePath(NAME).getPath();
    }

    public void createDatabase() throws IOException{

        if(checkDatabase()){
            // empty
        } else {
            this.getReadableDatabase();

            try{
                copyDatabase();
            } catch (IOException e){
                throw new Error("Error copying database");
            }
        }
    }

    public boolean checkDatabase(){

        SQLiteDatabase checkDB = null; //create a blank slate
        try{
            String myPath= PATH + NAME; //using our path
            checkDB = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);
        } catch (SQLiteException e){
            // no exist
        }
        if (checkDB != null)    //if error thrown, out of try,
            checkDB.close();    // close it and make it null

        return checkDB != null ? true : false;  // only return true if checkDB was created
    }

    private void copyDatabase() throws IOException{

        InputStream input = myContext.getAssets().open(NAME);
            //open local db as the input stream
        String outfile = PATH + NAME;
            // path to the created empty db
        OutputStream output = new FileOutputStream(outfile);
            // open the empty db as the output stream

        //transfer bytes from the inputfile to the outputfile
        byte[] buffer = new byte[1024];
        int length;
        while ((length = input.read(buffer))>0){
            output.write(buffer, 0, length);
        }

        //Close the streams
        output.flush();
        output.close();
        input.close();

    }

    public void openDataBase() throws SQLException{

        //Open sesame
        String myPath = PATH + NAME;
        characterDB = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);

    }

    @Override
    public synchronized void close() {
        if(characterDB != null)
            characterDB.close();

        super.close();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
