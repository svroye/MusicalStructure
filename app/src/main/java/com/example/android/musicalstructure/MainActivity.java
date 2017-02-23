package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find the buttons in the Home screen
        Button numbersButton = (Button) findViewById(R.id.songs_button);
        Button artistButton = (Button) findViewById(R.id.artists_button);
        Button albumButton = (Button) findViewById(R.id.albums_button);
        Button searchButton = (Button) findViewById(R.id.search_button);
        LinearLayout imageLayout = (LinearLayout) findViewById(R.id.image_home);

        //set clickListener to the numbers button, and create intent such that
        //a press on the button opens the Songs activity
        numbersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Songs.class);
                startActivity(intent);
            }
        });

        //set clickListener to the artist button, and create intent such that
        //a press on the button opens the Artists activity
        artistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Artists.class);
                startActivity(intent);
            }
        });

        //set clickListener to the album button, and create intent such that
        //a press on the button opens the Albums activity
        albumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Albums.class);
                startActivity(intent);
            }
        });

        //set clickListener to the search button, and create intent such that
        //a press on the button opens the Search activity
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Search.class);
                startActivity(intent);
            }
        });

        //set clickListener to the imageLayout button, and create intent such that
        //a press on the button opens the CurrentlyPlaying activity
        imageLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CurrentlyPlaying.class);
                startActivity(intent);
            }
        });
    }
}
