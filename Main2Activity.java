package com.example.childguess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button bt3 = findViewById(R.id.easy);
        Button bt1 = findViewById(R.id.med);
        Button bt2 = findViewById(R.id.hi);

        bt3.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                openeasyGame();

            }
        });


        bt1.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                openmedGame();

            }
        });



        bt2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                opehiGame();

            }
        });

    }

    public void openeasyGame()
    {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }

    public void openmedGame()
    {
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }



    public void opehiGame()
    {
        Intent intent = new Intent(this, Main5Activity.class);
        startActivity(intent);
    }
}
