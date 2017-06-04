package com.example.group33.numbersgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class GameActivity extends AppCompatActivity {

    Button b_plus,b_minus,b_check;
    TextView tv_number,tv_title;

    int current_number,number_to_guess;
    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        r = new Random();
        number_to_guess = r.nextInt(51);

        b_check = (Button)findViewById(R.id.b_check);
        b_plus = (Button)findViewById(R.id.b_plus);
        b_minus = (Button)findViewById(R.id.button_minus);
        tv_number = (TextView)findViewById(R.id.tv_number);
        tv_title = (TextView)findViewById(R.id.tv_title);

        current_number = 0;
        tv_number.setText("" + current_number);

        b_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 if(current_number == number_to_guess){
                     tv_title.setText(R.string.text_congrats);
                 }else if(current_number > number_to_guess){
                     tv_title.setText("Down!");
                 }else if(current_number < number_to_guess){
                     tv_title.setText("Up!");
                 }

            }
        });


        b_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (current_number < 50) {


                    current_number++;

                }

                tv_number.setText("" + current_number);
            }
        });

        b_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (current_number > 0) {

                    current_number--;

                }

                tv_number.setText("" + current_number);

            }
        });


    }
}
