package com.example.adminapp.AlumniActAdm.HallOfFrame;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterViewFlipper;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adminapp.R;

import java.util.ArrayList;


public class HallOfFrameMainFrag extends Fragment {

    private ArrayList<DataModelHallOfFrame> dataHolder;
    private AdapterViewFlipper adapterViewFlipper;
    private TextView viewAllAlumniTvHallOfFrameMainActAdm;

    public HallOfFrameMainFrag() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_hall_of_frame_main, container, false);

        adapterViewFlipper = view.findViewById(R.id.adapterViewFlipper);
        dataHolder = new ArrayList<>();
        addData();
        adapterViewFlipper.setAdapter(new HallofframeadmAdp(dataHolder));
        adapterViewFlipper.setFlipInterval(2600);
        adapterViewFlipper.setAutoStart(true);

        viewAllAlumniTvHallOfFrameMainActAdm = view.findViewById(R.id.viewAllAlumniTvHallOfFrameMainActAdm);
        viewAllAlumniTvHallOfFrameMainActAdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Clicked", Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }

    private void addData() {
        DataModelHallOfFrame card1 = new DataModelHallOfFrame(R.drawable.apple,"apple");
        dataHolder.add(card1);
        DataModelHallOfFrame card2 = new DataModelHallOfFrame(R.drawable.banana,"banana");
        dataHolder.add(card2);
        dataHolder.add(card1);
    }
}