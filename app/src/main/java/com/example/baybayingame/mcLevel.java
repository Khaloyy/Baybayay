package com.example.baybayingame;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class mcLevel extends AppCompatActivity implements View.OnClickListener {

    ImageButton backButton;

    Button madali , katamtaman , mahirap ;

    String selectedAns = "";
    private boolean run;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mc_level);

        backButton = (ImageButton) findViewById(R.id.backbutton);
        madali = (Button)findViewById(R.id.madali);
        katamtaman = (Button)findViewById(R.id.katamtaman);
        mahirap = (Button)findViewById(R.id.mahirap);


        madali.setOnClickListener(this);
        katamtaman.setOnClickListener(this);
        mahirap.setOnClickListener(this);


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

    public void onClick(View view) {


        Button clicked = (Button)view;

        if (clicked.getId() == R.id.madali){
            View alertCustomDialog = LayoutInflater.from(mcLevel.this).inflate(R.layout.confirmation, null);

            AlertDialog.Builder builder = new AlertDialog.Builder(mcLevel.this);
            builder.setCancelable(false);
            builder.setView(alertCustomDialog);


            ImageButton no = alertCustomDialog.findViewById(R.id.no);
            ImageButton yes = alertCustomDialog.findViewById(R.id.yes);


            AlertDialog alertDialog = builder.create();

            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            alertDialog.getWindow().getAttributes().windowAnimations = R.anim.scale_up;

            // show your alert dialog
            alertDialog.show();

            yes.setOnClickListener(v -> {
                Intent intentLoadMatchingActivity = new Intent(mcLevel.this, easyMatch.class);
                startActivity(intentLoadMatchingActivity);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                shutdown();



            });

            no.setOnClickListener(v -> {
                alertDialog.dismiss();

            });

        } else if (clicked.getId() == R.id.katamtaman) {
            View alertCustomDialog = LayoutInflater.from(mcLevel.this).inflate(R.layout.confirmation, null);

            AlertDialog.Builder builder = new AlertDialog.Builder(mcLevel.this);
            builder.setCancelable(false);
            builder.setView(alertCustomDialog);


            ImageButton no = alertCustomDialog.findViewById(R.id.no);
            ImageButton yes = alertCustomDialog.findViewById(R.id.yes);


            AlertDialog alertDialog = builder.create();

            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            alertDialog.getWindow().getAttributes().windowAnimations = R.anim.scale_up;

            // show your alert dialog
            alertDialog.show();

            yes.setOnClickListener(v -> {

                Intent intentLoadMatchingActivity = new Intent(mcLevel.this, adeqMatch.class);
                startActivity(intentLoadMatchingActivity);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                shutdown();


            });

            no.setOnClickListener(v -> {
                alertDialog.dismiss();

            });
        } else if (clicked.getId() == R.id.mahirap) {
            View alertCustomDialog = LayoutInflater.from(mcLevel.this).inflate(R.layout.confirmation, null);

            AlertDialog.Builder builder = new AlertDialog.Builder(mcLevel.this);
            builder.setCancelable(false);
            builder.setView(alertCustomDialog);


            ImageButton no = alertCustomDialog.findViewById(R.id.no);
            ImageButton yes = alertCustomDialog.findViewById(R.id.yes);


            AlertDialog alertDialog = builder.create();

            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            alertDialog.getWindow().getAttributes().windowAnimations = R.anim.scale_up;

            // show your alert dialog
            alertDialog.show();

            yes.setOnClickListener(v -> {

                Intent intentLoadMatchingActivity = new Intent(mcLevel.this, hardMatch.class);
                startActivity(intentLoadMatchingActivity);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
                shutdown();



            });

            no.setOnClickListener(v -> {
                alertDialog.dismiss();

            });

        }



    }

    private void shutdown() {
        this.run = false;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }



    }
