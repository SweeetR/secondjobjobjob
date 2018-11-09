package com.example.roy.secondjobjobjob;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random rnd = new Random();
    Button big, tiny, equal, getrnd;
    TextView answer, num1, num2;
    int inum1, inum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        big = (Button) findViewById(R.id.big);
        tiny = (Button) findViewById(R.id.tiny);
        equal = (Button) findViewById(R.id.equal);
        getrnd = (Button) findViewById(R.id.getrnd);

        answer = (TextView) findViewById(R.id.answer);
        num1 = (TextView) findViewById(R.id.num1);
        num2 = (TextView) findViewById(R.id.num2);
    }

    public void getnums(View view) {
        inum1 = rnd.nextInt(100);
        inum2 = rnd.nextInt(100);

        num1.setText("" + inum1);
        num2.setText("" + inum2);

        num1.setTextColor(Color.WHITE);
        num2.setTextColor(Color.WHITE);

        num1.setTextSize(20);
        num2.setTextSize(20);

    }

    public void tinyp(View view) {
        if (inum1 < inum2) {
            answer.setText("Result:True");
            answer.setTextColor(Color.GREEN);
            answer.setTextSize(25);}
         else {
            answer.setText("Result:False");
            answer.setTextColor(Color.RED);
            answer.setTextSize(25);}
        }



    public void equalp(View view) {
        if (inum1 == inum2) {
            answer.setText("Result:True");
            answer.setTextColor(Color.GREEN);
            answer.setTextSize(25);}
         else {
            answer.setText("Result:False");
            answer.setTextColor(Color.RED);
            answer.setTextSize(25);}
        }

    public void bigp (View view){
        if (inum1 > inum2) {
            answer.setText("Result:True");
            answer.setTextColor(Color.GREEN);
            answer.setTextSize(25);}
         else {
                answer.setText("Result:False");
                answer.setTextColor(Color.RED);
                answer.setTextSize(25);}

        }
    }



