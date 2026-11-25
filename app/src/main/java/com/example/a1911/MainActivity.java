package com.example.a1911;

import android.os.Bundle;
import android.view.MotionEvent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {
    int start_x = 0;
    int end_x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                start_x = (int) event.getX();
                break;
            case MotionEvent.ACTION_UP:
                end_x = (int) event.getX();
                break;
        }

        if (start_x != 0 && end_x != 0) {
            if (start_x > end_x) {
                setContentView(R.layout.activity_main);
            } else if (start_x < end_x) {
                setContentView(R.layout.regin);
            }
            start_x = 0;
            end_x = 0;
        }
        return false;
    }
}