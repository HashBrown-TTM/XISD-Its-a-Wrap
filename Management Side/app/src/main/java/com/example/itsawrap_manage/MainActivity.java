package com.example.itsawrap_manage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler(Looper.getMainLooper()).postDelayed(this::CheckUserLoggedIn, 1500);
    }

    private void CheckUserLoggedIn() {
        //Other code before this

        startActivity(new Intent(MainActivity.this, LoginScreen.class));
        finish();
    }
}