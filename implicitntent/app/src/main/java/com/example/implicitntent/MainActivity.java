package com.example.implicitntent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Google(View view) {
        Uri u = Uri.parse("https://www.google.co.in/");
                Intent i = new Intent(Intent.ACTION_VIEW,u);
                startActivity(i);
    }

    public void Dail(View view) {
        Uri s = Uri.parse("tel:6305385220");
        Intent i1 = new Intent(Intent.ACTION_VIEW,s);
        startActivity(i1);


    }

    public void Camera(View view) {
        Intent i2 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(i2);


    }
}