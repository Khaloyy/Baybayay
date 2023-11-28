package com.example.baybayingame;

import static android.system.Os.shutdown;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.ToggleButton;

public class settings extends AppCompatActivity {

    AudioManager audioManager;

    ImageButton backButton;


    SwitchCompat sound, vibrate;

    ImageView title;


    MediaPlayer bgMusic;

    SeekBar vol;


    SharedPreferences.Editor myEditor;
    private boolean run;


    @Override
    protected void onPause() {
        super.onPause();
        bgMusic.release();
        finish();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        SharedPreferences sharedPreferences = getSharedPreferences("save", MODE_PRIVATE);

        title = (ImageView) findViewById(R.id.sounds);
        bgMusic = MediaPlayer.create(settings.this, R.raw.bg4);
        bgMusic.setLooping(true); //to loop the bg music
        bgMusic.start();//start the bgmusic


        sound = findViewById(R.id.switchmute);

        audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);//to get the audio service in android

        int maxVol = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC); //set the max vol of the seekbar
        int currentVol = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC); //to get the current vol of the sound manager


        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setMax(maxVol);
        seekBar.setProgress(currentVol);

        backButton = (ImageButton) findViewById(R.id.back);

        sound.setChecked(sharedPreferences.getBoolean("value", true)); //save the instance made to the switch
        seekBar.setEnabled(sharedPreferences.getBoolean("able" , true));    //save the instance of the seekbar if muted the seekbar is disabled



        sound.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                //conditions in mute switch
                if (compoundButton.isChecked()) {
                    audioManager.adjustVolume(AudioManager.ADJUST_MUTE, AudioManager.FLAG_SHOW_UI);
                    SharedPreferences.Editor editor = getSharedPreferences("save", MODE_PRIVATE).edit();
                    editor.putBoolean("value", true);
                    editor.putBoolean("able" , false);
                    editor.apply(); //apply the boolean edited
                    editor.apply(); //apply the boolean edited


                    seekBar.setEnabled(false); //disable the seekbar
                    sound.setChecked(true);


                } else {

                    audioManager.adjustVolume(AudioManager.ADJUST_UNMUTE, AudioManager.FLAG_SHOW_UI);
                    SharedPreferences.Editor editor = getSharedPreferences("save", MODE_PRIVATE).edit();
                    editor.putBoolean("value", false);
                    editor.putBoolean("able" , true);
                    editor.putBoolean("text" ,true);
                    editor.apply();
                    editor.apply();
                    seekBar.setEnabled(true); //Enable the seekbar
                    sound.setChecked(false);


                }
            }
        });


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadPlayActivity = new Intent(settings.this, MainActivity.class);
                startActivity(intentLoadPlayActivity);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                finish();
                shutdown();
            }
        });

        //get seekbar progress
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    private void shutdown() {
        this.run = false;
    }


}