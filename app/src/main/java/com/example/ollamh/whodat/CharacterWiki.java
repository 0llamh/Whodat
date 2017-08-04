package com.example.ollamh.whodat;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CharacterWiki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_wiki);
        Bundle extras = getIntent().getExtras();
        String season = extras.getString("season");
        String name = extras.getString("character");
        ImageView button = (ImageView) findViewById(R.id.portrait);
        if(name.equals("Jon Snow"))
        {
            button.setImageResource(R.mipmap.jonsnow);
        }
        else if(name.equals("Daenerys Targaryen"))
        {
            button.setImageResource(R.mipmap.daenerys);
        }
        else if(name.equals("Viserys Targaryen"))
        {
            button.setImageResource(R.mipmap.viserys);
        }
        else if(name.equals("Robb Stark"))
        {
            button.setImageResource(R.mipmap.viserys);
        }
        else if(name.equals("Jaime Lannister"))
        {
            button.setImageResource(R.mipmap.jaime);
        }
        else if(name.equals("Eddard \"Ned\" Stark"))
        {
            button.setImageResource(R.mipmap.nedstark);
        }
        else if(name.equals("Robert Baratheon"))
        {
            button.setImageResource(R.mipmap.robertbaratheon);
        }
        else if(name.equals("Tyrion Lannister"))
        {
            button.setImageResource(R.mipmap.tyrion);
        }
        else if(name.equals("Cersei Lannister"))
        {
            button.setImageResource(R.mipmap.cersei);
        }
        else if(name.equals("Sansa Stark"))
        {
            button.setImageResource(R.mipmap.cersei);
        }
        else
        {
            button.setImageResource(R.mipmap.placeholder);
        }

        TextView summary = (TextView)findViewById(R.id.sum);
        summary.setMovementMethod(new ScrollingMovementMethod());

    }
}
