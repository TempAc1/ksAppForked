package com.example.adminapp.GroupFragAdm.GrpQuizesAdm;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.example.adminapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Calendar;


public class QuizesMainScAdm extends Fragment {

    private RecyclerView parentRecVQuizesFragMainScAdm;
    private adapterRecVQuizesMainScAdm adapter;
    private ArrayList<dataModelRecVQuizesMainScAdm> dataHolder;

    private FloatingActionButton floatingActionBtnQuizeMainScAdm;
    private ImageView cancelBtnCusDiaQuiz;
    private Button proceedBtnCusDiaQuiz;
    private EditText setTotalQusCusDiaQuiz;
    private TextView setDurationCusDiaQuiz;
    private QuizData quizData = new QuizData();

    public QuizesMainScAdm() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = LayoutInflater.from(getContext())
                .inflate(R.layout.fragment_quizes_main_sc_adm, container, false);
        floatingActionBtnQuizeMainScAdm = view.findViewById(R.id.floatingActionBtnQuizeMainScAdm);
        parentRecVQuizesFragMainScAdm = view.findViewById(R.id.parentRecVQuizesFragMainScAdm);
        parentRecVQuizesFragMainScAdm.setLayoutManager(new LinearLayoutManager(getContext()));
        addObjToHolder();
        parentRecVQuizesFragMainScAdm.setAdapter(new adapterRecVQuizesMainScAdm(dataHolder));


        floatingActionBtnQuizeMainScAdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogBox();
            }
        });
        return view;
    }

    private void openDialogBox() {

    }

    private void addObjToHolder() {
        dataHolder = new ArrayList<>();
        QuizData obj = new QuizData();
        String time = obj.getQuizTime();
        String ques = obj.getQuizTotalQues();
        dataModelRecVQuizesMainScAdm obj1 = new dataModelRecVQuizesMainScAdm("IOT", ques,time);
        dataHolder.add(obj1);
        dataHolder.add(obj1);dataHolder.add(obj1);
        dataHolder.add(obj1);dataHolder.add(obj1);
        dataHolder.add(obj1);dataHolder.add(obj1);dataHolder.add(obj1);
        dataHolder.add(obj1);dataHolder.add(obj1);dataHolder.add(obj1);dataHolder.add(obj1);dataHolder.add(obj1);
    }
}