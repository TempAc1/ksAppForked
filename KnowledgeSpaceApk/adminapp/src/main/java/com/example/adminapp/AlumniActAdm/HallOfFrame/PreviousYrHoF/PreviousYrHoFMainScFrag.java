package com.example.adminapp.AlumniActAdm.HallOfFrame.PreviousYrHoF;

import static android.app.Activity.RESULT_OK;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.adminapp.AlumniActAdm.HallOfFrame.PreviousYrHoF.RecyclerVMainSc.AdapterRecVMainScPrevYrHoFAdm;
import com.example.adminapp.AlumniActAdm.HallOfFrame.PreviousYrHoF.RecyclerVMainSc.DataModelRecVMainScPrevYrHoF;
import com.example.adminapp.R;

import java.util.ArrayList;


public class PreviousYrHoFMainScFrag extends Fragment {

    private RecyclerView recyclerVPrevYrHoFMainScAdm;
    private TextView selectYrPrevYrHoFMainScFAdm;
    private Button searchBtnPrevYrHoFMainScFragAdm;
    private ArrayList<DataModelRecVMainScPrevYrHoF> dataHolder;


    public PreviousYrHoFMainScFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = LayoutInflater.from(getContext())
                .inflate(R.layout.fragment_previous_yr_ho_f_main_sc, container, false);

        recyclerVPrevYrHoFMainScAdm = view.findViewById(R.id.recyclerVPrevYrHoFMainScAdm);
//        selectYrPrevYrHoFMainScFAdm = view.findViewById(R.id.selectYrPrevYrHoFMainScFAdm);
        searchBtnPrevYrHoFMainScFragAdm = view.findViewById(R.id.searchBtnPrevYrHoFMainScFragAdm);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(view.getContext(),2);
        recyclerVPrevYrHoFMainScAdm.setLayoutManager(gridLayoutManager);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL);
        recyclerVPrevYrHoFMainScAdm.addItemDecoration(dividerItemDecoration);
        dataHolder = new ArrayList<>();
        addData();
        recyclerVPrevYrHoFMainScAdm.setAdapter(new AdapterRecVMainScPrevYrHoFAdm(dataHolder));

        return view;
    }

    //Todo add backend linked profile link
    private void addData() {
        DataModelRecVMainScPrevYrHoF card1 = new DataModelRecVMainScPrevYrHoF(
                R.drawable.ic_baseline_person_24,
                R.drawable.linkedin,
                "Shrikant","Computer");
        dataHolder.add(card1);
        dataHolder.add(card1); dataHolder.add(card1); dataHolder.add(card1);
        dataHolder.add(card1); dataHolder.add(card1); dataHolder.add(card1); dataHolder.add(card1);
        dataHolder.add(card1); dataHolder.add(card1);
        dataHolder.add(card1); dataHolder.add(card1);
        dataHolder.add(card1);
        dataHolder.add(card1);
        dataHolder.add(card1);
        dataHolder.add(card1);


    }


}