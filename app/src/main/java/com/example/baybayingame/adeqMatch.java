package com.example.baybayingame;

import static android.system.Os.shutdown;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class adeqMatch extends AppCompatActivity {

    ImageView iv1, iv2, iv3, iv4, iv5, iv6, iv7, iv8, iv9, iv10, iv11, iv12;

    Integer[] cardsArray = {101, 102, 103, 104, 105, 106,
            201, 202, 203, 204, 205, 206};

    int img101, img102, img103, img104, img105, img106, img201, img202, img203, img204, img205, img206;

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
        setContentView(R.layout.activity_adeq_match);

        iv1 = (ImageView) findViewById(R.id.iv1);
        iv2 = (ImageView) findViewById(R.id.iv2);
        iv3 = (ImageView) findViewById(R.id.iv3);
        iv4 = (ImageView) findViewById(R.id.iv4);
        iv5 = (ImageView) findViewById(R.id.iv5);
        iv6 = (ImageView) findViewById(R.id.iv6);
        iv7 = (ImageView) findViewById(R.id.iv7);
        iv8 = (ImageView) findViewById(R.id.iv8);
        iv9 = (ImageView) findViewById(R.id.iv9);
        iv10 = (ImageView) findViewById(R.id.iv10);
        iv11 = (ImageView) findViewById(R.id.iv11);
        iv12 = (ImageView) findViewById(R.id.iv12);

        backButton = (ImageButton) findViewById(R.id.backbutton);

        iv1.setTag("0");
        iv2.setTag("1");
        iv3.setTag("2");
        iv4.setTag("3");
        iv5.setTag("4");
        iv6.setTag("5");
        iv7.setTag("6");
        iv8.setTag("7");
        iv9.setTag("8");
        iv10.setTag("9");
        iv11.setTag("10");
        iv12.setTag("11");


        TimeTextView = findViewById(R.id.TimeTextView);
        countDownTimer = new CountDownTimer(41000, 1000) {
            @Override
            public void onTick(long l) {
                TimeTextView.setText(String.valueOf(l / 1000) + "s");
            }

            @Override
            public void onFinish() {
                //DNF pop up
                View alertCustomDialog = LayoutInflater.from(adeqMatch.this).inflate(R.layout.dnf, null);

                AlertDialog.Builder builder = new AlertDialog.Builder(adeqMatch.this);
                builder.setCancelable(false);
                builder.setView(alertCustomDialog);


                ImageButton go_back = alertCustomDialog.findViewById(R.id.exit);
                ImageButton restart = alertCustomDialog.findViewById(R.id.restart);


                AlertDialog alertDialog = builder.create();

                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                alertDialog.getWindow().getAttributes().windowAnimations = R.anim.scale_up;

                // show your alert dialog
                alertDialog.show();

                restart.setOnClickListener(view -> {
                    Intent intent = new Intent(getApplicationContext(), easyMatch.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();
                    shutdown();
                } );

                go_back.setOnClickListener(v -> {
                    alertDialog.dismiss();

                });
            }
        }.start();

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadPlayActivity = new Intent(adeqMatch.this, mcLevel.class);
                startActivity(intentLoadPlayActivity);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                finish();
                shutdown();

            }
        });

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

        iv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv7, theCard);
            }
        });
        iv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv8, theCard);
            }
        });
        iv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv9, theCard);
            }
        });
        iv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv10, theCard);
            }
        });
        iv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv11, theCard);
            }
        });
        iv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv12, theCard);
            }
        });


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
        } else if (cardsArray[card] == 104) {
            iv.setImageResource(img104);
        } else if (cardsArray[card] == 105) {
            iv.setImageResource(img105);
        } else if (cardsArray[card] == 106) {
            iv.setImageResource(img106);
        } else if (cardsArray[card] == 201) {
            iv.setImageResource(img201);
        } else if (cardsArray[card] == 202) {
            iv.setImageResource(img202);
        } else if (cardsArray[card] == 203) {
            iv.setImageResource(img203);
        } else if (cardsArray[card] == 204) {
            iv.setImageResource(img204);
        } else if (cardsArray[card] == 205) {
            iv.setImageResource(img205);
        } else if (cardsArray[card] == 206) {
            iv.setImageResource(img206);
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
            iv7.setEnabled(false);
            iv8.setEnabled(false);
            iv9.setEnabled(false);
            iv10.setEnabled(false);
            iv11.setEnabled(false);
            iv12.setEnabled(false);


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
            } else if (clickedFirst == 6) {
                iv7.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 7) {
                iv8.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 8) {
                iv9.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 9) {
                iv10.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 10) {
                iv11.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 11) {
                iv12.setVisibility(View.INVISIBLE);
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
            } else if (clickedScnd == 6) {
                iv7.setVisibility(View.INVISIBLE);
            } else if (clickedScnd == 7) {
                iv8.setVisibility(View.INVISIBLE);
            } else if (clickedScnd == 8) {
                iv9.setVisibility(View.INVISIBLE);
            } else if (clickedScnd == 9) {
                iv10.setVisibility(View.INVISIBLE);
            } else if (clickedScnd == 10) {
                iv11.setVisibility(View.INVISIBLE);
            } else if (clickedScnd == 11) {
                iv12.setVisibility(View.INVISIBLE);
            }


        } else {
            iv1.setImageResource(R.drawable.backcard);
            iv2.setImageResource(R.drawable.backcard);
            iv3.setImageResource(R.drawable.backcard);
            iv4.setImageResource(R.drawable.backcard);
            iv5.setImageResource(R.drawable.backcard);
            iv6.setImageResource(R.drawable.backcard);
            iv7.setImageResource(R.drawable.backcard);
            iv8.setImageResource(R.drawable.backcard);
            iv9.setImageResource(R.drawable.backcard);
            iv10.setImageResource(R.drawable.backcard);
            iv11.setImageResource(R.drawable.backcard);
            iv12.setImageResource(R.drawable.backcard);


        }
        iv1.setEnabled(true);
        iv2.setEnabled(true);
        iv3.setEnabled(true);
        iv4.setEnabled(true);
        iv5.setEnabled(true);
        iv6.setEnabled(true);
        iv7.setEnabled(true);
        iv8.setEnabled(true);
        iv9.setEnabled(true);
        iv10.setEnabled(true);
        iv11.setEnabled(true);
        iv12.setEnabled(true);


        //check if the Game is Over
        checkEnd();

    }

    private void checkEnd() {
        if (iv1.getVisibility() == View.INVISIBLE &&
                iv2.getVisibility() == View.INVISIBLE &&
                iv3.getVisibility() == View.INVISIBLE &&
                iv4.getVisibility() == View.INVISIBLE &&
                iv5.getVisibility() == View.INVISIBLE &&
                iv6.getVisibility() == View.INVISIBLE &&
                iv7.getVisibility() == View.INVISIBLE &&
                iv8.getVisibility() == View.INVISIBLE &&
                iv9.getVisibility() == View.INVISIBLE &&
                iv10.getVisibility() == View.INVISIBLE &&
                iv11.getVisibility() == View.INVISIBLE &&
                iv12.getVisibility() == View.INVISIBLE) {

            countDownTimer.cancel();
            openPop();

        }
    }

    private void frontOfCardsResources() {
        img101 = R.drawable.ba;
        img102 = R.drawable.da;
        img103 = R.drawable.sa;
        img104 = R.drawable.la;
        img105 = R.drawable.ka;
        img106 = R.drawable.nga;


        img201 = R.drawable.ba;
        img202 = R.drawable.da;
        img203 = R.drawable.sa;
        img204 = R.drawable.la;
        img205 = R.drawable.ka;
        img206 = R.drawable.nga;


    }

    private void openPop() {
        View alertCustomDialog = LayoutInflater.from(adeqMatch.this).inflate(R.layout.dialog_bx, null);

        AlertDialog.Builder builder = new AlertDialog.Builder(adeqMatch.this);
        builder.setCancelable(false);
        builder.setView(alertCustomDialog);

        ImageButton newGame = alertCustomDialog.findViewById(R.id.restart);
        ImageButton exit = alertCustomDialog.findViewById(R.id.exit);

        AlertDialog alertDialog = builder.create();

        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        alertDialog.getWindow().getAttributes().windowAnimations = R.anim.scale_up;

        // show your alert dialog
        alertDialog.show();

        newGame.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), adeqMatch.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            shutdown();
            finish();
        });

        exit.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), mcLevel.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            shutdown();
            finish();

        });

    }

}