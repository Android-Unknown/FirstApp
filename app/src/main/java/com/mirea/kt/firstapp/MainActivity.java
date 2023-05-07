package com.mirea.kt.firstapp;

import android.os.Bundle;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button startButton = findViewById(R.id.myBtnStart);
        startButton.setOnClickListener(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("firstApp_tag","Called onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("firstApp_tag","Called onResume");
        Toast.makeText(this,"Good start!",Toast.LENGTH_LONG)
                .show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("firstApp_tag","Called onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.println(Log.DEBUG,"firstApp_tag","Called onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("firstApp_tag","Called onDestroy");
    }


    @Override
    public void onClick(View v) {
        Log.d("firstApp_tag","Start button click");
    }
}

