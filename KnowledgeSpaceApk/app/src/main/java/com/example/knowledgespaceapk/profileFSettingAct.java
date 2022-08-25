package com.example.knowledgespaceapk;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class profileFSettingAct extends Fragment {

    public profileFSettingAct(){
        //no-args constructor req
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile_f_setting_act, container, false);
    }
}