package com.example.android.musicalstructure;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by Zsolt on 6/28/2017.
 */

public class SubscriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_subscription.xml layout file
        setContentView(R.layout.activity_subscription);

        // Find the button that shows the monthly subscription option
        Button monthly = (Button) findViewById(R.id.button_monthly);
        // Set a click listener on that View
        monthly.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when monthly is clicked on.
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://play.google.com/store/apps/"));
                startActivity(intent);
            }
        });

        // Find the button that shows the yearly subscription option
        Button yearly = (Button) findViewById(R.id.button_yearly);
        // Set a click listener on that View
        yearly.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when monthly is clicked on.
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://play.google.com/store/apps/"));
                startActivity(intent);
            }
        });
    }
}

