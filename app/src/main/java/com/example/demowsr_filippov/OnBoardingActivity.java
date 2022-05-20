package com.example.demowsr_filippov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OnBoardingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);






    }

    public void openOnBoard2 (View view){
        Intent intent = new Intent(OnBoardingActivity.this, OnBoardingLoginSign.class);
        startActivity(intent);
    }
}