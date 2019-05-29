package com.app.quanthor.activity;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;

import com.app.quanthor.R;
import com.app.quanthor.activity.adapter.IntialScreenAdapter;

public class InitialScreen extends AppCompatActivity {

    ViewPager viewPager;
    Button letGoBt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial_screen);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new IntialScreenAdapter(this));
        letGoBt=(Button)findViewById(R.id.let_go_bt);

        letGoBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(InitialScreen.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
