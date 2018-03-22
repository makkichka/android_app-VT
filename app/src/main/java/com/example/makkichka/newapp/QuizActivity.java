package com.example.makkichka.newapp;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener {

        Integer[] im_question = {R.drawable.icon_izl3, R.drawable.icon_iz10, R.drawable.icon_iz6, R.drawable.icon_iz2};

        ArrayList pol_answers = new ArrayList();

        Integer i = 0;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        Button aAnswer = (Button) findViewById(R.id.btn_answer_a);
        Button bAnswer = (Button) findViewById(R.id.btn_answer_b);
        Button cAnswer = (Button) findViewById(R.id.btn_answer_c);
        Button dAnswer = (Button) findViewById(R.id.btn_answer_d);

        ChangeText(i);

        aAnswer.setOnClickListener(this);
        bAnswer.setOnClickListener(this);
        cAnswer.setOnClickListener(this);
        dAnswer.setOnClickListener(this);

        }

@Override
public void onClick(View v){
        TextView textQuestion = (TextView) findViewById(R.id.tv_question);

        switch (v.getId()) {
                case R.id.btn_answer_a:
                pol_answers.add("0");
                break;
                case R.id.btn_answer_b:
                pol_answers.add("1");
                break;
                case R.id.btn_answer_c:
                pol_answers.add("2");
                break;
                case R.id.btn_answer_d:
                pol_answers.add("3");
                break;
        }

        i++;
        if (i<4){
        ChangeText(i);
        } else {
        textQuestion.setText("");
        for (int j=0; j<pol_answers.size(); j++){
        textQuestion.append(pol_answers.get(j) + "\n");
        Toast.makeText(this,"урра",Toast.LENGTH_LONG);
        }
        }




        }

public void ChangeText(Integer integer){
        ImageView imgQuestion = (ImageView) findViewById(R.id.img_question);

        TextView textQuestion = (TextView) findViewById(R.id.tv_question);

        Button aAnswer = (Button) findViewById(R.id.btn_answer_a);
        Button bAnswer = (Button) findViewById(R.id.btn_answer_b);
        Button cAnswer = (Button) findViewById(R.id.btn_answer_c);
        Button dAnswer = (Button) findViewById(R.id.btn_answer_d);

        Resources res = getResources();
        String[] tx_question = res.getStringArray(R.array.tx_questions);
        String[] a_answer = res.getStringArray(R.array.a_answers);
        String[] b_answer = res.getStringArray(R.array.b_answers);
        String[] c_answer = res.getStringArray(R.array.c_answers);
        String[] d_answer = res.getStringArray(R.array.d_answers);

        imgQuestion.setImageResource(im_question[integer]);

        textQuestion.setText(tx_question[integer]);
        aAnswer.setText(a_answer[integer]);
        bAnswer.setText(b_answer[integer]);
        cAnswer.setText(c_answer[integer]);
        dAnswer.setText(d_answer[integer]);
        }


}
