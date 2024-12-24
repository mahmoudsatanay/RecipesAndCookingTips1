package com.example.recipesandcookingtips;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }new handler ().postDelyed(new Runnable() {

        @Override
                public void run() {
            Intent intent = new Intent(SplashActivity.this,MainActivity.class);
            startActivities(intent);
            finish();

        },3000);
    }
}
