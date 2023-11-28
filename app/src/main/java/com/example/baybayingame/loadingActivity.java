package com.example.baybayingame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class loadingActivity extends AppCompatActivity {
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

       handler = new Handler();
       handler.postDelayed(new Runnable() {
           @Override
           public void run() {
               Intent intentLoadMainActivity = new Intent( loadingActivity.this , MainActivity.class);
               startActivity(intentLoadMainActivity);
               overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
               finish();
           }
       },3000);
    }
}