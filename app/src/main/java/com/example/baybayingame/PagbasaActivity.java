package com.example.baybayingame;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class PagbasaActivity extends AppCompatActivity {

    ImageButton backButton;
    ImageButton ei , a , ou ;
    ImageView ba , ka , da ,ga ,ha,la,ma,na,nga,pa,sa,ta,wa,ya;
    MediaPlayer bgMusic;

    protected void onPause() {
        super.onPause();
        bgMusic.release();
        finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagbasa);

        bgMusic = MediaPlayer.create(PagbasaActivity.this, R.raw.pagbabasa);
        bgMusic.setLooping(true);
        bgMusic.start();
        bgMusic.setVolume(0.3f, 0.3f);

        a = (ImageButton)findViewById(R.id.a);
        ei = (ImageButton)findViewById(R.id.ei);
        ou = (ImageButton)findViewById(R.id.ou);

        ba = (ImageView)findViewById(R.id.ba);
        ka = (ImageView)findViewById(R.id.ka);
        da = (ImageView)findViewById(R.id.da);
        ga = (ImageView)findViewById(R.id.ga);
        ha = (ImageView)findViewById(R.id.ha);
        la = (ImageView)findViewById(R.id.la);
        ma = (ImageView)findViewById(R.id.ma);
        na = (ImageView)findViewById(R.id.na);
        nga = (ImageView)findViewById(R.id.nga);
        pa = (ImageView)findViewById(R.id.pa);
        sa = (ImageView)findViewById(R.id.sa);
        ta = (ImageView)findViewById(R.id.ta);
        wa = (ImageView)findViewById(R.id.wa);
        ya = (ImageView)findViewById(R.id.ya);

        backButton = (ImageButton) findViewById(R.id.backbutton);


        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View alertCustomDialog = LayoutInflater.from(PagbasaActivity.this).inflate(R.layout.pagbasa_layout, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(PagbasaActivity.this);
                builder.setCancelable(false);
                builder.setView(alertCustomDialog);


                 
                ImageView iv2 =alertCustomDialog.findViewById(R.id.icon);

                iv2.setImageResource(R.drawable.asoicon);


                ImageButton go_back = alertCustomDialog.findViewById(R.id.back);


                AlertDialog alertDialog = builder.create();

                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                alertDialog.getWindow().getAttributes().windowAnimations = R.anim.scale_up;

                // show your alert dialog
                alertDialog.show();

                go_back.setOnClickListener(v -> {
                    alertDialog.dismiss();

                });

            }
        });

        ei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View alertCustomDialog = LayoutInflater.from(PagbasaActivity.this).inflate(R.layout.pagbasa_layout, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(PagbasaActivity.this);
                builder.setCancelable(false);
                builder.setView(alertCustomDialog);


                 
                ImageView iv2 =alertCustomDialog.findViewById(R.id.icon);

                iv2.setImageResource(R.drawable.elepanteicon);
                 

                ImageButton go_back = alertCustomDialog.findViewById(R.id.back);


                AlertDialog alertDialog = builder.create();

                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                alertDialog.getWindow().getAttributes().windowAnimations = R.anim.scale_up;

                // show your alert dialog
                alertDialog.show();

                go_back.setOnClickListener(v -> {
                    alertDialog.dismiss();

                });

            }
        });
        ou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View alertCustomDialog = LayoutInflater.from(PagbasaActivity.this).inflate(R.layout.pagbasa_layout, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(PagbasaActivity.this);
                builder.setCancelable(false);
                builder.setView(alertCustomDialog);


                 
                ImageView iv2 =alertCustomDialog.findViewById(R.id.icon);

                iv2.setImageResource(R.drawable.obraicon);
                 

                ImageButton go_back = alertCustomDialog.findViewById(R.id.back);


                AlertDialog alertDialog = builder.create();

                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                alertDialog.getWindow().getAttributes().windowAnimations = R.anim.scale_up;

                // show your alert dialog
                alertDialog.show();

                go_back.setOnClickListener(v -> {
                    alertDialog.dismiss();

                });

            }
        });

        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View alertCustomDialog = LayoutInflater.from(PagbasaActivity.this).inflate(R.layout.pagbasa_layout, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(PagbasaActivity.this);
                builder.setCancelable(false);
                builder.setView(alertCustomDialog);



                ImageView iv2 =alertCustomDialog.findViewById(R.id.icon);

                iv2.setImageResource(R.drawable.bataicon);


                ImageButton go_back = alertCustomDialog.findViewById(R.id.back);


                AlertDialog alertDialog = builder.create();

                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                alertDialog.getWindow().getAttributes().windowAnimations = R.anim.scale_up;

                // show your alert dialog
                alertDialog.show();

                go_back.setOnClickListener(v -> {
                    alertDialog.dismiss();

                });

            }
        });
        ka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View alertCustomDialog = LayoutInflater.from(PagbasaActivity.this).inflate(R.layout.pagbasa_layout, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(PagbasaActivity.this);
                builder.setCancelable(false);
                builder.setView(alertCustomDialog);


                 
                ImageView iv2 =alertCustomDialog.findViewById(R.id.icon);

                iv2.setImageResource(R.drawable.kabayoicon);
                 

                ImageButton go_back = alertCustomDialog.findViewById(R.id.back);


                AlertDialog alertDialog = builder.create();

                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                alertDialog.getWindow().getAttributes().windowAnimations = R.anim.scale_up;

                // show your alert dialog
                alertDialog.show();

                go_back.setOnClickListener(v -> {
                    alertDialog.dismiss();

                });

            }
        });
        da.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View alertCustomDialog = LayoutInflater.from(PagbasaActivity.this).inflate(R.layout.pagbasa_layout, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(PagbasaActivity.this);
                builder.setCancelable(false);
                builder.setView(alertCustomDialog);


                 
                ImageView iv2 =alertCustomDialog.findViewById(R.id.icon);

                iv2.setImageResource(R.drawable.dagaticon);
                 

                ImageButton go_back = alertCustomDialog.findViewById(R.id.back);


                AlertDialog alertDialog = builder.create();

                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                alertDialog.getWindow().getAttributes().windowAnimations = R.anim.scale_up;

                // show your alert dialog
                alertDialog.show();

                go_back.setOnClickListener(v -> {
                    alertDialog.dismiss();

                });

            }
        });
        ga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View alertCustomDialog = LayoutInflater.from(PagbasaActivity.this).inflate(R.layout.pagbasa_layout, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(PagbasaActivity.this);
                builder.setCancelable(false);
                builder.setView(alertCustomDialog);


                 
                ImageView iv2 =alertCustomDialog.findViewById(R.id.icon);

                iv2.setImageResource(R.drawable.gagambaicon);
                 

                ImageButton go_back = alertCustomDialog.findViewById(R.id.back);


                AlertDialog alertDialog = builder.create();

                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                alertDialog.getWindow().getAttributes().windowAnimations = R.anim.scale_up;

                // show your alert dialog
                alertDialog.show();

                go_back.setOnClickListener(v -> {
                    alertDialog.dismiss();

                });

            }
        });
        ha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View alertCustomDialog = LayoutInflater.from(PagbasaActivity.this).inflate(R.layout.pagbasa_layout, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(PagbasaActivity.this);
                builder.setCancelable(false);
                builder.setView(alertCustomDialog);


                 
                ImageView iv2 =alertCustomDialog.findViewById(R.id.icon);

                iv2.setImageResource(R.drawable.halamanicon);
                 

                ImageButton go_back = alertCustomDialog.findViewById(R.id.back);


                AlertDialog alertDialog = builder.create();

                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                alertDialog.getWindow().getAttributes().windowAnimations = R.anim.scale_up;

                // show your alert dialog
                alertDialog.show();

                go_back.setOnClickListener(v -> {
                    alertDialog.dismiss();

                });

            }
        });
        la.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View alertCustomDialog = LayoutInflater.from(PagbasaActivity.this).inflate(R.layout.pagbasa_layout, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(PagbasaActivity.this);
                builder.setCancelable(false);
                builder.setView(alertCustomDialog);


                 
                ImageView iv2 =alertCustomDialog.findViewById(R.id.icon);

                iv2.setImageResource(R.drawable.lamparaicon);
                 

                ImageButton go_back = alertCustomDialog.findViewById(R.id.back);


                AlertDialog alertDialog = builder.create();

                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                alertDialog.getWindow().getAttributes().windowAnimations = R.anim.scale_up;

                // show your alert dialog
                alertDialog.show();

                go_back.setOnClickListener(v -> {
                    alertDialog.dismiss();

                });

            }
        });
        ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View alertCustomDialog = LayoutInflater.from(PagbasaActivity.this).inflate(R.layout.pagbasa_layout, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(PagbasaActivity.this);
                builder.setCancelable(false);
                builder.setView(alertCustomDialog);


                 
                ImageView iv2 =alertCustomDialog.findViewById(R.id.icon);

                iv2.setImageResource(R.drawable.manokicon);
                 

                ImageButton go_back = alertCustomDialog.findViewById(R.id.back);


                AlertDialog alertDialog = builder.create();

                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                alertDialog.getWindow().getAttributes().windowAnimations = R.anim.scale_up;

                // show your alert dialog
                alertDialog.show();

                go_back.setOnClickListener(v -> {
                    alertDialog.dismiss();

                });

            }
        });
        na.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View alertCustomDialog = LayoutInflater.from(PagbasaActivity.this).inflate(R.layout.pagbasa_layout, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(PagbasaActivity.this);
                builder.setCancelable(false);
                builder.setView(alertCustomDialog);


                 
                ImageView iv2 =alertCustomDialog.findViewById(R.id.icon);

                iv2.setImageResource(R.drawable.hulogicon);
                 

                ImageButton go_back = alertCustomDialog.findViewById(R.id.back);


                AlertDialog alertDialog = builder.create();

                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                alertDialog.getWindow().getAttributes().windowAnimations = R.anim.scale_up;

                // show your alert dialog
                alertDialog.show();

                go_back.setOnClickListener(v -> {
                    alertDialog.dismiss();

                });

            }
        });
        nga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View alertCustomDialog = LayoutInflater.from(PagbasaActivity.this).inflate(R.layout.pagbasa_layout, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(PagbasaActivity.this);
                builder.setCancelable(false);
                builder.setView(alertCustomDialog);


                 
                ImageView iv2 =alertCustomDialog.findViewById(R.id.icon);

                iv2.setImageResource(R.drawable.ngayonicon);
                 

                ImageButton go_back = alertCustomDialog.findViewById(R.id.back);


                AlertDialog alertDialog = builder.create();

                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                alertDialog.getWindow().getAttributes().windowAnimations = R.anim.scale_up;

                // show your alert dialog
                alertDialog.show();

                go_back.setOnClickListener(v -> {
                    alertDialog.dismiss();

                });

            }
        });
        pa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View alertCustomDialog = LayoutInflater.from(PagbasaActivity.this).inflate(R.layout.pagbasa_layout, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(PagbasaActivity.this);
                builder.setCancelable(false);
                builder.setView(alertCustomDialog);


                 
                ImageView iv2 =alertCustomDialog.findViewById(R.id.icon);

                iv2.setImageResource(R.drawable.patingicon);
                 

                ImageButton go_back = alertCustomDialog.findViewById(R.id.back);


                AlertDialog alertDialog = builder.create();

                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                alertDialog.getWindow().getAttributes().windowAnimations = R.anim.scale_up;

                // show your alert dialog
                alertDialog.show();

                go_back.setOnClickListener(v -> {
                    alertDialog.dismiss();

                });

            }
        });
        sa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View alertCustomDialog = LayoutInflater.from(PagbasaActivity.this).inflate(R.layout.pagbasa_layout, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(PagbasaActivity.this);
                builder.setCancelable(false);
                builder.setView(alertCustomDialog);


                 
                ImageView iv2 =alertCustomDialog.findViewById(R.id.icon);

                iv2.setImageResource(R.drawable.sabadoicon);
                 

                ImageButton go_back = alertCustomDialog.findViewById(R.id.back);


                AlertDialog alertDialog = builder.create();

                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                alertDialog.getWindow().getAttributes().windowAnimations = R.anim.scale_up;

                // show your alert dialog
                alertDialog.show();

                go_back.setOnClickListener(v -> {
                    alertDialog.dismiss();

                });

            }
        });
        ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View alertCustomDialog = LayoutInflater.from(PagbasaActivity.this).inflate(R.layout.pagbasa_layout, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(PagbasaActivity.this);
                builder.setCancelable(false);
                builder.setView(alertCustomDialog);


                 
                ImageView iv2 =alertCustomDialog.findViewById(R.id.icon);

                iv2.setImageResource(R.drawable.tahiicon);
                 

                ImageButton go_back = alertCustomDialog.findViewById(R.id.back);


                AlertDialog alertDialog = builder.create();

                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                alertDialog.getWindow().getAttributes().windowAnimations = R.anim.scale_up;

                // show your alert dialog
                alertDialog.show();

                go_back.setOnClickListener(v -> {
                    alertDialog.dismiss();

                });

            }
        });
        wa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View alertCustomDialog = LayoutInflater.from(PagbasaActivity.this).inflate(R.layout.pagbasa_layout, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(PagbasaActivity.this);
                builder.setCancelable(false);
                builder.setView(alertCustomDialog);


                 
                ImageView iv2 =alertCustomDialog.findViewById(R.id.icon);

                iv2.setImageResource(R.drawable.waloicon);
                 

                ImageButton go_back = alertCustomDialog.findViewById(R.id.back);


                AlertDialog alertDialog = builder.create();

                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                alertDialog.getWindow().getAttributes().windowAnimations = R.anim.scale_up;

                // show your alert dialog
                alertDialog.show();

                go_back.setOnClickListener(v -> {
                    alertDialog.dismiss();

                });

            }
        });
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View alertCustomDialog = LayoutInflater.from(PagbasaActivity.this).inflate(R.layout.pagbasa_layout, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(PagbasaActivity.this);
                builder.setCancelable(false);
                builder.setView(alertCustomDialog);


                 
                ImageView iv2 =alertCustomDialog.findViewById(R.id.icon);

                iv2.setImageResource(R.drawable.yakapicon);
                 

                ImageButton go_back = alertCustomDialog.findViewById(R.id.back);


                AlertDialog alertDialog = builder.create();

                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                alertDialog.getWindow().getAttributes().windowAnimations = R.anim.scale_up;

                // show your alert dialog
                alertDialog.show();

                go_back.setOnClickListener(v -> {
                    alertDialog.dismiss();

                });

            }
        });


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadMatchingActivity = new Intent(PagbasaActivity.this , PilianActivity.class);
                startActivity(intentLoadMatchingActivity);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                finish();
            }
        });

    }
}