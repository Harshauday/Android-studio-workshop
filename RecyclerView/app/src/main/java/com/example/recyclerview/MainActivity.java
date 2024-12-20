package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    int images[]={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,
                  R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,
                  R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,
                  R.drawable.m,R.drawable.n,R.drawable.o,R.drawable.p};
    String names[]={"Arya","Bahubali","Chandramukhi","Darling","Eega",
               "Fidha","Gabber Singh","Happy Days","I","Jalsa","Kushi",
               "Love Story","Mr Majnu","Nannaku Prematho","Og","Pokiri"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.rv);
        MyAdapter adapter = new MyAdapter(this,names,images);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}