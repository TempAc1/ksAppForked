package com.example.adminapp.AlumniActAdm;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adminapp.AlumniActAdm.AlumniDirectory.AlumniDirectoryMainSc.AlumniDirectoryMainScFAdm;
import com.example.adminapp.AlumniActAdm.Opportunity.AlumniOpportunityFragAdm;
import com.example.adminapp.GroupFragAdm.GrpQuizesAdm.QuizesMainScAdm;
import com.example.adminapp.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;


public class AlumniFragHomeSc extends Fragment {

    private FrameLayout frameLayAlumniFragHomeSc;
    private FloatingActionButton floatingBtnAlumniFragHomeSc;
    private ScrollView scrollVAlumniFragHomeSc;
    private MaterialCardView HallOfFrameMaterialCardVAlumniFragMainSc,OpportunitiesMaterialCardVAlumniFragMainSc,AlumniDirectoryMaterialCardVAlumniFragMainSc;


    public AlumniFragHomeSc() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_alumni_frag_home_sc,container,false);

        frameLayAlumniFragHomeSc = view.findViewById(R.id.frameLayAlumniFragHomeSc);


        floatingBtnAlumniFragHomeSc = view.findViewById(R.id.floatingBtnAlumniFragHomeSc);
        floatingBtnAlumniFragHomeSc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        scrollVAlumniFragHomeSc = view.findViewById(R.id.scrollVAlumniFragHomeSc);

        OpportunitiesMaterialCardVAlumniFragMainSc = view.findViewById(R.id.OpportunitiesMaterialCardVAlumniFragMainSc);
        OpportunitiesMaterialCardVAlumniFragMainSc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                FrameLayout fl = activity.findViewById(R.id.frameLayAlumniFragHomeSc);
                fl.removeAllViews();
                Fragment fragment = new AlumniOpportunityFragAdm();
                FragmentManager manager = activity.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = manager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayAlumniFragHomeSc,fragment).commit();
                fragmentTransaction.addToBackStack(String.valueOf(R.layout.fragment_alumni_frag_home_sc));

            }
        });

        AlumniDirectoryMaterialCardVAlumniFragMainSc = view.findViewById(R.id.AlumniDirectoryMaterialCardVAlumniFragMainSc);
        AlumniDirectoryMaterialCardVAlumniFragMainSc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                FrameLayout fl = activity.findViewById(R.id.frameLayAlumniFragHomeSc);
                fl.removeAllViews();
                Fragment fragment = new AlumniDirectoryMainScFAdm();
                FragmentManager manager = activity.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = manager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayAlumniFragHomeSc,fragment).commit();
                fragmentTransaction.addToBackStack(String.valueOf(R.layout.fragment_alumni_frag_home_sc));
            }
        });


        return view;

    }



}