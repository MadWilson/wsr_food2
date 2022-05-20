package com.example.demowsr_filippov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OnBoardingLoginSign extends AppCompatActivity {
Button btn_sign_in, btn_sign_up;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding_login_sign);

        btn_sign_in = findViewById(R.id.btn_sign_in);
        btn_sign_up = findViewById(R.id.btn_sign_up);

        btn_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OnBoardingLoginSign.this, SignInActivity.class);
                startActivity(intent);
            }
        });
        btn_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(OnBoardingLoginSign.this, SignUpActivity.class);
                startActivity(intent1);
            }
        });


    }
    public void skipAuthorization (View view){
        Intent intent = new Intent(OnBoardingLoginSign.this, MainActivity.class);
        startActivity(intent);
    }
}