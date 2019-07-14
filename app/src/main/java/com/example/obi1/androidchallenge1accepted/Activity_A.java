package com.example.obi1.androidchallenge1accepted;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Activity_A extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        Button aboutALC = (Button) findViewById(R.id.about_alc_button); //gets reference to ABOUT ALC BUTTON
        Button myprofile = (Button) findViewById(R.id.my_profile_button); //gets reference to MY PROFILE BUTTON

        aboutALC.setOnClickListener(new View.OnClickListener() { //Handles on click action to the about ALC button
            @Override
            public void onClick(View view) {
                Intent intent_about = new Intent(Activity_A.this, AboutAlcActivity.class);
                startActivity(intent_about);
            }
        });

        myprofile.setOnClickListener(new View.OnClickListener() { //Handles on click action to the my profile button
            @Override
            public void onClick(View view) {
                Intent intent_profile = new Intent(Activity_A.this, MyProfileActivity.class);
                startActivity(intent_profile);
            }
        });
    }
}
