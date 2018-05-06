package com.example.zx.myapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class activity_frame extends AppCompatActivity {
    final int[] imageIds = new int[]
            {
                    R.drawable.a,
                    R.drawable.b,
                    R.drawable.c,
                    R.drawable.d,
                    R.drawable.e
            };
    int currentImageId = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        Button returnback = (Button) findViewById(R.id.returnback);
        returnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_frame.this, MainActivity.class);
                startActivity(intent);
            }
        });
        final ImageView display = (ImageView) findViewById(R.id.display);
        @SuppressLint("HandlerLeak") final Handler myHandler = new Handler()
        {
            public  void handleMessage(Message msg)
            {
                if (msg.what == 0x1233)
                {
                    display.setImageResource(imageIds[currentImageId++ % imageIds.length]);
                }
            }
        };
        new Timer().schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                myHandler.sendEmptyMessage(0x1233);
            }
        },0,150);
    }
}
