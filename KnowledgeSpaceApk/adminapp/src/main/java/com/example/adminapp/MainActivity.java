package com.example.adminapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.adminapp.AttendanceAct.AttendanceAct;
import com.example.adminapp.SettingsAct.settingAct;
import com.example.adminapp.contactAct.ContactAct;

public class MainActivity extends AppCompatActivity {
    ImageView imgviewMainactAdm;
    TextView tVMainAct2Adm,textViewMainActAdm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgviewMainactAdm = findViewById(R.id.imgviewMainactAdm);
        tVMainAct2Adm = findViewById(R.id.tVMainAct2Adm);
        textViewMainActAdm = findViewById(R.id.textViewMainActAdm);

       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               hideAll();
               getSupportFragmentManager().beginTransaction()
                       .add(R.id.containerFragMainActAdm,new LoginScAdmFrag()).commit();
           }
       },1500);
    }

    private void hideAll() {
        imgviewMainactAdm.setVisibility(View.GONE);
        textViewMainActAdm.setVisibility(View.GONE);
        textViewMainActAdm.setVisibility(View.GONE);
    }
}