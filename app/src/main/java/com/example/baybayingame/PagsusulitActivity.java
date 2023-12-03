package com.example.baybayingame;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class PagsusulitActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton backButton;
    TextView TotalQuestions;
    TextView questions;
    Button ansa , ansb , ansc , ansd;
    Button submitBtn;

    int score = 0;
    int totalQ = questionAnswers.questions.length;
    int currentQuestionIndex = 0;
    String selectedAns = "";
    private boolean run;
    MediaPlayer bgMusic;

    int toastMessageId;
    protected void onPause() {
        super.onPause();
        bgMusic.pause();
        finish();

    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagsusulit);

        bgMusic = MediaPlayer.create(PagsusulitActivity.this, R.raw.bgpagsusulit);
        bgMusic.setLooping(true);
        bgMusic.start();

        TotalQuestions =  findViewById(R.id.totalq);
        questions =  findViewById(R.id.questions);
        ansa =  findViewById(R.id.ansa);
        ansb =  findViewById(R.id.ansb);
        ansc =  findViewById(R.id.ansc);
        ansd =  findViewById(R.id.ansd);
        submitBtn = findViewById(R.id.submit);

        backButton = (ImageButton) findViewById(R.id.back);

        ansa.setOnClickListener(this);
        ansb.setOnClickListener(this);
        ansc.setOnClickListener(this);
        ansd.setOnClickListener(this);
        submitBtn.setOnClickListener(this);


        loadNewQuestion();

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadMatchingActivity = new Intent(PagsusulitActivity.this , PilianActivity.class);
                startActivity(intentLoadMatchingActivity);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                finish();
            }
        });
    }

    @Override
    public void onClick(View view) {
        ansa.setBackgroundColor(Color.parseColor("#C2A472"));
        ansb.setBackgroundColor(Color.parseColor("#C2A472"));
        ansc.setBackgroundColor(Color.parseColor("#C2A472"));
        ansd.setBackgroundColor(Color.parseColor("#C2A472"));

        Button clicked = (Button)view;

        if (clicked.getId()==R.id.submit){
            if (selectedAns.equals(questionAnswers.correctAnswers[currentQuestionIndex])){
                toastMessageId = R.string.correct_answer;
                score++;
            }else {

                toastMessageId = R.string.wrong_answer;
            }
            Toast
                    .makeText(PagsusulitActivity.this, toastMessageId,
                            Toast.LENGTH_SHORT)
                    .show();
            //TotalQuestions.setText("Sagot sa kaninang tanong : " + questionAnswers.correctAnswers[currentQuestionIndex]);
            currentQuestionIndex ++;
            loadNewQuestion();
        }else{
        selectedAns = clicked.getText().toString();
        clicked.setBackgroundColor(Color.WHITE);

        }


    }
    void loadNewQuestion(){
        if (currentQuestionIndex == totalQ){
            finishQuiz();
            return;
        }
        questions.setText(questionAnswers.questions[currentQuestionIndex]);
        ansa.setText(questionAnswers.choices[currentQuestionIndex][0]);
        ansb.setText(questionAnswers.choices[currentQuestionIndex][1]);
        ansc.setText(questionAnswers.choices[currentQuestionIndex][2]);
        ansd.setText(questionAnswers.choices[currentQuestionIndex][3]);
    }
    void finishQuiz(){
        String status = "";
        if(score > totalQ*60){
            status = "You Passed";
        }else {
            status = "Failed";
        }

        String txtview =  "Your Score is " + score + " out of " + totalQ ;
        popconfirm(txtview);
    }

    private void shutdown() {
        this.run = false;
    }

    private void popconfirm(String txt){
        View alertCustomDialog = LayoutInflater.from(PagsusulitActivity.this).inflate(R.layout.confirmation, null);

        AlertDialog.Builder builder = new AlertDialog.Builder(PagsusulitActivity.this);
        builder.setCancelable(false);
        builder.setView(alertCustomDialog);



        TextView txtview = alertCustomDialog.findViewById(R.id.head);
        ImageButton no = alertCustomDialog.findViewById(R.id.no);
        ImageButton yes = alertCustomDialog.findViewById(R.id.yes);


        txtview.setText(txt);

        AlertDialog alertDialog = builder.create();

        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        alertDialog.getWindow().getAttributes().windowAnimations = R.anim.scale_up;

        // show your alert dialog
        alertDialog.show();

        yes.setOnClickListener(v -> {
            System.exit(1);



        });

        no.setOnClickListener(v -> {
            alertDialog.dismiss();

        });
    }
}




