package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Zsolt on 6/26/2017.
 */

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_song.xml layout file
        setContentView(R.layout.activity_song);

        // Set the music player on the bottom of the xml layout file
        // Click play icon would start playing the activity_song
        ImageView play = (ImageView) findViewById(R.id.image_play);
        play.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(SongActivity.this, "Playing song", Toast.LENGTH_SHORT).show();
            }
        });

        // Click pause icon would pause playing the activity_song
        ImageView pause = (ImageView) findViewById(R.id.image_pause);
        pause.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(SongActivity.this, "Pausing song", Toast.LENGTH_SHORT).show();
            }
        });

        // Click skip previous icon would go back to the previous activity_song
        ImageView skipPrevious = (ImageView) findViewById(R.id.image_skip_previous);
        skipPrevious.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(SongActivity.this, "Previous song", Toast.LENGTH_SHORT).show();
            }
        });

        // Click skip next icon would jump to the next activity_song
        ImageView skipNext = (ImageView) findViewById(R.id.image_skip_next);
        skipNext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(SongActivity.this, "Next song", Toast.LENGTH_SHORT).show();
            }
        });

    }
}