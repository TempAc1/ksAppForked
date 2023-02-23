package com.example.adminapp.AlumniActAdm.HallOfFrame;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;

import com.example.adminapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HallOfFrameFragAdm#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HallOfFrameFragAdm extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    ViewFlipper flipperHallOfFrameAdm;


    public HallOfFrameFragAdm() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HallOfFrameFragAdm.
     */
    // TODO: Rename and change types and number of parameters
    public static HallOfFrameFragAdm newInstance(String param1, String param2) {
        HallOfFrameFragAdm fragment = new HallOfFrameFragAdm();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_hall_of_frame_frag_adm, container, false);
        int imgArr[]={R.drawable.fees,R.drawable.apple,R.drawable.banana};
        flipperHallOfFrameAdm=view.findViewById(R.id.flipperHallOfFrameAdm);

        for(int i=0;i<imgArr.length;i++){
            showimage(imgArr[i]);
        }

        return view;
    }

    public void showimage(int img ){
        LinearLayout imageView = new LinearLayout(getContext());
        imageView.setBackgroundResource(img);

        flipperHallOfFrameAdm.addView(imageView);
        flipperHallOfFrameAdm.setFlipInterval(3000);
        flipperHallOfFrameAdm.setAutoStart(true);

        flipperHallOfFrameAdm.setInAnimation(getContext(),android.R.anim.slide_in_left);
        flipperHallOfFrameAdm.setOutAnimation(getContext(),android.R.anim.slide_out_right);


    }
}