package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by Zsolt on 6/26/2017.
 */

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_album.xml layout file
        setContentView(R.layout.activity_album);

        // Click on the activity_album would go to its songs but now it only navigates to SongActivity
        LinearLayout albumToSong = (LinearLayout) findViewById(R.id.albumToSong);

        albumToSong.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongActivity}
                Intent albumToSongIntent = new Intent(AlbumActivity.this, SongActivity.class);
                startActivity(albumToSongIntent);
            }
        });

        // Set the music player on the bottom of the xml layout file
        // Click play icon would start playing the activity_song
        ImageView play = (ImageView) findViewById(R.id.image_play);
        play.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(AlbumActivity.this, "Playing song", Toast.LENGTH_SHORT).show();
            }
        });

        // Click pause icon would pause playing the activity_song
        ImageView pause = (ImageView) findViewById(R.id.image_pause);
        pause.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(AlbumActivity.this, "Pausing song", Toast.LENGTH_SHORT).show();
            }
        });

        // Click skip previous icon would bo back to the previous activity_song
        ImageView skipPrevious = (ImageView) findViewById(R.id.image_skip_previous);
        skipPrevious.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(AlbumActivity.this, "Previous song", Toast.LENGTH_SHORT).show();
            }
        });

        // Click skip next icon would jump to the next activity_song
        ImageView skipNext = (ImageView) findViewById(R.id.image_skip_next);
        skipNext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(AlbumActivity.this, "Next song", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
