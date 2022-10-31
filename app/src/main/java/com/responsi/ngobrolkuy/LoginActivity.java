package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }
    public void onLogin(View view) {
        Intent login = new Intent(LoginActivity.this, ProfilePicActivity.class);
        startActivity(login);
    }

    public void onNoAccount(View view) {
        Intent noakun = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(noakun);
    }

    public void onForgotPass(View view) {
        Intent forgot = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
        startActivity(forgot);
    }
}