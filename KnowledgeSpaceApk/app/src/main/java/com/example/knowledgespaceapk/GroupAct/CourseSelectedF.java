package com.example.knowledgespaceapk.GroupAct;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.knowledgespaceapk.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;


public class CourseSelectedF extends Fragment {

    private RecyclerView recyclerVCourseSelectedOpt;
    private TextView addModuleTvCourseSelectedF,addCourseTvCourseSelectedF,
            autoCompleteTvDropDownSpinnerAddModuleDia,moduleAttachmentTvCusDiaAddModule;
    private FloatingActionButton floatingBtnCourseSelectedOpt,addModuleFloatingBtnCourseSelectedF,addCourseFloatingBtnCourseSelectedF;
    private AdapterCourseSelectedF adapter;
    private ArrayList<DataModelCourseSelectedF> dataHolder;
    private boolean isBtnVisible = false;
    private ImageView cancelBtnAddCourseDialog,cancelBtnCusDiaAddModule;
    private Button addCourseBtnCusDiaAddCourse;
    private String[] courseAvailable = new String[] {"A.I","Blockchain","Data Science","Maths","Physics"};
    private ArrayAdapter<String> stringArrayAdapter;
    private Button addModuleBtnCusDiaAddModule;

    public CourseSelectedF() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_course_selected, container, false);

        floatingBtnCourseSelectedOpt = view.findViewById(R.id.floatingBtnCourseSelectedOpt);
        addCourseFloatingBtnCourseSelectedF = view.findViewById(R.id.addCourseFloatingBtnCourseSelectedF);
        addCourseTvCourseSelectedF = view.findViewById(R.id.addCourseTvCourseSelectedF);
        addModuleFloatingBtnCourseSelectedF = view.findViewById(R.id.addModuleFloatingBtnCourseSelectedF);
        addModuleTvCourseSelectedF = view.findViewById(R.id.addModuleTvCourseSelectedF);


        recyclerVCourseSelectedOpt = view.findViewById(R.id.recyclerVCourseSelectedOpt);
        recyclerVCourseSelectedOpt.setLayoutManager(new LinearLayoutManager(getContext()));
        addObjToHolder();
        recyclerVCourseSelectedOpt.setAdapter(new AdapterCourseSelectedF(dataHolder));

        floatingBtnCourseSelectedOpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setBtnVisibility();
            }
        });

        addCourseFloatingBtnCourseSelectedF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAddCourseDialog();
            }
        });

        addModuleFloatingBtnCourseSelectedF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAddModuleDialog();
            }
        });


        return view;
    }

    private void openAddModuleDialog() {
        Dialog dialog =  new Dialog(getActivity());
        dialog.setContentView(R.layout.cus_dia_addmodule_courseselected_f);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.animation;

        //Code for dropdown spinner
        autoCompleteTvDropDownSpinnerAddModuleDia = dialog.findViewById(R.id.autoCompleteTvDropDownSpinnerAddModuleDia);
        stringArrayAdapter = new ArrayAdapter<>(dialog.getContext(),R.layout.course_name_dropdown_item_addmodule_f,
                courseAvailable);

//        autoCompleteTvDropDownSpinnerAddModuleDia.addTextChangedListener((TextWatcher) dialog.getContext());
        //autoCompleteTvDropDownSpinnerAddModuleDia

        //Code For Add Attachment of Module:
        moduleAttachmentTvCusDiaAddModule = dialog.findViewById(R.id.moduleAttachmentTvCusDiaAddModule);
        moduleAttachmentTvCusDiaAddModule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int PICKFILE_RESULT_CODE=20;
                Intent acessFilesIntent = new Intent(Intent.ACTION_GET_CONTENT);
                acessFilesIntent.setType("*/*");
                startActivityForResult(acessFilesIntent,PICKFILE_RESULT_CODE);
            }
        });

        //Code for Dialog Cancel Btn
        addModuleBtnCusDiaAddModule = dialog.findViewById(R.id.addModuleBtnCusDiaAddModule);
        cancelBtnCusDiaAddModule = dialog.findViewById(R.id.cancelBtnCusDiaAddDiscussion);

        cancelBtnCusDiaAddModule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                dialog.setCancelable(true);
            }
        });
        addModuleBtnCusDiaAddModule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.setCancelable(true);
                dialog.dismiss();
                Toast.makeText(getActivity(), "Posting...", Toast.LENGTH_SHORT).show();
            }
        });
        dialog.show();
    }

    private void openAddCourseDialog() {
        Dialog dialog =  new Dialog(getActivity());
        dialog.setContentView(R.layout.cus_dia_addcourse_courseselected_f);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.animation;

        //Code for Dialog Cancel Btn
        addCourseBtnCusDiaAddCourse = dialog.findViewById(R.id.postBtnCusDiaDisPanelMainScF);
        cancelBtnAddCourseDialog = dialog.findViewById(R.id.cancelBtnCusDiaAddDiscussion);

        cancelBtnAddCourseDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                dialog.setCancelable(true);
            }
        });
        addCourseBtnCusDiaAddCourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.setCancelable(true);
                dialog.dismiss();
                Toast.makeText(getActivity(), "Posting...", Toast.LENGTH_SHORT).show();
            }
        });
        dialog.show();
    }

    private void setBtnVisibility() {
        if (!isBtnVisible) {
            addCourseFloatingBtnCourseSelectedF.setVisibility(View.VISIBLE);
            addCourseTvCourseSelectedF.setVisibility(View.VISIBLE);
            addModuleFloatingBtnCourseSelectedF.setVisibility(View.VISIBLE);
            addModuleTvCourseSelectedF.setVisibility(View.VISIBLE);
            isBtnVisible = true;
        } else {
            addCourseFloatingBtnCourseSelectedF.setVisibility(View.GONE);
            addCourseTvCourseSelectedF.setVisibility(View.GONE);
            addModuleFloatingBtnCourseSelectedF.setVisibility(View.GONE);
            addModuleTvCourseSelectedF.setVisibility(View.GONE);
            isBtnVisible = false;
        }
    }

    private void addObjToHolder() {
        dataHolder = new ArrayList<>();
        DataModelCourseSelectedF obj1 = new DataModelCourseSelectedF("Blochain", 8);
        dataHolder.add(obj1);
        DataModelCourseSelectedF obj2 = new DataModelCourseSelectedF("Iot", 10);
        dataHolder.add(obj2);dataHolder.add(obj1);dataHolder.add(obj2);dataHolder.add(obj1);dataHolder.add(obj2);
        dataHolder.add(obj1);dataHolder.add(obj2);dataHolder.add(obj1);dataHolder.add(obj2);dataHolder.add(obj1);
        dataHolder.add(obj2);dataHolder.add(obj2);
    }
}