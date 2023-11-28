package com.example.baybayingame;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class easyMatch extends AppCompatActivity {

    ImageView iv1, iv2, iv3, iv4, iv5, iv6;

    Integer[] cardsArray = {101, 102, 103,
            201, 202, 203};

    int img101, img102, img103, img201, img202, img203;

    int firstCard, SecondCard;

    int clickedFirst, clickedScnd;

    int cardNumber = 1;
    TextView TimeTextView;
    CountDownTimer countDownTimer;
    ImageButton backButton;
    private boolean run;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_match);

        iv1 = (ImageView) findViewById(R.id.iv1);
        iv2 = (ImageView) findViewById(R.id.iv2);
        iv3 = (ImageView) findViewById(R.id.iv3);
        iv4 = (ImageView) findViewById(R.id.iv4);
        iv5 = (ImageView) findViewById(R.id.iv5);
        iv6 = (ImageView) findViewById(R.id.iv6);


        backButton = (ImageButton) findViewById(R.id.backbutton);

        iv1.setTag("0");
        iv2.setTag("1");
        iv3.setTag("2");
        iv4.setTag("3");
        iv5.setTag("4");
        iv6.setTag("5");


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadPlayActivity = new Intent(easyMatch.this, mcLevel.class);
                startActivity(intentLoadPlayActivity);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                finish();
                shutdown();
            }
        });


        TimeTextView = findViewById(R.id.TimeTextView);
        countDownTimer = new CountDownTimer(16000, 1000) {
            @Override
            public void onTick(long l) {
                TimeTextView.setText(String.valueOf(l / 1000) + "s");
            }

            @Override
            public void onFinish() {
                openAlertbox();
            }
        }.start();


        //load the card images
        frontOfCardsResources();

        //shuffle the images
        Collections.shuffle(Arrays.asList(cardsArray));


        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv1, theCard);

            }
        });
        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv2, theCard);
            }
        });
        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv3, theCard);
            }
        });
        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv4, theCard);
            }
        });
        iv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv5, theCard);
            }
        });
        iv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv6, theCard);
            }
        });


    }

    private void openAlertbox() {

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(easyMatch.this);
        alertDialog
                .setMessage("Did not Finish..Time is up!!")
                .setCancelable(false)
                .setPositiveButton("New", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(getApplicationContext(), adeqMatch.class);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        finish();
                        shutdown();
                        countDownTimer.start();//restart the countdown timer
                    }
                })
                .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intentLoadPlayActivity = new Intent(easyMatch.this, mcLevel.class);
                        startActivity(intentLoadPlayActivity);
                        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                        shutdown();
                        finish();
                    }
                });

        AlertDialog ad = alertDialog.create();
        ad.show();

    }

    private void shutdown() {
        this.run = false;
    }
    private void doStuff(ImageView iv, int card) {
        //set the correct image to the image view
        if (cardsArray[card] == 101) {
            iv.setImageResource(img101);
        } else if (cardsArray[card] == 102) {
            iv.setImageResource(img102);
        } else if (cardsArray[card] == 103) {
            iv.setImageResource(img103);

        } else if (cardsArray[card] == 201) {
            iv.setImageResource(img201);
        } else if (cardsArray[card] == 202) {
            iv.setImageResource(img202);
        } else if (cardsArray[card] == 203) {
            iv.setImageResource(img203);
        }

        //check which image is selected and save it to temporary variable
        if (cardNumber == 1) {
            firstCard = cardsArray[card];
            if (firstCard > 200) {
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickedFirst = card;

            iv.setEnabled(false);

        } else if (cardNumber == 2) {
            SecondCard = cardsArray[card];
            if (SecondCard > 200) {
                SecondCard = SecondCard - 100;
            }
            cardNumber = 1;
            clickedScnd = card;

            iv1.setEnabled(false);
            iv2.setEnabled(false);
            iv3.setEnabled(false);
            iv4.setEnabled(false);
            iv5.setEnabled(false);
            iv6.setEnabled(false);


            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //check if the selected images are equal
                    calculate();
                }
            }, 1000);


        }
    }

    private void calculate() {
        // if image are equal remove to game
        if (firstCard == SecondCard) {
            if (clickedFirst == 0) {
                iv1.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 1) {
                iv2.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 2) {
                iv3.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 3) {
                iv4.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 4) {
                iv5.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 5) {
                iv6.setVisibility(View.INVISIBLE);
            }


            if (clickedScnd == 0) {
                iv1.setVisibility(View.INVISIBLE);
            } else if (clickedScnd == 1) {
                iv2.setVisibility(View.INVISIBLE);
            } else if (clickedScnd == 2) {
                iv3.setVisibility(View.INVISIBLE);
            } else if (clickedScnd == 3) {
                iv4.setVisibility(View.INVISIBLE);
            } else if (clickedScnd == 4) {
                iv5.setVisibility(View.INVISIBLE);
            } else if (clickedScnd == 5) {
                iv6.setVisibility(View.INVISIBLE);
            }


        } else {
            iv1.setImageResource(R.drawable.backcard);
            iv2.setImageResource(R.drawable.backcard);
            iv3.setImageResource(R.drawable.backcard);
            iv4.setImageResource(R.drawable.backcard);
            iv5.setImageResource(R.drawable.backcard);
            iv6.setImageResource(R.drawable.backcard);


        }
        iv1.setEnabled(true);
        iv2.setEnabled(true);
        iv3.setEnabled(true);
        iv4.setEnabled(true);
        iv5.setEnabled(true);
        iv6.setEnabled(true);


        //check if the Game is Over
        checkEnd();

    }

    private void checkEnd() {
        if (iv1.getVisibility() == View.INVISIBLE &&
                iv2.getVisibility() == View.INVISIBLE &&
                iv3.getVisibility() == View.INVISIBLE &&
                iv4.getVisibility() == View.INVISIBLE &&
                iv5.getVisibility() == View.INVISIBLE &&
                iv6.getVisibility() == View.INVISIBLE
        ) {

            countDownTimer.cancel();
            openPop();
        }
    }

    private void frontOfCardsResources() {
        img101 = R.drawable.ga;
        img102 = R.drawable.da;
        img103 = R.drawable.ma;


        img201 = R.drawable.ga;
        img202 = R.drawable.da;
        img203 = R.drawable.ma;


    }

    private void openPop() {
        View alertCustomDialog = LayoutInflater.from(easyMatch.this).inflate(R.layout.dialog_bx, null);

        AlertDialog.Builder builder = new AlertDialog.Builder(easyMatch.this);
        builder.setCancelable(false);
        builder.setView(alertCustomDialog);

        ImageButton newGame = alertCustomDialog.findViewById(R.id.Green_BT);
        ImageButton exit = alertCustomDialog.findViewById(R.id.Red_BT);

        AlertDialog alertDialog = builder.create();

        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        alertDialog.getWindow().getAttributes().windowAnimations = R.anim.scale_up;

        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER;
        params.x = 0;
        params.y = -20;

        // show your alert dialog
        alertDialog.show();

        newGame.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), easyMatch.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            finish();
            shutdown();
        });

        exit.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), mcLevel.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            finish();
            shutdown();

        });
    }
    
}