package com.example.knowledgespaceapk;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private RecyclerView recyclerVFragHomeSc;
    private ArrayList<dataModelRecVFragHome> dataHolder;
    private ImageView commentImgVSingleRDesRecHomeF;


    public HomeFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_home,container,false);
        recyclerVFragHomeSc =  view.findViewById(R.id.recyclerVFragHomeSc);
        commentImgVSingleRDesRecHomeF = view.findViewById(R.id.commentImgVSingleRDesRecHomeF);
        recyclerVFragHomeSc.setLayoutManager(new LinearLayoutManager(getContext()));
        dataHolder=new ArrayList<>();

        dataModelRecVFragHome obj1 = new dataModelRecVFragHome(R.drawable.fest,"Techno-fest 2k23","Presenting " +
                "you techno fest for this year.",R.drawable.like_64,R.drawable.oval_comment);
        dataHolder.add(obj1);
        dataModelRecVFragHome obj2 = new dataModelRecVFragHome(R.drawable.fest,"Techno-fest 2k23","Presenting " +
                "you techno fest for this year.",R.drawable.like_64,R.drawable.oval_comment);
        dataHolder.add(obj2);
        dataModelRecVFragHome obj3 = new dataModelRecVFragHome(R.drawable.fest,"Techno-fest 2k23","Presenting " +
                "you techno fest for this year.",R.drawable.like_64,R.drawable.oval_comment);
        dataHolder.add(obj3);
        dataModelRecVFragHome obj4 = new dataModelRecVFragHome(R.drawable.fest,"Techno-fest 2k23","Presenting " +
                "you techno fest for this year.",R.drawable.like_64,R.drawable.oval_comment);
        dataHolder.add(obj4);
        dataModelRecVFragHome obj5 = new dataModelRecVFragHome(R.drawable.fest,"Techno-fest 2k23","Presenting " +
                "you techno fest for this year.",R.drawable.like_64,R.drawable.oval_comment);
        dataHolder.add(obj5);
        recyclerVFragHomeSc.setAdapter(new adapterRecVHomeFrag(dataHolder));

    /**    commentImgVSingleRDesRecHomeF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Clicked", ToastR.com.example.knowledgespaceapk.R.drawable.oval_comment
    */

        return view;
    }//End OnCreateView

}//End Fragment