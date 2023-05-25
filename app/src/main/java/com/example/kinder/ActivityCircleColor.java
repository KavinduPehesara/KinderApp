package com.example.kinder;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class ActivityCircleColor extends AppCompatActivity {

    ConstraintLayout btnred, btngreen, btnblue, btnnext;
    ImageView img;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_color);

        btnred = findViewById(R.id.square_red_btn);
        btngreen = findViewById(R.id.square_green_btn);
        btnblue = findViewById(R.id.square_blue_btn);
        btnnext = findViewById(R.id.nextbtn);

        img = findViewById(R.id.square_color);

        String colorred = "#d60f0f";
        String colorgreen = "#048736";
        String colorblue = "#0f23d6";

        int red = Color.parseColor(colorred);
        int green = Color.parseColor(colorgreen);
        int blue = Color.parseColor(colorblue);

        btnred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setColorFilter(red);
            }
        });
        btnblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setColorFilter(blue);
            }
        });
        btngreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setColorFilter(green);
            }
        });

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityCircleColor.this,ActivityCricleChange.class);
                startActivity(intent);
            }
        });
    }
}
