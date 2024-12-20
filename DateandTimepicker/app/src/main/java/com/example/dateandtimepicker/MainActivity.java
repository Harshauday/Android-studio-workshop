package com.example.dateandtimepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    int c_year,c_month,c_day;
    int c_hour,c_minute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calendar calendar = Calendar.getInstance();
        c_year = calendar.get(Calendar.YEAR);
        c_month = calendar.get(Calendar.MONTH);
        c_day = calendar.get(Calendar.DAY_OF_MONTH);
        c_hour = calendar.get(Calendar.HOUR);
        c_minute = calendar.get(Calendar.MINUTE);
    }

    public void date(View view) {
        DatePickerDialog dp = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                Toast.makeText(MainActivity.this,
                        "Date:"+i+"-"+(i1+1)+"-"+i2, Toast.LENGTH_SHORT).show();
            }
        },c_year,c_month,c_day);
        dp.show();

    }

    public void time(View view) {
        TimePickerDialog tp = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int i, int i1) {
                Toast.makeText(MainActivity.this,
                        "Time is : "+i+":"+i1,
                        Toast.LENGTH_SHORT).show();
            }
        },c_hour,c_minute,true);
        tp.show();
    }

    public void alert(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Alert!");
                builder.setMessage("Do you want to close this app");
                builder.setIcon(R.drawable.alert);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();

                    }
                });
                builder.show();

    }
}