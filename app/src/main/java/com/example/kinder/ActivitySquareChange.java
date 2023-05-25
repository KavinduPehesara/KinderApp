package com.example.kinder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class ActivitySquareChange extends AppCompatActivity {

    ConstraintLayout btnstart,btnnext;
    ImageView img;
    EditText xvalue;
    //10749088
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square_change);

        btnstart = findViewById(R.id.startbtn);
        img = findViewById(R.id.square_color);
        xvalue = findViewById(R.id.getxvalue);
        btnnext = findViewById(R.id.nextbtn);

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ViewGroup.LayoutParams layoutParams = img.getLayoutParams();
                layoutParams.height = Integer.parseInt(xvalue.getText().toString());
                layoutParams.width = Integer.parseInt(xvalue.getText().toString());


                img.setLayoutParams(layoutParams);
            }
        });

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivitySquareChange.this,ActivitySquareTutorial.class);
                startActivity(intent);
            }
        });
    }
}
