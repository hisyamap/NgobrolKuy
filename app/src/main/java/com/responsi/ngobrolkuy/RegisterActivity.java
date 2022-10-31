package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void onRegister(View view) {
        Intent regis = new Intent(RegisterActivity.this, ProfilePicActivity.class);
        startActivity(regis);
    }

    public void onHaveAccount(View view) {
        Intent haveakun = new Intent(RegisterActivity.this, LoginActivity.class);
        startActivity(haveakun);
    }
}