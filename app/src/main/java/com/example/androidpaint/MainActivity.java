package com.example.androidpaint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MyDraw a = new MyDraw(this, null);
        a.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                float y = event.getY();
                float x = event.getX();
                MyDraw b = (MyDraw)v;
                b.x = x;
                b.y = y;
                return false;
            }
        });

        super.onCreate(savedInstanceState);

        setContentView(a);
        //setContentView(R.layout.activity_main);
    }

    }

