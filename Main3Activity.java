package com.example.childguess;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class Main3Activity extends AppCompatActivity {

    TextView tv_p1, tv_p2;
    ImageView iv_11, iv_12, iv_21, iv_22;// iv_23, iv_24, iv_31, iv_32, iv_33, iv_34;
    Integer[] cards_Array = {101, 102,  201, 202};
    int image101, image102, image201, image202;
    int firstcard, secondcard;
    int clickedfirstcard, clickedsecondcard;
    int cardnumber = 1;
    int turn = 1;
    int playerpoint = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);



        tv_p1 = (TextView) findViewById(R.id.t1);
        //tv_p2 = (TextView) findViewById(R.id.t2);

        iv_11 = (ImageView) findViewById(R.id.iv11);
        iv_12 = (ImageView) findViewById(R.id.iv12);
        //iv_13 = (ImageView) findViewById(R.id.iv13);
        //iv_14 = (ImageView) findViewById(R.id.iv14);


        iv_21 = (ImageView) findViewById(R.id.iv21);
        iv_22 = (ImageView) findViewById(R.id.iv22);
        /*iv_23 = (ImageView) findViewById(R.id.iv23);
        iv_24 = (ImageView) findViewById(R.id.iv24);


        iv_31 = (ImageView) findViewById(R.id.iv31);
        iv_32 = (ImageView) findViewById(R.id.iv32);
        iv_33 = (ImageView) findViewById(R.id.iv33);
        iv_34 = (ImageView) findViewById(R.id.iv34);
*/

        iv_11.setTag("0");
        iv_12.setTag("1");
        //  iv_13.setTag("2");
        //      iv_14.setTag("3");

        iv_21.setTag("2");
        iv_22.setTag("3");
        //  iv_23.setTag("6");
        //iv_24.setTag("7");


        //  iv_31.setTag("8");
        // iv_32.setTag("9");
        //iv_33.setTag("10");
        //   iv_34.setTag("11");
        frontofcardsResources();
        Collections.shuffle(Arrays.asList(cards_Array));
        //tv_p2.setTextColor(Color.GRAY);

        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_11, theCard);
            }
        });

        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_12, theCard);

            }
        });

/*        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_13, theCard);

            }
        });


        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_14, theCard);

            }
        });
*/

        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_21, theCard);

            }
        });


        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_22, theCard);

            }
        });/*
        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_23, theCard);

            }
        });
        iv_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_24, theCard);

            }
        });


        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_31, theCard);

            }
        });


        iv_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_32, theCard);

            }
        });
        iv_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_33, theCard);

            }
        });
        iv_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_34, theCard);

            }
        });*/
    }


    private void doStuff(ImageView iv, Integer card) {
        if (cards_Array[card] == 101) {
            iv.setImageResource(image101);
        } else if (cards_Array[card] == 102) {
            iv.setImageResource(image102);

        } else if (cards_Array[card] == 201) {
            iv.setImageResource(image201);

        } else if (cards_Array[card] == 202) {
            iv.setImageResource(image202);

        }

        if (cardnumber == 1) {
            firstcard = cards_Array[card];
            if (firstcard > 200) {
                firstcard = firstcard - 100;
            }
            cardnumber = 2;
            clickedfirstcard = card;

            iv.setEnabled(false);
        } else if (cardnumber == 2) {
            secondcard = cards_Array[card];
            if (secondcard > 200) {
                secondcard = secondcard - 100;
            }
            cardnumber = 1;
            clickedsecondcard = card;


            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
//            iv_13.setEnabled(false);
            //          iv_14.setEnabled(false);


            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
/*            iv_23.setEnabled(false);
            iv_24.setEnabled(false);


            iv_31.setEnabled(false);
            iv_32.setEnabled(false);
            iv_33.setEnabled(false);
            iv_34.setEnabled(false);
*/

            android.os.Handler handler = new android.os.Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            }, 1000);


        }

    }

    private void calculate() {
        if (firstcard == secondcard) {
            if (clickedfirstcard == 0) {
                iv_11.setVisibility(View.INVISIBLE);
            } else if (clickedfirstcard == 1) {
                iv_12.setVisibility(View.INVISIBLE);
            }/* else if (clickedfirstcard == 2) {
                iv_13.setVisibility(View.INVISIBLE);
            } else if (clickedfirstcard == 3) {
                iv_14.setVisibility(View.INVISIBLE);
            }*/ else if (clickedfirstcard == 2) {
                iv_21.setVisibility(View.INVISIBLE);
            } else if (clickedfirstcard == 3) {
                iv_22.setVisibility(View.INVISIBLE);
            }/* else if (clickedfirstcard == 6) {
                iv_23.setVisibility(View.INVISIBLE);
            } else if (clickedfirstcard == 7) {
                iv_24.setVisibility(View.INVISIBLE);
            } else if (clickedfirstcard == 8) {
                iv_31.setVisibility(View.INVISIBLE);
            } else if (clickedfirstcard == 9) {
                iv_32.setVisibility(View.INVISIBLE);
            } else if (clickedfirstcard == 10) {
                iv_33.setVisibility(View.INVISIBLE);
            } else if (clickedfirstcard == 11) {
                iv_34.setVisibility(View.INVISIBLE);
            }*/
        }


        if (firstcard == secondcard) {
            if (clickedsecondcard == 0) {
                iv_11.setVisibility(View.INVISIBLE);
            } else if (clickedsecondcard == 1) {
                iv_12.setVisibility(View.INVISIBLE);
            }/* else if (clickedsecondcard == 2) {
                iv_13.setVisibility(View.INVISIBLE);
            } else if (clickedsecondcard == 3) {
                iv_14.setVisibility(View.INVISIBLE);
            } */else if (clickedsecondcard == 2) {
                iv_21.setVisibility(View.INVISIBLE);
            } else if (clickedsecondcard == 3) {
                iv_22.setVisibility(View.INVISIBLE);
            }/* else if (clickedsecondcard == 6) {
                iv_23.setVisibility(View.INVISIBLE);
            } else if (clickedsecondcard == 7) {
                iv_24.setVisibility(View.INVISIBLE);
            } else if (clickedsecondcard == 8) {
                iv_31.setVisibility(View.INVISIBLE);
            } else if (clickedsecondcard == 9) {
                iv_32.setVisibility(View.INVISIBLE);
            } else if (clickedsecondcard == 10) {
                iv_33.setVisibility(View.INVISIBLE);
            } else if (clickedsecondcard == 11) {
                iv_34.setVisibility(View.INVISIBLE);
            }*/

            if (turn == 1) {
                playerpoint++;
                tv_p1.setText("P1 :" + playerpoint);
            } else if (turn == 2) {
                playerpoint++;
                //tv_p2.setText("P2 :" + cpupoint);
            }
        } else {
            iv_11.setImageResource(R.drawable.solve);
            iv_12.setImageResource(R.drawable.solve);
//            iv_13.setImageResource(R.drawable.fgh);
            //          iv_14.setImageResource(R.drawable.fgh);


            iv_21.setImageResource(R.drawable.solve);
            iv_22.setImageResource(R.drawable.solve);
/*            iv_23.setImageResource(R.drawable.fgh);
            iv_24.setImageResource(R.drawable.fgh);


            iv_31.setImageResource(R.drawable.fgh);
            iv_32.setImageResource(R.drawable.fgh);
            iv_33.setImageResource(R.drawable.fgh);
            iv_34.setImageResource(R.drawable.fgh);
*/
            if (turn == 1) {
                turn = 2;
                tv_p1.setTextColor(Color.GRAY);
                //tv_p2.setTextColor(Color.BLACK);
            } else if (turn == 2) {
                turn = 1;
                //tv_p2.setTextColor(Color.GRAY);
                tv_p1.setTextColor(Color.BLACK);


            }
        }
        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
//        iv_13.setEnabled(true);
        //      iv_14.setEnabled(true);


        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
/*        iv_23.setEnabled(true);
        iv_24.setEnabled(true);


        iv_31.setEnabled(true);
        iv_32.setEnabled(true);
        iv_33.setEnabled(true);
        iv_34.setEnabled(true);
*/
        checkEnd();


    }

    private void checkEnd() {
        if (iv_11.getVisibility() == View.INVISIBLE && iv_12.getVisibility() == View.INVISIBLE
                /*&& iv_13.getVisibility() == View.INVISIBLE && iv_14.getVisibility() == View.INVISIBLE */&& iv_21.getVisibility() == View.INVISIBLE && iv_22.getVisibility() == View.INVISIBLE/*
                && iv_23.getVisibility() == View.INVISIBLE && iv_24.getVisibility() == View.INVISIBLE && iv_31.getVisibility() == View.INVISIBLE && iv_32.getVisibility() == View.INVISIBLE
                && iv_33.getVisibility() == View.INVISIBLE && iv_34.getVisibility() == View.INVISIBLE*/) {
            AlertDialog.Builder alterdialogbuilder = new AlertDialog.Builder(Main3Activity.this);
            alterdialogbuilder.setMessage("GAME OVER\n"+"PLAYERS POINT ::"+playerpoint).setCancelable(false).setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
                    startActivity(intent);
                    finish();
                }
            }).setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            AlertDialog alertDialog = alterdialogbuilder.create();
            alertDialog.show();

        }
    }

    private void frontofcardsResources() {
        image101 = R.drawable.pone;
        image102 = R.drawable.ptwo;
        //image103 = R.drawable.ponecopy;
        //image104 = R.drawable.ptwocopy;
        //image105 = R.drawable.pfive;
        //image106 = R.drawable.psix;

        image201 = R.drawable.ponecopy;
        image202 = R.drawable.ptwocopy;
        //image203 = R.drawable.pthreecopy;
        //image204 = R.drawable.pfourcopy;
        //image205 = R.drawable.pfivecopy;
        //image206 = R.drawable.psixcopy;


    }
}