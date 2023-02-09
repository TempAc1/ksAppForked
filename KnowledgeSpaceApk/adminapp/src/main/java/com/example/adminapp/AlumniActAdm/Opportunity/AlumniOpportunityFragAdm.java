package com.example.adminapp.AlumniActAdm.Opportunity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridLayout;

import com.example.adminapp.R;

import java.util.ArrayList;


public class AlumniOpportunityFragAdm extends Fragment {

    private RecyclerView recyclerVAlumniOpportunityFragAdm;
    private FrameLayout frameLayAlumniOpportunityFragAdm;
    private ArrayList<DataModelOpportunityFAdm> dataHolder;

    public AlumniOpportunityFragAdm() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_alumni_opportunity_frag_adm, container, false);

        recyclerVAlumniOpportunityFragAdm = view.findViewById(R.id.recyclerVAlumniOpportunityFragAdm);
        frameLayAlumniOpportunityFragAdm = view.findViewById(R.id.frameLayAlumniOpportunityFragAdm);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(view.getContext(),2);
        recyclerVAlumniOpportunityFragAdm.setLayoutManager(gridLayoutManager);
        dataHolder = new ArrayList<>();
        addData();
        recyclerVAlumniOpportunityFragAdm.setAdapter(new AdapterOpportunityFAdm(dataHolder));



        return view;
    }

    private void addData() {
        DataModelOpportunityFAdm card1 = new DataModelOpportunityFAdm("Tagus Info",
                "Generating random paragraphs can be an excellent way for writers to get their creative flow going at the beginning of the day. The writer has no idea what topic the random paragraph will be about when it appears. This forces the writer to use creativity to complete one of three common writing challenges. The writer can use the paragraph as the first one of a short story and build upon it. A second option is to use the random paragraph somewhere in a short story they create. The third option is to have the random paragraph be the ending paragraph in a short story. No matter which of these challenges is undertaken, the writer is forced to use creativity to incorporate the paragraph into their writing.");
        dataHolder.add(card1);
        dataHolder.add(card1);dataHolder.add(card1);
        dataHolder.add(card1);dataHolder.add(card1);
        dataHolder.add(card1);dataHolder.add(card1);
        dataHolder.add(card1);dataHolder.add(card1);
        dataHolder.add(card1);dataHolder.add(card1);
        dataHolder.add(card1);dataHolder.add(card1);
        dataHolder.add(card1);dataHolder.add(card1);







    }
}