package com.example.adminapp.GroupFragAdm;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adminapp.MyPosts.SinglePostFragMyPostActAdm;
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
       // openSpecificFrag(R.id.grpAdminNameCardVDetailsGrpOverviewAdm);

        grpOption1GrpOverviewFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                Fragment fragment = new SelectedOptionFragGrpAdm();
                FragmentManager manager = activity.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = manager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayGrpOverview, fragment).commit();
                fragmentTransaction.addToBackStack(null);
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
                Toast.makeText(getContext(), "Clicked 3", Toast.LENGTH_SHORT).show();
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