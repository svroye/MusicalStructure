package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        // find the viewgroup corresponding with the currently playing field and open the
        // CurrentlyPlaying activity when this View is clicked
        LinearLayout currentSong = (LinearLayout) findViewById(R.id.now_playing);
        currentSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CurrentlyPlaying.class);
                startActivity(intent);
            }
        });
    }
}
