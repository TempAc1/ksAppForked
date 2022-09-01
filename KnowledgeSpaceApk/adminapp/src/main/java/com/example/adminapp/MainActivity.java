package com.example.adminapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.adminapp.AttendanceAct.AttendanceAct;
import com.example.adminapp.contactAct.ContactAct;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = new Intent(getApplicationContext(), AttendanceAct.class);
        startActivity(i);
    }
}