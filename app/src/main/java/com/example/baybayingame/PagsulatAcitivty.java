package com.example.baybayingame;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class PagsulatAcitivty extends AppCompatActivity {
    ImageButton backButton;

    ImageView bah,kah,dah,gah,hah,lah,mah,nah,ngah,pah,sah,tah,wah,yah, ah,eh,oh;



    private boolean run;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagsulat);


        bah = (ImageView)findViewById(R.id.ba);
        kah = (ImageView)findViewById(R.id.ka);
        dah = (ImageView)findViewById(R.id.da);
        gah = (ImageView)findViewById(R.id.ga);
        hah = (ImageView)findViewById(R.id.ha);
        lah = (ImageView)findViewById(R.id.la);
        mah = (ImageView)findViewById(R.id.ma);
        nah = (ImageView)findViewById(R.id.na);
        ngah = (ImageView)findViewById(R.id.nga);
        pah = (ImageView)findViewById(R.id.pa);
        sah = (ImageView)findViewById(R.id.sa);
        tah = (ImageView)findViewById(R.id.ta);
        wah = (ImageView)findViewById(R.id.wa);
        yah = (ImageView)findViewById(R.id.ya);
        ah = (ImageView)findViewById(R.id.a);
        eh = (ImageView)findViewById(R.id.ei);
        oh = (ImageView)findViewById(R.id.ou);

        backButton = (ImageButton) findViewById(R.id.backbutton);


        bah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.bgdown);
                showVideoPlayerAlertDialog(uri);

            }
        });
        kah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        dah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        gah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        hah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        lah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        nah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        ngah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        pah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        sah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        tah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        wah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        yah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        ah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        eh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
        oh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadMatchingActivity = new Intent(PagsulatAcitivty.this , PilianActivity.class);
                startActivity(intentLoadMatchingActivity);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                finish();
                shutdown();
            }
        });


    }


    // Function to show the video player dialog
    private void showVideoPlayerAlertDialog(Uri uri) {
        View alertCustomDialog = LayoutInflater.from(PagsulatAcitivty.this).inflate(R.layout.writing_vid, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(PagsulatAcitivty.this);
        builder.setCancelable(false);
        builder.setView(alertCustomDialog);

        ImageButton go_back = alertCustomDialog.findViewById(R.id.back);
        ImageButton replay = alertCustomDialog.findViewById(R.id.replay);

        AlertDialog alertDialog = builder.create();

        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        alertDialog.getWindow().getAttributes().windowAnimations = R.anim.scale_up;

        // Find the VideoView in the dialog layout
        VideoView videoView = alertCustomDialog.findViewById(R.id.videoView);

        // Set the video URI to the VideoView
        videoView.setVideoURI(uri);

        videoView.setOnErrorListener((mp, what, extra) -> {
            // Handle the error here
            Toast.makeText(this, "Error playing the video", Toast.LENGTH_SHORT).show();
            return true; // Return true to indicate that the error has been handled
        });

        // Create a MediaController and set it as
        // the anchor view for the VideoView
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.start();

        alertDialog.show();

        go_back.setOnClickListener(v -> {
            alertDialog.dismiss();

        });

        replay.setOnClickListener(v -> {
            // Pause and seek to the beginning
            videoView.pause();
            videoView.seekTo(0);
            videoView.start();
        });
    }

    private void shutdown() {
        this.run = false;
    }
}
