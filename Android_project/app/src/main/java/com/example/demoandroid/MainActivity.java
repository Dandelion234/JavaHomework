package com.example.demoandroid;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button01 = findViewById(R.id.button01);
        Button but02=findViewById(R.id.button02);
        but02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                but02.setText("okokok");
                but02.setBackgroundColor(Color.rgb(34,54,75));
            }
        });
        button01.setOnClickListener(v -> {
            Intent intent=new Intent();
            intent.setClass(MainActivity.this,InitActivity.class);
            startActivity(intent);
        });
    }
}
