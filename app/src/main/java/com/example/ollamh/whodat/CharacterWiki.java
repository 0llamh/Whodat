package com.example.ollamh.whodat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class CharacterWiki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_wiki);


        TextView summary = (TextView)findViewById(R.id.sum);
        summary.setMovementMethod(new ScrollingMovementMethod());

    }
}
