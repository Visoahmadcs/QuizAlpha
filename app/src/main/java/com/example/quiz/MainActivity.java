package com.example.quiz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button, button2, button3, button4;

    TextView tv_score, tv_question;

    Questions mQuestions = new Questions();

    private String mAnswer;
    private int mScore = 0;
    private int Questionlength = mQuestions.mQuestion.length;


    Random number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        number = new Random();

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

        tv_question = findViewById(R.id.textView2);
        tv_score = findViewById(R.id.textView);

        tv_score.setText("Your Score is " + mScore);
        updateQuestion(number.nextInt(Questionlength));
        //button.setText(""+mQuestions.getmQuestion());
        //tv_question.setText(mQuestions.mQuestion[2]);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button.getText() == mAnswer) {
                    mScore++;
                    updateQuestion(number.nextInt(Questionlength));
                    tv_score.setText("Your Score is " + mScore);
                } else {
                    gameOver();
                }
                //tv_question.setText("1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (button2.getText() == mAnswer) {
                    mScore++;
                    updateQuestion(number.nextInt(Questionlength));
                    tv_score.setText("Your Score is " + mScore);
                } else {
                    gameOver();
                }
                //tv_question.setText("2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button3.getText() == mAnswer) {
                    mScore++;
                    updateQuestion(number.nextInt(Questionlength));
                    tv_score.setText("Your Score is " + mScore);
                } else {
                    gameOver();
                }
                //tv_question.setText("3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button4.getText() == mAnswer) {
                    mScore++;
                    updateQuestion(number.nextInt(Questionlength));
                    tv_score.setText("Your Score is " + mScore);
                } else {
                    gameOver();

                }
                //tv_question.setText("4");
            }
        });


    }


    private void updateQuestion(int nextInt) {
        tv_question.setText(mQuestions.getQuestion(nextInt));
        button.setText(mQuestions.getChoice1(nextInt));
        button2.setText(mQuestions.getChoice2(nextInt));
        button3.setText(mQuestions.getChoice3(nextInt));
        button4.setText(mQuestions.getchoice4(nextInt));

        mAnswer = mQuestions.getCorrectAnswer(nextInt);
    }

    private void gameOver() {

        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);


        alert.setMessage("Game is Over \n Your score is " + mScore + " points");
        alert.setCancelable(false);
        alert.setPositiveButton("Play Again", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });

        alert.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alert.show();

    }
}
