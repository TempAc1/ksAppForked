package com.example.adminapp.GroupFragAdm;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adminapp.R;


public class SelectedOptionFragGrpAdm extends Fragment {

    private TextView tvSelectedOpt;

    public SelectedOptionFragGrpAdm() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_selected_option_frag_grp_adm, container, false);
        tvSelectedOpt = view.findViewById(R.id.tvSelectedOpt);
        tvSelectedOpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Tv Clicked from frgag", Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }
}