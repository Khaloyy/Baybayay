package com.example.baybayingame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ModuleActivity extends AppCompatActivity {

        ImageButton translateButton;
        ImageButton alphabetButton;
        ImageButton backButton;
    private boolean run;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module);



        translateButton = (ImageButton) findViewById(R.id.translate);
        alphabetButton = (ImageButton) findViewById(R.id.alphabet);
        backButton = (ImageButton) findViewById(R.id.back);

        translateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadMatchingActivity = new Intent(ModuleActivity.this , PagsasalinActivity.class);
                startActivity(intentLoadMatchingActivity);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                shutdown();
            }
        });
        alphabetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadMatchingActivity = new Intent(ModuleActivity.this , PagsulatAcitivty.class);
                startActivity(intentLoadMatchingActivity);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                shutdown();
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadMatchingActivity = new Intent(ModuleActivity.this , PilianActivity.class);
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