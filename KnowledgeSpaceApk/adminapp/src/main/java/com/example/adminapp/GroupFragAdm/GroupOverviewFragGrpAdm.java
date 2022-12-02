package com.example.adminapp.GroupFragAdm;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
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
import com.example.adminapp.GroupFragAdm.GrpQuizesAdm.AddQuizQuesFAdm;
import com.example.adminapp.GroupFragAdm.GrpQuizesAdm.QuizData;
import com.example.adminapp.R;
import java.util.Calendar;


public class GroupOverviewFragGrpAdm extends Fragment {

    private TextView grpTitleCardVDetailsGrpOverviewAdm,grpShortDescCardVDetailsGrpOverviewAdm,
            grpAdminNameCardVDetailsGrpOverviewAdm,grpOption1GrpOverviewFrag,grpOption2GrpOverviewFrag,
            grpOption3GrpOverviewFrag,grpOption4GrpOverviewFrag;
    private ImageView cancelBtnCusDiaQuiz;
    private Button proceedBtnCusDiaQuiz;
    private EditText setTotalQusCusDiaQuiz;
    private TextView setDurationCusDiaQuiz;
    private QuizData quizData = new QuizData();

    public GroupOverviewFragGrpAdm() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = LayoutInflater.from(getContext())
                .inflate(R.layout.fragment_group_overview_frag_grp_adm,container,false);
        grpTitleCardVDetailsGrpOverviewAdm = view.findViewById(R.id.grpTitleCardVDetailsGrpOverviewAdm);
        grpShortDescCardVDetailsGrpOverviewAdm = view.findViewById(R.id.grpShortDescCardVDetailsGrpOverviewAdm);
        grpAdminNameCardVDetailsGrpOverviewAdm = view.findViewById(R.id.grpAdminNameCardVDetailsGrpOverviewAdm);
        grpOption1GrpOverviewFrag = view.findViewById(R.id.grpOption1GrpOverviewFrag);
        grpOption2GrpOverviewFrag = view.findViewById(R.id.grpOption2GrpOverviewFrag);
        grpOption3GrpOverviewFrag = view.findViewById(R.id.grpOption3GrpOverviewFrag);
        grpOption4GrpOverviewFrag = view.findViewById(R.id.grpOption4GrpOverviewFrag);
       // openSpecificFrag(R.id.grpAdminNameCardVDetailsGrpOverviewAdm);

        grpOption1GrpOverviewFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                FrameLayout fl = activity.findViewById(R.id.frameLayGrpOverview);
                fl.removeAllViews();
                Fragment fragment = new CourseSelectedFAdm();
                FragmentManager manager = activity.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = manager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayFragHolderActGrpAdm, fragment).commit();
                fragmentTransaction.addToBackStack(String.valueOf(R.layout.fragment_group_overview_frag_grp_adm));
                Toast.makeText(getContext(), "Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        grpOption2GrpOverviewFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Clicked 2", Toast.LENGTH_SHORT).show();
            }
        });

        grpOption3GrpOverviewFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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


                cancelBtnCusDiaQuiz = dialog.findViewById(R.id.cancelBtnCusDiaQuiz);
                cancelBtnCusDiaQuiz.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                        dialog.setCancelable(true);
                    }
                });

                proceedBtnCusDiaQuiz = dialog.findViewById(R.id.proceedBtnCusDiaQuiz);
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
                        Fragment fragment = new AddQuizQuesFAdm();
                        fragment.setArguments(bundle);
                        FrameLayout fl = dialog.findViewById(R.id.frameLayGrpOverview);
                        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.frameLayFragHolderActGrpAdm, fragment).commit();
                        fragmentTransaction.addToBackStack(null);
                    }
                });

                dialog.show();
            }
        });



        grpOption4GrpOverviewFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Clicked 4", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }



    private void openSpecificFrag(int id){
        switch (id){
            case R.id.grpOption1GrpOverviewFrag:
                Toast.makeText(getContext(), "opt1 clicked", Toast.LENGTH_SHORT).show();break;
            case R.id.grpOption2GrpOverviewFrag:
                Toast.makeText(getContext(), "opt2 clicked", Toast.LENGTH_SHORT).show();break;
            case R.id.grpOption3GrpOverviewFrag:
                Toast.makeText(getContext(), "opt3 clicked", Toast.LENGTH_SHORT).show();break;
            case R.id.grpOption4GrpOverviewFrag:
                Toast.makeText(getContext(), "opt4 clicked", Toast.LENGTH_SHORT).show();break;
        }
    }
}