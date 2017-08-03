package com.example.ollamh.whodat;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [] seasons={"1","2","3","4","5","6","7"};
        String [] episodes={"1","2","3","4","5","6","7","8","9","10"};

        final Spinner spinner = (Spinner) findViewById(R.id.season_spinner);
        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, seasons );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        final Spinner spinner2 = (Spinner) findViewById(R.id.episode_spinner);
        ArrayAdapter<String> adapter2= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, episodes );
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        Button search = (Button) findViewById(R.id.button);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent= new Intent(getApplicationContext(), Selection.class);
                final String season = spinner.getSelectedItem().toString();
                final String episode = spinner2.getSelectedItem().toString();
                intent.putExtra("episode", episode);
                intent.putExtra("season", season);
                startActivity(intent);
            }
        });

    }
}
