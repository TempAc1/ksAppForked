package com.example.knowledgespaceapk.Alumni.Opportunity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import com.example.knowledgespaceapk.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AlumniOpportunityFrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AlumniOpportunityFrag extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    private RecyclerView recyclerVAlumniOpportunityFrag;
    private FrameLayout frameLayAlumniOpportunityFrag;
    private ArrayList<DataModelOpportunityF> dataHolder;
    private FloatingActionButton floatingBtnAlumniOpportFrag;
    private ImageButton cancelBtnImgVCusDiaAddOpportunityF;
    private EditText setOfferDescriptionTvCusDiaAddOpportunityF ,setOfferTitleTvCusDiaAddOpportunityF,
            setOfferLinkTvCusDiaAddOpportunityF;
    private Button addOfferBtnCusDiaAddOpportunityF;
    public String offerLink;

    public AlumniOpportunityFrag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AlumniOpportunityFrag.
     */
    // TODO: Rename and change types and number of parameters
    public static AlumniOpportunityFrag newInstance(String param1, String param2) {
        AlumniOpportunityFrag fragment = new AlumniOpportunityFrag();
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
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_alumni_opportunity, container, false);

        recyclerVAlumniOpportunityFrag = view.findViewById(R.id.recyclerVAlumniOpportunityFrag);
        frameLayAlumniOpportunityFrag = view.findViewById(R.id.frameLayAlumniOpportunityFrag);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(view.getContext(),2);
        recyclerVAlumniOpportunityFrag.setLayoutManager(gridLayoutManager);
        dataHolder = new ArrayList<>();
        addData();
        recyclerVAlumniOpportunityFrag.setAdapter(new AdapterOpportunityF(dataHolder));

        return view;

    }


    private void addData() {
        DataModelOpportunityF card1 = new DataModelOpportunityF("Tagus Info",
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