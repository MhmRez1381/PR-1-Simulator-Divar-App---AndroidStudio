package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void okclick1(View view) {
        Intent intent = new Intent(MainActivity.this, amlak.class);
        startActivity(intent);
    }

    public void okclick2(View view) {
        Intent intent = new Intent(MainActivity.this, car.class);
        startActivity(intent);
    }

    public void okclick3(View view) {
        Intent intent = new Intent(MainActivity.this, mobile.class);
        startActivity(intent);
    }
    public void okclick4(View view) {
        Intent intent = new Intent(MainActivity.this, sport.class);
        startActivity(intent);
    }
}