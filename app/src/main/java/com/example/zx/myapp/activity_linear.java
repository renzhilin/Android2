package com.example.zx.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class activity_linear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
        Button returnback = (Button)  findViewById(R.id.returnback);
        returnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_linear.this, MainActivity .class );
                startActivity(intent);

            }
        });
        final LinearLayout activity_linear = findViewById(R.id.linear);
        Button qz = (Button)  findViewById(R.id.qz);
        qz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity_linear.setGravity(Gravity.LEFT);
            }
        });
        Button sp = (Button)  findViewById(R.id.sp);
        sp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity_linear.setOrientation(LinearLayout.HORIZONTAL);
            }
        });
        Button cz = (Button)  findViewById(R.id.cz);
        cz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity_linear.setOrientation(LinearLayout.VERTICAL);
            }
        });
    }
}
