package com.example.baybayingame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class HistoryActivity extends AppCompatActivity {
    ImageButton backButton;

    MediaPlayer bgMusic;
    

    @Override
    protected void onPause() {
        super.onPause();
        bgMusic.release();
        finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.7) , (int) (height*.5));

        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER;
        params.x = 0;
        params.y = -20;

        getWindow().setAttributes(params);


        bgMusic = MediaPlayer.create(HistoryActivity.this, R.raw.historybg);
        bgMusic.setLooping(true);
        bgMusic.start();

        backButton = (ImageButton) findViewById(R.id.back);
        //to go to main activity

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadMainActivity = new Intent(HistoryActivity.this , MainActivity.class);
                startActivity(intentLoadMainActivity);
                finish();
            }
        });

    }



}