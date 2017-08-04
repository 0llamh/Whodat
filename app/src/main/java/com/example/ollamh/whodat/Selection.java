package com.example.ollamh.whodat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
public class Selection extends AppCompatActivity {

    List<Character> cList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        Bundle extras = getIntent().getExtras();
        String episode = extras.getString("episode");
        String season = extras.getString("season");
        cList = new ArrayList<Character>();
        RecyclerView rvCharacters = (RecyclerView) findViewById(R.id.rvcharacters);

        for(int i =0; i<5; i++){
            //iterate through characters and get there relevance codes
            //if(season.contains(character.relevancecode)
            Character c = new Character();
            //now you set c.setname to the name of the character (taken from database)
            if(i == 1)
            {
                c.setName("Bronn");
            }
            else
                c.setName("Tyrion Lannister");
            cList.add(c);
        }
        //I can't get the recycler to display properly!! :(
        CharacterAdapter adapt= new CharacterAdapter(this,cList, season);
        rvCharacters.setAdapter(adapt);
        LinearLayoutManager linearlayout = new LinearLayoutManager(this);
        linearlayout.setOrientation(LinearLayoutManager.VERTICAL);
        rvCharacters.setLayoutManager(linearlayout);

    }
}
