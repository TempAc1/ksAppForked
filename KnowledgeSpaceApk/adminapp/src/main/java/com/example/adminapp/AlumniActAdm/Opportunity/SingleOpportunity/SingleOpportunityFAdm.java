package com.example.adminapp.AlumniActAdm.Opportunity.SingleOpportunity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.adminapp.R;


public class SingleOpportunityFAdm extends Fragment {

    private Button applyForOpportunityBtnSingleOpportFAdm,deleteOpportBtnSingleOpportFAdm;


    public SingleOpportunityFAdm() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_single_opportunity_f_adm, container, false);
        
        applyForOpportunityBtnSingleOpportFAdm = view.findViewById(R.id.applyForOpportunityBtnSingleOpportFAdm);
        deleteOpportBtnSingleOpportFAdm = view.findViewById(R.id.deleteOpportBtnSingleOpportFAdm);

        //Todo create backend
        applyForOpportunityBtnSingleOpportFAdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(view.getContext(), "Clicked without backend", Toast.LENGTH_SHORT).show();
//                if(b != null){
//                    Uri uri = Uri.parse(String.valueOf(b)); // missing 'http://' will cause crashed
//                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                    startActivity(intent);
//                }else{
//                    Toast.makeText(getContext(), "Error Catching", Toast.LENGTH_SHORT).show();
//                }

            }
        });
        
        deleteOpportBtnSingleOpportFAdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(view.getContext(), "Clicked delete without backend", Toast.LENGTH_SHORT).show();
            }
        });
        
        return view;
    }
}