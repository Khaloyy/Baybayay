package com.example.baybayingame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.VideoView;

public class PilianActivity extends AppCompatActivity {

    ImageButton mtButton;
    ImageButton quizButton;
    ImageButton translateButton;
    ImageButton pagsulatbutton;
    ImageButton pagbasaButton;
        ImageButton backButton;

        VideoView videoView;
    private boolean run;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picking);



        backButton = (ImageButton) findViewById(R.id.backbutton);
        mtButton = (ImageButton) findViewById(R.id.matching);
        quizButton = (ImageButton) findViewById(R.id.quiz);
        translateButton = (ImageButton) findViewById(R.id.translate);
        pagbasaButton = (ImageButton) findViewById(R.id.pagbasa);
        pagsulatbutton = (ImageButton) findViewById(R.id.pagsulat);


        mtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadMatchingActivity = new Intent(PilianActivity.this , mcLevel.class);
                startActivity(intentLoadMatchingActivity);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                shutdown();
            }
        });
        //to go to translation activity
        quizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadTranslateActivity = new Intent(PilianActivity.this , PagsusulitActivity.class);
                startActivity(intentLoadTranslateActivity);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                shutdown();
            }
        });
        translateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadMatchingActivity = new Intent(PilianActivity.this , PagsasalinActivity.class);
                startActivity(intentLoadMatchingActivity);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                shutdown();
            }
        });
        pagbasaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadMatchingActivity = new Intent(PilianActivity.this , PagbasaActivity .class);
                startActivity(intentLoadMatchingActivity);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                shutdown();
            }
        });

        pagsulatbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadMatchingActivity = new Intent(PilianActivity.this , PagsulatAcitivty.class);
                startActivity(intentLoadMatchingActivity);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                shutdown();
            }
        });


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadMatchingActivity = new Intent(PilianActivity.this , MainActivity.class);
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