package com.example.ollamh.whodat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
public class Selection extends AppCompatActivity {

    List<Character> cList = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        Bundle extras = getIntent().getExtras();
        String episode = extras.getString("episode");
        String season = extras.getString("season");

        RecyclerView rvCharacters = (RecyclerView) findViewById(R.id.rvcharacters);

        for(int i =0; i<5; i++){
            Character c = new Character();
            c.setName("Jon Snow" + i);
            cList.add(c);
        }

        CharacterAdapter adapt= new CharacterAdapter(this,cList);
        rvCharacters.setAdapter(adapt);
        rvCharacters.setLayoutManager(new LinearLayoutManager(this));

    }
}
