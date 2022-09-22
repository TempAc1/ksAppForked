package com.example.knowledgespaceapk.QnAact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.knowledgespaceapk.R;
import com.example.knowledgespaceapk.databinding.ActivityQnAactBinding;

import java.util.ArrayList;

public class QnAAct extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<dataModelRecVQnAAct> dataHolder;
    private adapterRecVQnAAct adapter;
    private SearchView searchView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qn_aact);

        searchView =  findViewById(R.id.searchVQnA);
        searchView.clearFocus();
        getSearchQuery();
        recyclerView = findViewById(R.id.recyclerVQnNAct);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        dataHolder =  new ArrayList<>();

        addDataToArrayList();
        adapter = new adapterRecVQnAAct(dataHolder);
        recyclerView.setAdapter(adapter);
    }//End OnCreate

    private void getSearchQuery() {
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                filterList(s);
                return true;
            }
        });
    }

    private void filterList(String s) {
        ArrayList<dataModelRecVQnAAct> filteredList = new ArrayList<>();
        for(dataModelRecVQnAAct item : dataHolder) {
            if (item.getTitle().toLowerCase().contains(s.toLowerCase()) || item.getDescription().toLowerCase().contains(s.toLowerCase())) {
                filteredList.add(item);
            }
        }
            if(filteredList.isEmpty()){
                searchView.clearFocus();
                Toast.makeText(this, "No Data Found", Toast.LENGTH_SHORT).show();
//                recyclerView.setVisibility(View.GONE);
            }
            else{
                adapter.setFilteredList(filteredList);
            }
    }

    private void addDataToArrayList() {
        dataModelRecVQnAAct obj1 = new dataModelRecVQnAAct("How to implement imageview in android",
                    "I'm stuck inside views in android cannot implement imageview inside android if anyone knows pls help!");
        dataHolder.add(obj1);
        dataModelRecVQnAAct obj2 = new dataModelRecVQnAAct("Hi Demo","Demo only here let's see");
        dataHolder.add(obj2);
        dataModelRecVQnAAct obj32 = new dataModelRecVQnAAct("How to implement imageview in android",
                "I'm stuck inside views in android cannot implement imageview inside android if anyone knows pls help!");
        dataHolder.add(obj32);
        dataModelRecVQnAAct obj3 = new dataModelRecVQnAAct("How to implement imageview in android",
                "I'm stuck inside views in android cannot implement imageview inside android if anyone knows pls help!");
        dataHolder.add(obj3);
        dataModelRecVQnAAct obj4 = new dataModelRecVQnAAct("How to implement imageview in android",
                "I'm stuck inside views in android cannot implement imageview inside android if anyone knows pls help!");
        dataHolder.add(obj4);
        dataModelRecVQnAAct obj5 = new dataModelRecVQnAAct("How to implement imageview in android",
                "I'm stuck inside views in android cannot implement imageview inside android if anyone knows pls help!");
        dataHolder.add(obj5);
        dataModelRecVQnAAct obj6 = new dataModelRecVQnAAct("How to implement imageview in android",
                "I'm stuck inside views in android cannot implement imageview inside android if anyone knows pls help!");
        dataHolder.add(obj6);
        dataModelRecVQnAAct obj7 = new dataModelRecVQnAAct("How to implement imageview in android",
                "I'm stuck inside views in android cannot implement imageview inside android if anyone knows pls help!");
        dataHolder.add(obj7);
        dataModelRecVQnAAct obj8 = new dataModelRecVQnAAct("How to implement imageview in android",
                "I'm stuck inside views in android cannot implement imageview inside android if anyone knows pls help!");
        dataHolder.add(obj8);
        dataModelRecVQnAAct obj9 = new dataModelRecVQnAAct("How to implement imageview in android",
                "I'm stuck inside views in android cannot implement imageview inside android if anyone knows pls help!");
        dataHolder.add(obj9);
        dataModelRecVQnAAct obj10 = new dataModelRecVQnAAct("How to implement imageview in android",
                "I'm stuck inside views in android cannot implement imageview inside android if anyone knows pls help!");
        dataHolder.add(obj10);
        dataModelRecVQnAAct obj11 = new dataModelRecVQnAAct("How to implement imageview in android",
                "I'm stuck inside views in android cannot implement imageview inside android if anyone knows pls help!");
        dataHolder.add(obj11);
        dataModelRecVQnAAct obj12 = new dataModelRecVQnAAct("How to implement imageview in android",
                "I'm stuck inside views in android cannot implement imageview inside android if anyone knows pls help!");
        dataHolder.add(obj12);




    }
}//End Main