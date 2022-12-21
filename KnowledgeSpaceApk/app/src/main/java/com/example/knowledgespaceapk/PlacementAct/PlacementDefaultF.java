package com.example.knowledgespaceapk.PlacementAct;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.knowledgespaceapk.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;


public class PlacementDefaultF extends Fragment {


    private ArrayList<DataModelPlacementDefaultF> dataHolder;
    private RecyclerView recyclerView;
    private AdapterPlacementDefaultF adapter;
    private FloatingActionButton floatingBtnPlacementDefaultF;
    //    Dialog box
    private ImageView cancelBtnImgVCusDiaAddPlacementOffer;
    private EditText setOfferTitleTvCusDiaAddPlacementOffer,setOfferLinkTvCusDiaAddPlacementOffer,setOfferDescriptionTvCusDiaAddPlacementOffer;
    private Button addOfferBtnCusDiaAddPlacementOffer;

    public PlacementDefaultF() {
        // Required empty public constructor
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_placement_default, container, false);

        //All Ui need to add here:
        recyclerView = view.findViewById(R.id.recyclerVPlacementDefaultF);
        floatingBtnPlacementDefaultF  = view.findViewById(R.id.floatingBtnPlacementDefaultF);


        //Setting Up Recycler View:
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        addObjToHolder();
        recyclerView.setAdapter(new AdapterPlacementDefaultF(dataHolder));


        floatingBtnPlacementDefaultF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                openDialog();
                Toast.makeText(getContext(), "Clicked yeah", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

//    private void openDialog() {
//        Dialog dialog = new Dialog(getContext());
//        dialog.setContentView(R.layout.cus_dia_add_placement_offer_fadm);
//        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
//        dialog.setCancelable(false);
//        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//        dialog.getWindow().getAttributes().windowAnimations = R.style.animation;
//
//        cancelBtnImgVCusDiaAddPlacementOffer = dialog.findViewById(R.id.cancelBtnImgVCusDiaAddPlacementOffer);
//        cancelBtnImgVCusDiaAddPlacementOffer.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                dialog.setCancelable(true);
//                dialog.dismiss();
//            }
//        });
//
//        addOfferBtnCusDiaAddPlacementOffer = dialog.findViewById(R.id.addOfferBtnCusDiaAddPlacementOffer);
//        addOfferBtnCusDiaAddPlacementOffer.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                dialog.setCancelable(true);
//                dialog.dismiss();
//                Toast.makeText(getContext(), "Adding Offer...without backend", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//
//
//        dialog.show();
//
//    }

    private void addObjToHolder() {
        dataHolder = new ArrayList<>();
        DataModelPlacementDefaultF obj = new DataModelPlacementDefaultF("Jio Platforms",
                "Dear Students Greetings from D. Y. Patil International University, Akurdi! It gives us immense pleasure to invite you for the Campus Recruitment of Pi Techniques Private Limited for 2023 Graduating Batch",
                "https://www.pitechniques.com/");
        dataHolder.add(obj);
        dataHolder.add(obj);
        dataHolder.add(obj);
        dataHolder.add(obj);
        dataHolder.add(obj);
        dataHolder.add(obj);
        dataHolder.add(obj);
        dataHolder.add(obj);
    }
}