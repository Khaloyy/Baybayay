package com.example.baybayingame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class mcLevel extends AppCompatActivity {

    ImageButton backButton;

    ImageButton easyButton;

    ImageButton adeqButton;

    ImageButton hardButton;
    private boolean run;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mc_level);

        backButton = (ImageButton) findViewById(R.id.backbutton);
        easyButton = (ImageButton) findViewById(R.id.easy);
        adeqButton = (ImageButton) findViewById(R.id.adeq);
        hardButton = (ImageButton) findViewById(R.id.hard);

        easyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadMatchingActivity = new Intent(mcLevel.this , easyMatch.class);
                startActivity(intentLoadMatchingActivity);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                shutdown();
            }
        });
        adeqButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadMatchingActivity = new Intent(mcLevel.this , adeqMatch.class);
                startActivity(intentLoadMatchingActivity);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                shutdown();
            }
        });
        hardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadMatchingActivity = new Intent(mcLevel.this , hardMatch.class);
                startActivity(intentLoadMatchingActivity);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                shutdown();
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadMatchingActivity = new Intent(mcLevel.this , PilianActivity.class);
                startActivity(intentLoadMatchingActivity);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                finish();
                shutdown();
            }
        });



    }

    private void shutdown() {
        this.run = false;
    }
}