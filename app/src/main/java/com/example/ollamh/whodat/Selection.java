package com.example.ollamh.whodat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
public class Selection extends AppCompatActivity {

    public static List<Character> cList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        Bundle extras = getIntent().getExtras();
        String episode = extras.getString("episode");
        String season = extras.getString("season");
        cList = new ArrayList<Character>();
        RecyclerView rvCharacters = (RecyclerView) findViewById(R.id.rvcharacters);

        Character c = new Character();
        do{
            //iterate through characters and get there relevance codes
            //if(season.contains(character.relevancecode)
            //now you set c.setname to the name of the character (taken from database)



            c.setName("Tyrion Lannister");
            c.getHouse();
            c.getRelevance();
            // ..

            cList.add(c);
        }while(c != null);


        CharacterAdapter adapt= new CharacterAdapter(this,cList, season);
        rvCharacters.setAdapter(adapt);
        LinearLayoutManager linearlayout = new LinearLayoutManager(this);
        linearlayout.setOrientation(LinearLayoutManager.VERTICAL);
        rvCharacters.setLayoutManager(linearlayout);

    }


}
