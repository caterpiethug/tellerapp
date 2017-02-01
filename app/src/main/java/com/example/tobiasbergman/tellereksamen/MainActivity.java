package com.example.tobiasbergman.tellereksamen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    int teller = 0;
    TextView tellerTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tellerTextView = (TextView) findViewById(R.id.tellerTextView);
        Button b1 = (Button) findViewById(R.id.btn1);
        Button b2 = (Button) findViewById(R.id.btn2);
        Button b3 = (Button) findViewById(R.id.btn3);
        Button b4 = (Button) findViewById(R.id.exitbtn);

        //onClick listeners for pluss, reset, minus og exit knapper

        b1.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                teller++;
                tellerTextView.setText(String.valueOf(teller));
            }
        });

        b2.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                teller = 0;
                tellerTextView.setText(String.valueOf(teller));
            }
        });

        b3.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                teller--;
                tellerTextView.setText(String.valueOf(teller));
            }
        });

        b4.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                finish();
                System.exit(0);
            }


        });
    }
}
