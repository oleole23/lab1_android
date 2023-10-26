package com.example.lab1;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;


public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Изменение цвета фона
        RelativeLayout rl = (RelativeLayout) findViewById(R.id.activity_second);
        String color = getIntent().getExtras().get("color").toString();
        rl.setBackgroundColor(Color.parseColor(color));
    }
}
