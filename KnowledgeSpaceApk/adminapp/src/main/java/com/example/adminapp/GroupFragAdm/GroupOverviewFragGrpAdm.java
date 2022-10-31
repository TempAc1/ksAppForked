package com.example.adminapp.GroupFragAdm;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adminapp.R;


public class GroupOverviewFragGrpAdm extends Fragment {

    private TextView grpTitleCardVDetailsGrpOverviewAdm,grpShortDescCardVDetailsGrpOverviewAdm,
            grpAdminNameCardVDetailsGrpOverviewAdm,grpOption1GrpOverviewFrag,grpOption2GrpOverviewFrag,
            grpOption3GrpOverviewFrag,grpOption4GrpOverviewFrag;

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
        openSpecificFrag(view);
        return view;
    }

    private void openSpecificFrag(View v){
        switch (v.getId()){
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