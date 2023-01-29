package com.example.adminapp.AlumniActAdm;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adminapp.R;
import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;


public class AlumniFragHomeSc extends Fragment {


    private ArrayList<DataModelAlumniHomeSc> dataHolder;
    private RecyclerView recyclerVAlumniFragHomeSc;
    private FrameLayout frameLayAlumniFragHomeSc;
    private DataModelAlumniHomeSc dataModelAlumniHomeSc;
    private TextView titleTvlAlumniMainScHoF,descTvlAlumniMainScHoF,descTvlAlumniMainScOpportunity,titleTvlAlumniMainScOpportunity,
            titleTvlAlumniMainScAlumniDirectory,descTvlAlumniMainScAlumniDirectory;
    private MaterialCardView materialCardVAlumniFragMainScOpportunity,materialCardVAlumniFragMainScAlumniDirectory,
            materialCardVHallOfFrameAlumniFragMainSc;

    public AlumniFragHomeSc() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_alumni_frag_home_sc,container,false);
        recyclerVAlumniFragHomeSc = view.findViewById(R.id.recyclerVAlumniFragHomeSc);
        frameLayAlumniFragHomeSc = view.findViewById(R.id.frameLayAlumniFragHomeSc);


                recyclerVAlumniFragHomeSc.setLayoutManager(new LinearLayoutManager(getContext()));
        dataHolder = new ArrayList<>();
        addData();
        recyclerVAlumniFragHomeSc.setAdapter(new AdapterRecVAlumniFragHomeSc(dataHolder));
        //Todo Add Reg As an Alumni + post as an alumni or tpo wala opt

//        //Opt 2:
//        titleTvlAlumniMainScHoF = view.findViewById(R.id.titleTvlAlumniMainScHoF);
//        descTvlAlumniMainScHoF = view.findViewById(R.id.descTvlAlumniMainScHoF);
//        materialCardVHallOfFrameAlumniFragMainSc = view.findViewById(R.id.materialCardVHallOfFrameAlumniFragMainSc);
//
//        titleTvlAlumniMainScOpportunity = view.findViewById(R.id.titleTvlAlumniMainScOpportunity);
//        descTvlAlumniMainScOpportunity = view.findViewById(R.id.descTvlAlumniMainScOpportunity);
//        materialCardVAlumniFragMainScOpportunity = view.findViewById(R.id.materialCardVAlumniFragMainScOpportunity);
//
//        titleTvlAlumniMainScAlumniDirectory = view.findViewById(R.id.titleTvlAlumniMainScAlumniDirectory);
//        descTvlAlumniMainScAlumniDirectory = view.findViewById(R.id.descTvlAlumniMainScAlumniDirectory);
//        materialCardVAlumniFragMainScAlumniDirectory = view.findViewById(R.id.materialCardVAlumniFragMainScAlumniDirectory);
//



        return view;

    }

    private void addData() {
        DataModelAlumniHomeSc card1 = new DataModelAlumniHomeSc("Hall Of Frame",
                "An Alumni Hall of Fame is a recognition program that honors and celebrates the achievements of graduates from a particular educational institution. It serves as a way to acknowledge the success of alumni who have made a significant impact in their fields after graduation. Inductees into the Hall of Fame are selected based on their notable accomplishments, contributions to society, and influence on their respective fields.");
        dataHolder.add(card1);
        DataModelAlumniHomeSc card2 = new DataModelAlumniHomeSc("Alumni Directory",
                "An alumni directory is a database or directory that lists the names and contact information of alumni of a particular educational institution or organization. Alumni directories can be used for a variety of purposes, including reunions, networking, fundraising, and staying in touch with alumni.An alumni directory is a database or list of former students or graduates of a school, college, or university. It is often used as a way for alumni to stay connected with each other and the institution, and can include information such as names, contact information, career information, and biographical data. The purpose of an alumni directory is to maintain and strengthen connections between alumni and the institution, and to support networking and career opportunities for alumni.");
        dataHolder.add(card2);
        DataModelAlumniHomeSc card3 = new DataModelAlumniHomeSc("Opportunities",
                "Various opportunities provided by alumni spread all across the globe.Alumni opportunities refer to benefits, services, and events that are offered to former students of a school, college, or university. These can include career services, continuing education, social events, and volunteer opportunities, aimed at helping alumni advance their careers, stay connected to their alma mater, and network with other alumni. The goal is to maintain and strengthen the bond between alumni and their institution, and provide resources for personal and professional growth.");
        dataHolder.add(card3);

    }
}