package com.example.countapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  TextView tv;
  int c=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv= (TextView) findViewById(R.id.tex1);
    }

    public void toast(View view) {
        Toast.makeText(this, "Welcome",
                Toast.LENGTH_SHORT).show();
    }

    public void count(View view) {
        c++;
        tv.setText(""+c);
    }
}