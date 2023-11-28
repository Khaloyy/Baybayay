package com.example.baybayingame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class PlayActivity extends AppCompatActivity {
    ImageButton backButton;
    ImageButton mtButton;
    ImageButton quizButton;

    ImageView head;

    MediaPlayer bgMusic;
    private boolean run;

    //bg music code
    @Override
    protected void onPause() {
        super.onPause();
        bgMusic.release();
        finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        Fade fade = new Fade();
        View decor = getWindow().getDecorView();

        fade.excludeTarget(android.R.id.statusBarBackground,true);
        fade.excludeTarget(android.R.id.navigationBarBackground,true);

        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition(fade);



        bgMusic = MediaPlayer.create(PlayActivity.this, R.raw.bg3);
        bgMusic.setLooping(true);
        bgMusic.start();

        //naming variables
        head = (ImageView) findViewById(R.id.play);
        backButton = (ImageButton) findViewById(R.id.back);
        mtButton = (ImageButton) findViewById(R.id.matching);
        quizButton = (ImageButton) findViewById(R.id.quiz);

        //to go to matching type activity
        mtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadMatchingActivity = new Intent(PlayActivity.this , mcLevel.class);
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
                Intent intentLoadTranslateActivity = new Intent(PlayActivity.this , PagsusulitActivity.class);
                startActivity(intentLoadTranslateActivity);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                shutdown();
            }
        });


        //to go to Main activity
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadMatchingActivity = new Intent(PlayActivity.this , PilianActivity.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(PlayActivity.this,head, ViewCompat.getTransitionName(head));
                startActivity(intentLoadMatchingActivity , options.toBundle());

            }
        });
    }

    private void shutdown() {
        this.run = false;
    }
}