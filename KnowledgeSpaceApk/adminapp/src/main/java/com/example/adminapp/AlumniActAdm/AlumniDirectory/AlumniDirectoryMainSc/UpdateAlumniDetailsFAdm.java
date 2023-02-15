package com.example.adminapp.AlumniActAdm.AlumniDirectory.AlumniDirectoryMainSc;

import static android.app.Activity.RESULT_OK;
import static com.example.adminapp.AlumniActAdm.AlumniDirectory.AlumniDirectoryMainSc.AdapterAlumniSearchResultFAdm.PICK_IMAGE;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.adminapp.R;

import java.io.FileNotFoundException;
import java.io.InputStream;


public class UpdateAlumniDetailsFAdm extends Fragment {

    private static final int PICK_IMG = 1;
    private ImageView imgVRegNoEditAlumniDetailsFAdm,imgVDeptEditAlumniDetailsFAdm,
            imgVBatchYrEditAlumniDetailsFAdm,imgVEditTvNameEditAlumniDetailsFAdm;
    private TextView editTvRegNoEditAlumniDetailsFAdm,editTvBatchYrEditAlumniDetailsFAdm,editTvDeptNameEditAlumniDetailsFAdm,
            editTvNameEditAlumniDetailsFAdm;
    private ImageView imgVEditAlumniDetailsFAdm,cancelBtnImgVEditAlumniDetailsFAdm;
    private Button updateAlumniBtnEditAlumniDetailsFAdm;

    public UpdateAlumniDetailsFAdm() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_update_alumni_details_f_adm, container, false);

        imgVEditAlumniDetailsFAdm = view.findViewById(R.id.imgVEditAlumniDetailsFAdm);
        imgVEditAlumniDetailsFAdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Select Alumni Picture"),PICK_IMAGE);
            }
        });




        imgVEditTvNameEditAlumniDetailsFAdm = view.findViewById(R.id.imgVEditTvNameEditAlumniDetailsFAdm);
        editTvNameEditAlumniDetailsFAdm = view.findViewById(R.id.editTvNameEditAlumniDetailsFAdm);
        editTvNameEditAlumniDetailsFAdm.setEnabled(false);
        imgVEditTvNameEditAlumniDetailsFAdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTvNameEditAlumniDetailsFAdm.setEnabled(true);
            }
        });



        imgVBatchYrEditAlumniDetailsFAdm = view.findViewById(R.id.imgVBatchYrEditAlumniDetailsFAdm);
        editTvBatchYrEditAlumniDetailsFAdm = view.findViewById(R.id.editTvBatchYrEditAlumniDetailsFAdm);
        editTvBatchYrEditAlumniDetailsFAdm.setEnabled(false);
        imgVBatchYrEditAlumniDetailsFAdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTvBatchYrEditAlumniDetailsFAdm.setEnabled(true);
            }
        });


        imgVDeptEditAlumniDetailsFAdm = view.findViewById(R.id.imgVDeptEditAlumniDetailsFAdm);
        editTvDeptNameEditAlumniDetailsFAdm = view.findViewById(R.id.editTvDeptNameEditAlumniDetailsFAdm);
        editTvDeptNameEditAlumniDetailsFAdm.setEnabled(false);
        imgVDeptEditAlumniDetailsFAdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTvDeptNameEditAlumniDetailsFAdm.setEnabled(true);
            }
        });


        imgVRegNoEditAlumniDetailsFAdm = view.findViewById(R.id.imgVRegNoEditAlumniDetailsFAdm);
        editTvRegNoEditAlumniDetailsFAdm = view.findViewById(R.id.editTvRegNoEditAlumniDetailsFAdm);
        editTvRegNoEditAlumniDetailsFAdm.setEnabled(false);
        imgVRegNoEditAlumniDetailsFAdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTvRegNoEditAlumniDetailsFAdm.setEnabled(true);
            }
        });


        cancelBtnImgVEditAlumniDetailsFAdm = view.findViewById(R.id.cancelBtnImgVEditAlumniDetailsFAdm);
        cancelBtnImgVEditAlumniDetailsFAdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                view.setCancelable(true);
//                view.dismiss();
            }
        });

        updateAlumniBtnEditAlumniDetailsFAdm = view.findViewById(R.id.updateAlumniBtnEditAlumniDetailsFAdm);
        updateAlumniBtnEditAlumniDetailsFAdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().popBackStack();
            }
        });



        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == PICK_IMG && resultCode == RESULT_OK){
            Uri uri = data.getData();
            imgVEditAlumniDetailsFAdm.setImageURI(uri);
            Log.i("image path ---> ",uri.getPath());
        }
    }
}