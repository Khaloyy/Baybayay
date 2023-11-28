package com.example.baybayingame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;


public class PagsasalinActivity extends AppCompatActivity {

    ImageButton backButton;
    ImageButton toTranslate;
    TextView translated;
    EditText input;
    MediaPlayer bgMusic;
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
        setContentView(R.layout.activity_translator);



        bgMusic = MediaPlayer.create(PagsasalinActivity.this, R.raw.bg4);
        bgMusic.setLooping(true);
        bgMusic.start();

        backButton = (ImageButton) findViewById(R.id.back);
        input = (EditText) findViewById(R.id.toTranslate);
        translated = (TextView) findViewById(R.id.translated);


        input.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                translated.setText(input.getText());

            }
        });


        //to go to play activity
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadPlayActivity = new Intent(PagsasalinActivity.this , PilianActivity.class);
                startActivity(intentLoadPlayActivity);
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