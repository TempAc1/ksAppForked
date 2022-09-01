package com.example.adminapp.contactAct;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.adminapp.R;

import java.util.ArrayList;
import java.util.List;

public class ContactAct extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<dataModel> dataHolder;
    private SearchView searchView;
    private adapterRecV itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        
        searchView = findViewById(R.id.searchVContact);
        recyclerView = findViewById(R.id.recyclerVContacts);
        searchView.clearFocus();
        
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
//        dataModel = new ArrayList<>();
        
        getDataHolder();
        itemAdapter =  new adapterRecV(dataHolder);
        recyclerView.setAdapter(itemAdapter);
        search();
    }

    private void search() {
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {
                    filterList(newText);
                    return true;
                }
            });
    }

    private void filterList(String text) {
        ArrayList<dataModel> filteredList = new ArrayList<>();
        for(dataModel item : dataHolder){
            if(item.getContactName().toLowerCase().contains(text.toLowerCase())){
                filteredList.add(item);
            }
        }

        if(filteredList.isEmpty()){
            Toast.makeText(this, "No Data Found ☹", Toast.LENGTH_SHORT).show();
        }else{
            itemAdapter.setFilteredList(filteredList);
        }
    }

    private void getDataHolder() {
        dataHolder = new ArrayList<>();
        //Add data to array-list "dataHolder"
        dataModel obj1 = new dataModel("Mrs.Repma Patel",
                "8985848687",R.drawable.apple);
        dataHolder.add(obj1);
        dataModel obj2 = new dataModel("Mrs.Subtoshi Pandey",
                "9897949596",R.drawable.apple);
        dataHolder.add(obj2);
        dataModel obj3 = new dataModel("Mr.Dablu Kochi",
                "5651545253",R.drawable.apple);
        dataHolder.add(obj3);
        dataModel obj4 = new dataModel("Mr.Girate Patel",
                "4845464241",R.drawable.apple);
        dataHolder.add(obj4);
        dataModel obj5 = new dataModel("Mrs. Joti Japan",
                "2326242521",R.drawable.apple);
        dataHolder.add(obj5);
        dataModel obj6 = new dataModel("Mrs.Yarisma Patel",
                "8985848687",R.drawable.apple);
        dataHolder.add(obj6);
        dataModel obj7 = new dataModel("Mrs.Rinku Hiesenberg",
                "8985848687",R.drawable.apple);
        dataHolder.add(obj7);
    }
}