package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SuccessForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_forgot_password);
    }
    public void onBalik(View view) {
        Intent balik = new Intent(SuccessForgotPasswordActivity.this, ForgotPasswordActivity.class);
        startActivity(balik);
    }

    public void onKembali(View view) {
        Intent kembali = new Intent(SuccessForgotPasswordActivity.this, LoginActivity.class);
        startActivity(kembali );
    }
}