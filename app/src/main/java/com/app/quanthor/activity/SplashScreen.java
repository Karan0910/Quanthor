package com.app.quanthor.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.app.quanthor.R;

public class SplashScreen extends Activity {

    private int SPLASH_TIME_OUT=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        openMainActivity();

    }

    private void openMainActivity() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(SplashScreen.this,InitialScreen.class);
                startActivity(i);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
