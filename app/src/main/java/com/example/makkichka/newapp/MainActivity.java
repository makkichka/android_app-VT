package com.example.makkichka.newapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void go(View view){
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }

    public  void practice(View view){
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }

}
