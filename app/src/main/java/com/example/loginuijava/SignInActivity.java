package com.example.loginuijava;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        initViews();
    }

    private void initViews() {
        findViewById(R.id.tv_sign_up).setOnClickListener(v -> openSignUpPage());

        findViewById(R.id.btn_sign_in).setOnClickListener(v -> openHomeActivity());
    }

    private void openHomeActivity() {
        startActivity(new Intent(this, HomeActivity.class));
        finish();
    }

    private void openSignUpPage() {
        startActivity(new Intent(this, SignUpActivity.class));
        finish();
    }
}