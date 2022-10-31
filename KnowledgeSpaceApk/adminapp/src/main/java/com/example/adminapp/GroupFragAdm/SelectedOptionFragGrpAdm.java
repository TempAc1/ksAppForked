package com.example.adminapp.GroupFragAdm;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.adminapp.R;


public class SelectedOptionFragGrpAdm extends Fragment {



    public SelectedOptionFragGrpAdm() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_selected_option_frag_grp_adm, container, false);
    }
}