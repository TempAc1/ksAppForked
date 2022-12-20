package com.example.knowledgespaceapk.GroupAct.GrpQuizes;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.example.knowledgespaceapk.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Calendar;


public class QuizesMainSc extends Fragment {

    private RecyclerView parentRecVQuizesFragMainSc;
    private AdapterQuizMainSc adapter;
    private ArrayList<DataModelRecVQuizMainSc> dataHolder;

    private FloatingActionButton floatingActionBtnQuizeMainSc;
    private ImageView cancelBtnCusDiaQuiz;
    private Button proceedBtnCusDiaQuiz;
    private EditText setTotalQusCusDiaQuiz;
    private TextView setDurationCusDiaQuiz;
    private QuizData quizData = new QuizData();

    public QuizesMainSc() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = LayoutInflater.from(getContext())
                .inflate(R.layout.fragment_quizes_main_sc, container, false);
        floatingActionBtnQuizeMainSc = view.findViewById(R.id.floatingActionBtnQuizeMainSc);
        parentRecVQuizesFragMainSc = view.findViewById(R.id.parentRecVQuizesFragMainSc);
        parentRecVQuizesFragMainSc.setLayoutManager(new LinearLayoutManager(getContext()));
        addObjToHolder();
        parentRecVQuizesFragMainSc.setAdapter(new AdapterQuizMainSc(dataHolder));

        floatingActionBtnQuizeMainSc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogBox();
            }
        });

        return view;
    }

    private void openDialogBox() {
        Dialog dialog =  new Dialog(getActivity());
        dialog.setContentView(R.layout.custom_dialog_addquiz);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(false);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.animation;



        setTotalQusCusDiaQuiz = dialog.findViewById(R.id.setTotalQuesCusDiaQuiz);
        setDurationCusDiaQuiz = dialog.findViewById(R.id.setDurationCusDiaQuiz);

        setDurationCusDiaQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(setDurationCusDiaQuiz.getContext(), new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        setDurationCusDiaQuiz.setText( selectedHour + ":" + selectedMinute);
                    }
                }, hour, minute, true);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();
            }
        });


        cancelBtnCusDiaQuiz = dialog.findViewById(R.id.cancelBtnCusDiaAddQuiz);
        cancelBtnCusDiaQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                dialog.setCancelable(true);
            }
        });

        proceedBtnCusDiaQuiz = dialog.findViewById(R.id.postBtnCusDiaAddQuiz);
        proceedBtnCusDiaQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    quizData.setQuizTime(setDurationCusDiaQuiz.getText().toString());
                    Log.i("Duration ",quizData.getQuizTime());
                }catch (NumberFormatException e){
                    Toast.makeText(getContext(), "Invalid Time Format", Toast.LENGTH_SHORT).show();
                }

                try{
                    quizData.setQuizTotalQues(setTotalQusCusDiaQuiz.getText().toString());
                    Log.i("Ques : ", quizData.getQuizTotalQues());
                }catch (NumberFormatException e){
                    Toast.makeText(getContext(), "Invalid ques", Toast.LENGTH_SHORT).show();
                }
                dialog.setCancelable(true);
                dialog.dismiss();

                Bundle bundle = new Bundle();
                bundle.putString("duration", quizData.getQuizTime());
                bundle.putString("totalQ", quizData.getQuizTotalQues());
                Fragment fragment = new AddQuizQuesF();
                fragment.setArguments(bundle);
                FrameLayout fl = dialog.findViewById(R.id.frameLayGrpOverviewF);
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameLayGrpScHolderAct, fragment).commit();
                fragmentTransaction.addToBackStack(null);
            }
        });

        dialog.show();
    }

    private void addObjToHolder() {
        dataHolder = new ArrayList<>();
        QuizData obj = new QuizData();
        String time = obj.getQuizTime();
        String ques = obj.getQuizTotalQues();
        DataModelRecVQuizMainSc obj1 = new DataModelRecVQuizMainSc("IOT", ques,time);
        dataHolder.add(obj1);
        dataHolder.add(obj1);dataHolder.add(obj1);
        dataHolder.add(obj1);dataHolder.add(obj1);
        dataHolder.add(obj1);dataHolder.add(obj1);dataHolder.add(obj1);
        dataHolder.add(obj1);dataHolder.add(obj1);dataHolder.add(obj1);dataHolder.add(obj1);dataHolder.add(obj1);
    }
}