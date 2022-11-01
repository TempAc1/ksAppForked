package com.example.adminapp.GroupFragAdm;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.adminapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;


public class CourseSelectedFAdm extends Fragment {

    private RecyclerView recyclerVCourseSelectedOptAdm;
    private FloatingActionButton floatingBtnCourseSelectedOptAdm;
    private adapterRecVCourseSelectedFAdm adapter;
    private ArrayList<dataModelRecVCourseSelectedFAdm> dataHolder;


    public CourseSelectedFAdm() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_course_selected_f_adm, container, false);
        floatingBtnCourseSelectedOptAdm = view.findViewById(R.id.floatingBtnCourseSelectedOptAdm);
        recyclerVCourseSelectedOptAdm = view.findViewById(R.id.recyclerVCourseSelectedOptAdm);
        recyclerVCourseSelectedOptAdm.setLayoutManager(new LinearLayoutManager(getContext()));
        addObjToHolder();
        recyclerVCourseSelectedOptAdm.setAdapter(new adapterRecVCourseSelectedFAdm(dataHolder));
        return view;
    }

    private void addObjToHolder() {
        dataHolder = new ArrayList<>();
        dataModelRecVCourseSelectedFAdm obj1 = new dataModelRecVCourseSelectedFAdm("Blochain", 8);
        dataHolder.add(obj1);
        dataModelRecVCourseSelectedFAdm obj2 = new dataModelRecVCourseSelectedFAdm("Iot", 10);
        dataHolder.add(obj2);dataHolder.add(obj1);dataHolder.add(obj2);dataHolder.add(obj1);dataHolder.add(obj2);
        dataHolder.add(obj1);dataHolder.add(obj2);dataHolder.add(obj1);dataHolder.add(obj2);dataHolder.add(obj1);
        dataHolder.add(obj2);dataHolder.add(obj2);
    }
}