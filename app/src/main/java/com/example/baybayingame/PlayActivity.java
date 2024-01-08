package com.example.baybayingame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.VideoView;

public class PlayActivity extends AppCompatActivity {
    ImageButton backButton;
    ImageButton mtButton;
    ImageButton quizButton;

    ImageView head;

    MediaPlayer bgMusic;
    private boolean run;

    //bg music code



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.bgmain);
        videoView.setVideoURI(uri);
        videoView.start();


    }
}