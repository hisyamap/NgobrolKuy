package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
    }
    public void onBalik(View view) {
        Intent  balik = new Intent(ForgotPasswordActivity.this, LoginActivity.class);
        startActivity(balik);
    }
    public void onSubmit(View view) {
        Intent submit = new Intent(ForgotPasswordActivity.this, SuccessForgotPasswordActivity.class);
        startActivity(submit);
    }
}