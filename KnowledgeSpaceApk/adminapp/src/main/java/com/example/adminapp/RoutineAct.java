package com.example.adminapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RoutineAct extends AppCompatActivity {

    private Button routineBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine);

        routineBtn = findViewById(R.id.uploadRoutineBtn);
        uploadRoutine();
    }

    private void uploadRoutine() {
        routineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RoutineAct.this, "Uploading...", Toast.LENGTH_SHORT).show();
            }
        });
    }
}