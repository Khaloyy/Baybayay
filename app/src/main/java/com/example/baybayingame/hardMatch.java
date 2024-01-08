package com.example.baybayingame;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;

public class hardMatch extends AppCompatActivity {

    ImageButton backButton;

    TextView TimeTextView;
    CountDownTimer countDownTimer;
    ImageView iv1, iv2, iv3, iv4, iv5, iv6, iv7, iv8, iv9, iv10, iv11, iv12, iv13, iv14, iv15, iv16, iv17, iv18, iv19, iv20, iv21, iv22, iv23, iv24;

    Integer[] cardsArray = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112,
            201, 202, 203, 204, 205, 206, 207, 208, 109, 210, 211, 212};

    int img101, img102, img103, img104, img105, img106, img107, img108, img109, img110, img111, img112,
            img201, img202, img203, img204, img205, img206, img207, img208, img209, img210, img211, img212;

    int firstCard, SecondCard;

    int clickedFirst, clickedScnd;

    int cardNumber = 1;

    int turn = 1;

    int p1Points = 0, p2Points = 0;

    TextView tvp1, tvp2;
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
        setContentView(R.layout.activity_hard_match);



        //bgmusic code
        bgMusic = MediaPlayer.create(hardMatch.this, R.raw.bgpagtutugma);
        bgMusic.setLooping(true);
        bgMusic.start();
        bgMusic.setVolume(0.3f, 0.3f);





        backButton = (ImageButton) findViewById(R.id.back);

        //Timer code
        TimeTextView = findViewById(R.id.TimeTextView);
        countDownTimer = new CountDownTimer(101000,1000) {
            @Override
            public void onTick(long l) {
                TimeTextView.setText(String.valueOf(l / 1000) + "s");
            }

            @Override
            public void onFinish() {
                //DNF pop up
                Toast.makeText(hardMatch.this, "Hindi mo natapos ", Toast.LENGTH_SHORT).show();

                Intent intentLoadPlayActivity = new Intent(hardMatch.this, mcLevel.class);
                startActivity(intentLoadPlayActivity);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                finish();
                shutdown();
                countDownTimer.cancel();
            }
        }.start();

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadPlayActivity = new Intent(hardMatch.this, mcLevel.class);
                startActivity(intentLoadPlayActivity);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                countDownTimer.cancel();
                finish();
                shutdown();

            }
        });


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
        iv13 = (ImageView) findViewById(R.id.iv13);
        iv14 = (ImageView) findViewById(R.id.iv14);
        iv15 = (ImageView) findViewById(R.id.iv15);
        iv16 = (ImageView) findViewById(R.id.iv16);
        iv17 = (ImageView) findViewById(R.id.iv17);
        iv18 = (ImageView) findViewById(R.id.iv18);
        iv19 = (ImageView) findViewById(R.id.iv19);
        iv20 = (ImageView) findViewById(R.id.iv20);
        iv21 = (ImageView) findViewById(R.id.iv21);
        iv22 = (ImageView) findViewById(R.id.iv22);
        iv23 = (ImageView) findViewById(R.id.iv23);
        iv24 = (ImageView) findViewById(R.id.iv24);


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
        iv13.setTag("12");
        iv14.setTag("13");
        iv15.setTag("14");
        iv16.setTag("15");
        iv17.setTag("16");
        iv18.setTag("17");
        iv19.setTag("18");
        iv20.setTag("19");
        iv21.setTag("20");
        iv22.setTag("21");
        iv23.setTag("22");
        iv24.setTag("23");

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
        iv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv13, theCard);
            }
        });
        iv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv14, theCard);
            }
        });
        iv15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv15, theCard);
            }
        });
        iv16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv16, theCard);
            }
        });
        iv17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv17, theCard);
            }
        });
        iv18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv18, theCard);
            }
        });
        iv19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv19, theCard);
            }
        });
        iv20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv20, theCard);
            }
        });
        iv21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv21, theCard);
            }
        });
        iv22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv22, theCard);
            }
        });
        iv23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv23, theCard);
            }
        });
        iv24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv24, theCard);
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
        } else if (cardsArray[card] == 107) {
            iv.setImageResource(img107);
        } else if (cardsArray[card] == 108) {
            iv.setImageResource(img108);
        } else if (cardsArray[card] == 109) {
            iv.setImageResource(img109);
        } else if (cardsArray[card] == 110) {
            iv.setImageResource(img110);
        } else if (cardsArray[card] == 111) {
            iv.setImageResource(img111);
        } else if (cardsArray[card] == 112) {
            iv.setImageResource(img112);
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
        } else if (cardsArray[card] == 207) {
            iv.setImageResource(img207);
        } else if (cardsArray[card] == 208) {
            iv.setImageResource(img208);
        } else if (cardsArray[card] == 209) {
            iv.setImageResource(img209);
        } else if (cardsArray[card] == 210) {
            iv.setImageResource(img210);
        } else if (cardsArray[card] == 211) {
            iv.setImageResource(img211);
        } else if (cardsArray[card] == 212) {
            iv.setImageResource(img212);
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
            iv13.setEnabled(false);
            iv14.setEnabled(false);
            iv15.setEnabled(false);
            iv16.setEnabled(false);
            iv17.setEnabled(false);
            iv18.setEnabled(false);
            iv19.setEnabled(false);
            iv20.setEnabled(false);
            iv21.setEnabled(false);
            iv22.setEnabled(false);
            iv23.setEnabled(false);
            iv24.setEnabled(false);

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
            } else if (clickedFirst == 12) {
                iv13.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 13) {
                iv14.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 14) {
                iv15.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 15) {
                iv16.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 16) {
                iv17.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 17) {
                iv18.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 18) {
                iv19.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 19) {
                iv20.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 20) {
                iv21.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 21) {
                iv22.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 22) {
                iv23.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 23) {
                iv24.setVisibility(View.INVISIBLE);
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
            } else if (clickedScnd == 12) {
                iv13.setVisibility(View.INVISIBLE);
            } else if (clickedScnd == 13) {
                iv14.setVisibility(View.INVISIBLE);
            } else if (clickedScnd == 14) {
                iv15.setVisibility(View.INVISIBLE);
            } else if (clickedScnd == 15) {
                iv16.setVisibility(View.INVISIBLE);
            } else if (clickedScnd == 16) {
                iv17.setVisibility(View.INVISIBLE);
            } else if (clickedScnd == 17) {
                iv18.setVisibility(View.INVISIBLE);
            } else if (clickedScnd == 18) {
                iv19.setVisibility(View.INVISIBLE);
            } else if (clickedScnd == 19) {
                iv20.setVisibility(View.INVISIBLE);
            } else if (clickedScnd == 20) {
                iv21.setVisibility(View.INVISIBLE);
            } else if (clickedScnd == 21) {
                iv22.setVisibility(View.INVISIBLE);
            } else if (clickedScnd == 22) {
                iv23.setVisibility(View.INVISIBLE);
            } else if (clickedScnd == 23) {
                iv24.setVisibility(View.INVISIBLE);
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
            iv13.setImageResource(R.drawable.backcard);
            iv14.setImageResource(R.drawable.backcard);
            iv15.setImageResource(R.drawable.backcard);
            iv16.setImageResource(R.drawable.backcard);
            iv17.setImageResource(R.drawable.backcard);
            iv18.setImageResource(R.drawable.backcard);
            iv19.setImageResource(R.drawable.backcard);
            iv20.setImageResource(R.drawable.backcard);
            iv21.setImageResource(R.drawable.backcard);
            iv22.setImageResource(R.drawable.backcard);
            iv23.setImageResource(R.drawable.backcard);
            iv24.setImageResource(R.drawable.backcard);


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
        iv13.setEnabled(true);
        iv14.setEnabled(true);
        iv15.setEnabled(true);
        iv16.setEnabled(true);
        iv17.setEnabled(true);
        iv18.setEnabled(true);
        iv19.setEnabled(true);
        iv20.setEnabled(true);
        iv21.setEnabled(true);
        iv22.setEnabled(true);
        iv23.setEnabled(true);
        iv24.setEnabled(true);

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
                iv12.getVisibility() == View.INVISIBLE &&
                iv13.getVisibility() == View.INVISIBLE &&
                iv14.getVisibility() == View.INVISIBLE &&
                iv15.getVisibility() == View.INVISIBLE &&
                iv16.getVisibility() == View.INVISIBLE &&
                iv17.getVisibility() == View.INVISIBLE &&
                iv18.getVisibility() == View.INVISIBLE &&
                iv19.getVisibility() == View.INVISIBLE &&
                iv20.getVisibility() == View.INVISIBLE &&
                iv21.getVisibility() == View.INVISIBLE &&
                iv22.getVisibility() == View.INVISIBLE &&
                iv23.getVisibility() == View.INVISIBLE &&
                iv24.getVisibility() == View.INVISIBLE) {

            countDownTimer.cancel();//if the game is finished the countdown timer is stopped
            openPop();
        }
    }

    //resources of the images to be match
    private void frontOfCardsResources() {
        img101 = R.drawable.ba;
        img102 = R.drawable.da;
        img103 = R.drawable.sa;
        img104 = R.drawable.ga;
        img105 = R.drawable.ha;
        img106 = R.drawable.ka;
        img107 = R.drawable.la;
        img108 = R.drawable.ma;
        img109 = R.drawable.na;
        img110 = R.drawable.nga;
        img111 = R.drawable.ta;
        img112 = R.drawable.pa;

        img201 = R.drawable.baicon;
        img202 = R.drawable.daicon;
        img203 = R.drawable.saicon;
        img204 = R.drawable.gaicon;
        img205 = R.drawable.haicon;
        img206 = R.drawable.kaicon;
        img207 = R.drawable.laicon;
        img208 = R.drawable.maicon;
        img209 = R.drawable.naicon;
        img210 = R.drawable.ngaicon;
        img211 = R.drawable.taicon;
        img212 = R.drawable.paicon;


    }
    private void openPop() {
        View alertCustomDialog = LayoutInflater.from(hardMatch.this).inflate(R.layout.dialog_bx, null);

        AlertDialog.Builder builder = new AlertDialog.Builder(hardMatch.this);
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
            Intent intent = new Intent(getApplicationContext(), hardMatch.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            finish();
            shutdown();
            alertDialog.dismiss();
        });

        exit.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), mcLevel.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            finish();
            shutdown();
            alertDialog.dismiss();

        });
    }

}





