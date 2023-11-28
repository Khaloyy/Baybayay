package com.example.baybayingame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class mcLevel extends AppCompatActivity {

    ImageButton backButton;

    Button madali , katamtaman , mahirap , tara;

    String selectedAns;
    private boolean run;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mc_level);

        backButton = (ImageButton) findViewById(R.id.backbutton);
        madali = (Button)findViewById(R.id.madali);
        katamtaman = (Button)findViewById(R.id.katamtaman);
        mahirap = (Button)findViewById(R.id.mahirap);
        tara = (Button)findViewById(R.id.Tara);

        tara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button clicked = (Button)view;

                String mad = (String) madali.getText();

                if (clicked.getId() == R.id.Tara) {
                        Intent intentLoadMatchingActivity = new Intent(mcLevel.this, easyMatch.class);
                        startActivity(intentLoadMatchingActivity);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        finish();
                        shutdown();
                    } else if (clicked.getId() == R.id.katamtaman) {
                        Intent intentLoadMatchingActivity = new Intent(mcLevel.this, adeqMatch.class);
                        startActivity(intentLoadMatchingActivity);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        finish();
                        shutdown();


                    } else if (clicked.getId() == R.id.mahirap) {
                        Intent intentLoadMatchingActivity = new Intent(mcLevel.this, hardMatch.class);
                        startActivity(intentLoadMatchingActivity);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        finish();
                        shutdown();


                    }
                }

        });
        madali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mahirap.setBackgroundColor(Color.parseColor("#00FFFFFF"));
                katamtaman.setBackgroundColor(Color.parseColor("#00FFFFFF"));
                madali.setBackgroundColor(Color.GREEN);

            }
        });
        katamtaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mahirap.setBackgroundColor(Color.parseColor("#00FFFFFF"));
                madali.setBackgroundColor(Color.parseColor("#00FFFFFF"));
                katamtaman.setBackgroundColor(Color.YELLOW);
            }
        });
        mahirap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                katamtaman.setBackgroundColor(Color.parseColor("#00FFFFFF"));
                madali.setBackgroundColor(Color.parseColor("#00FFFFFF"));
                mahirap.setBackgroundColor(Color.RED);
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadMatchingActivity = new Intent(mcLevel.this , PilianActivity.class);
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