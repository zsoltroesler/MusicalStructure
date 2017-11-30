package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the activity_playlist category
        TextView playlist = (TextView) findViewById(R.id.playlist);

        // Set a click listener on that View
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the activity_playlist category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlaylistsActivity}
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);

                // Start the new activity
                startActivity(playlistIntent);
            }
        });

        // Find the View that shows the activity_artist category
        TextView artist = (TextView) findViewById(R.id.artist);

        // Set a click listener on that View
        artist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the activity_artist category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ArtistActivity}
                Intent artistIntent = new Intent(MainActivity.this, ArtistActivity.class);

                // Start the new activity
                startActivity(artistIntent);
            }
        });

        // Find the View that shows the activity_album category
        TextView album = (TextView) findViewById(R.id.album);

        // Set a click listener on that View
        album.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the activity_album category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumActivity}
                Intent albumIntent = new Intent(MainActivity.this, AlbumActivity.class);

                // Start the new activity
                startActivity(albumIntent);
            }
        });

        // Find the View that shows the activity_song category
        TextView song = (TextView) findViewById(R.id.song);

        // Set a click listener on that View
        song.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the activity_song category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongActivity}
                Intent songIntent = new Intent(MainActivity.this, SongActivity.class);

                // Start the new activity
                startActivity(songIntent);
            }
        });

        // Find the View that shows the activity_song activity_subscription options
        Button subscription = (Button) findViewById(R.id.subscription);
        // Set a click listener on that View
        subscription.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the activity_subscription is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SubscriptionActivity}
                Intent subscriptionIntent = new Intent(MainActivity.this, SubscriptionActivity.class);

                // Start the new activity
                startActivity(subscriptionIntent);
            }
        });
    }
}
