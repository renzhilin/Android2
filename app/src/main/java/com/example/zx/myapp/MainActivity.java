package com.example.zx.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button linearbtn = (Button)  findViewById(R.id.linearbtn);
        linearbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, activity_linear .class );
                startActivity(intent);

            }
        });
        Button relativebtn = (Button)  findViewById(R.id.relativebtn);
        relativebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, activity_relative .class );
                startActivity(intent);

            }
        });
        Button framebtn = (Button)  findViewById(R.id.framebtn);
        framebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, activity_frame .class );
                startActivity(intent);

            }
        });
        Button tablebtn = (Button)  findViewById(R.id.tablebtn);
        tablebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, activity_table .class );
                startActivity(intent);

            }
        });
        Button gridbtn = (Button)  findViewById(R.id.gridbtn);
        gridbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, activity_grib .class );
                startActivity(intent);

            }
        });
    }
}
