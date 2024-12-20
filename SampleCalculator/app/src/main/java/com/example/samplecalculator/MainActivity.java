package com.example.samplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1= (EditText) findViewById(R.id.e1);
        ed2= (EditText) findViewById(R.id.e2);
        tv= (TextView) findViewById(R.id.tex1);
    }

    public void add(View view) {
        int a=Integer.parseInt(ed1.getText().toString());
        int b=Integer.parseInt(ed2.getText().toString());
        int c=a+b;
        tv.setText(""+c);
    }

    public void sub(View view) {
        int a=Integer.parseInt(ed1.getText().toString());
        int b=Integer.parseInt(ed2.getText().toString());
        int c=a-b;
        tv.setText(""+c);
    }

    public void mult(View view) {
        int a=Integer.parseInt(ed1.getText().toString());
        int b=Integer.parseInt(ed2.getText().toString());
        int c=a*b;
        tv.setText(""+c);

    }

    public void div(View view) {
        int a=Integer.parseInt(ed1.getText().toString());
        int b=Integer.parseInt(ed2.getText().toString());
        int c=a/b;
        tv.setText(""+c);
    }

    public void modulo(View view) {
        int a=Integer.parseInt(ed1.getText().toString());
        int b=Integer.parseInt(ed2.getText().toString());
        int c=a%b;
        tv.setText(""+c);
    }

    public void clear(View view) {
        ed1.setText("");
        ed2.setText("");
        tv.setText("0");
    }
}
