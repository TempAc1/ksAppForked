package com.example.knowledgespaceapk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class aluminadmin extends AppCompatActivity {
    private RecyclerView recyclerViewAttendanceAct;
    private ArrayList<dataModelRecVAttendanceAct> dataHolderAttendanceAct;
    private adapterRecVAttendanceAct itemAdapter;

    RecyclerView recyclerView = findViewById(R.id.recycler_view);
    recyclerView.setLayoutManager(new LinearLayoutManager(this));
    recyclerView.setAdapter(new MyAdapter());


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluminadmin);
    }
}