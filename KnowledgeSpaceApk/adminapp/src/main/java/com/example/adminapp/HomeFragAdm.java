package com.example.adminapp;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;


public class HomeFragAdm extends Fragment {

    private RecyclerView recyclerVFragHomeSc;
    adapterRecVHomeFragAdm adapter;
    Toolbar toolbar;
    private MenuItem menuItem;
    private SearchView searchView;
    private ArrayList<dataModelRecVHomeFragAdm> dataHolder;
    private ImageView commentImgVSingleRDesRecHomeF;

    public HomeFragAdm() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_home_frag_adm,container,false);
        recyclerVFragHomeSc =  view.findViewById(R.id.RecyclerVHomeFragAdm);
        commentImgVSingleRDesRecHomeF = view.findViewById(R.id.commentBtnHomeFragAdm);
        recyclerVFragHomeSc.setLayoutManager(new LinearLayoutManager(getContext()));
        dataHolder=new ArrayList<>();

        dataModelRecVHomeFragAdm obj1 = new dataModelRecVHomeFragAdm(R.drawable.fest,"Techno-fest 2k23","Presenting " +
                "you techno fest for this year.",R.drawable.like_64,R.drawable.oval_comment);
        dataHolder.add(obj1);
        dataModelRecVHomeFragAdm obj2 = new dataModelRecVHomeFragAdm(R.drawable.fest,"Techno-fest 2k23","Presenting " +
                "you techno fest for this year.",R.drawable.like_64,R.drawable.oval_comment);
        dataHolder.add(obj2);
        dataModelRecVHomeFragAdm obj3 = new dataModelRecVHomeFragAdm(R.drawable.fest,"Techno-fest 2k23","Presenting " +
                "you techno fest for this year.",R.drawable.like_64,R.drawable.oval_comment);
        dataHolder.add(obj3);
        dataModelRecVHomeFragAdm obj4 = new dataModelRecVHomeFragAdm(R.drawable.fest,"Techno-fest 2k23","Presenting " +
                "you techno fest for this year.",R.drawable.like_64,R.drawable.oval_comment);
        dataHolder.add(obj4);
        dataModelRecVHomeFragAdm obj5 = new dataModelRecVHomeFragAdm(R.drawable.fest,"Techno-fest 2k23","Presenting " +
                "you techno fest for this year.",R.drawable.like_64,R.drawable.oval_comment);
        dataHolder.add(obj5);
        recyclerVFragHomeSc.setAdapter(new adapterRecVHomeFragAdm(dataHolder));

        return view;
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.custom_toolbar_menu_adm,menu);
        menuItem = menu.findItem(R.id.search_button);

        searchView = (SearchView)menuItem.getActionView();

        SearchManager searchManager = (SearchManager) getActivity().getSystemService(Context.SEARCH_SERVICE);
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getActivity().getComponentName()));

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                //mysearch(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if(adapter != null){
                    adapter.getFilter().filter(newText);
                }else{
                    Toast.makeText(getContext(), "invalid search", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });

        super.onCreateOptionsMenu(menu, inflater);
    }
}