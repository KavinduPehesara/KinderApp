package com.example.kinder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout btnsquare,btncircle,btntriangle,btnrectangle,btnpentagon,btnhexagon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsquare = findViewById(R.id.squarebtn);
        btncircle = findViewById(R.id.circlebtn);
        btntriangle = findViewById(R.id.trianglebtn);
        btnrectangle = findViewById(R.id.rectanglebtn);
        btnpentagon = findViewById(R.id.pentagonbtn);
        btnhexagon = findViewById(R.id.hexagonbtn);

        btnsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ActivitySquare.class);
                startActivity(intent);
            }
        });
        btncircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ActivityCircleColor.class);
                startActivity(intent);
            }
        });
        btntriangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityTriangleColor.class);
                startActivity(intent);
            }
        });
        btnrectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ActivityRectangleColor.class);
                startActivity(intent);
            }
        });
        btnhexagon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ActivityHexagonColor.class);
                startActivity(intent);
            }
        });
        btnpentagon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ActivityPentagonColor.class);
                startActivity(intent);
            }
        });
    }
}