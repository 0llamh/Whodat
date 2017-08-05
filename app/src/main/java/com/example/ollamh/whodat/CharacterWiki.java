package com.example.ollamh.whodat;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class CharacterWiki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_wiki);
        TextView cname = (TextView) findViewById(R.id.cname);
        TextView chouse = (TextView) findViewById(R.id.house);
        Bundle extras = getIntent().getExtras();
        String season = extras.getString("season");
        String name = extras.getString("character");
        //Ideally, house would be retrieved from the database and put into a string here
        cname.setText(name);
        ImageView button = (ImageView) findViewById(R.id.portrait);
        if(name.equals("Jon Snow"))
        {
            button.setImageResource(R.mipmap.jonsnow);
            chouse.setText("Knight's Watch");
        }
        else if(name.equals("Daenerys Targaryen"))
        {
            button.setImageResource(R.mipmap.daenerys);
            chouse.setText("House Targaryen");
        }
        else if(name.equals("Viserys Targaryen"))
        {
            button.setImageResource(R.mipmap.viserys);
            chouse.setText("House Targaryen");
        }
        else if(name.equals("Robb Stark"))
        {
            button.setImageResource(R.mipmap.viserys);
            chouse.setText("House Stark");
        }
        else if(name.equals("Jaime Lannister"))
        {
            button.setImageResource(R.mipmap.jaime);
            chouse.setText("Kingsguard");
        }
        else if(name.equals("Eddard \"Ned\" Stark"))
        {
            button.setImageResource(R.mipmap.nedstark);
            chouse.setText("House Stark");
        }
        else if(name.equals("Robert Baratheon"))
        {
            button.setImageResource(R.mipmap.robertbaratheon);
            chouse.setText("House Baratheon");
        }
        else if(name.equals("Tyrion Lannister"))
        {
            button.setImageResource(R.mipmap.tyrion);
            chouse.setText("House Lannister");
        }
        else if(name.equals("Cersei Lannister"))
        {
            button.setImageResource(R.mipmap.cersei);
            chouse.setText("House Baratheon");
        }
        else if(name.equals("Sansa Stark"))
        {
            button.setImageResource(R.mipmap.cersei);
            chouse.setText("House Stark");
        }
        else if(name.equals("Bronn"))
        {
            chouse.setText("No Affiliation");
            button.setImageResource(R.mipmap.bronn);
        }
        else
        {
            button.setImageResource(R.mipmap.placeholder);
        }

        TextView summary = (TextView)findViewById(R.id.sum);
        summary.setMovementMethod(new ScrollingMovementMethod());

    }
}
