package com.example.ollamh.whodat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import android.widget.Toast;

public class CharacterWiki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_wiki);
        Bundle extras = getIntent().getExtras();
        String season = extras.getString("season");
        Toast.makeText(this, season, Toast.LENGTH_SHORT).show();

        TextView summary = (TextView)findViewById(R.id.sum);
        summary.setMovementMethod(new ScrollingMovementMethod());

    }
}
