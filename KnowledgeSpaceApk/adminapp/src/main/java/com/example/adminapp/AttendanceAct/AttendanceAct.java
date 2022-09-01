package com.example.adminapp.AttendanceAct;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.adminapp.R;

import java.util.ArrayList;
import java.util.Locale;

public class AttendanceAct extends AppCompatActivity {

    private RecyclerView recyclerV;
    private ArrayList<dataModel> dataHolder;
    private android.widget.SearchView searchView;
    private adapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);

        recyclerV = findViewById(R.id.recyclerVAttendanceAct);
        searchView = findViewById(R.id.searchVAttendanceAct);
        searchView.clearFocus();

        recyclerV.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        getDataHolder();
        itemAdapter = new adapter(dataHolder);
        recyclerV.setAdapter(itemAdapter);
        search();
    }

    private void getDataHolder() {
        dataHolder =  new ArrayList<>();
        dataModel obj1 = new dataModel(R.drawable.man,"Khushal","378CB8");
        dataHolder.add(obj1);
        dataModel obj2 = new dataModel(R.drawable.man,"shatani","1511FB");
        dataHolder.add(obj2);
        dataModel obj3 = new dataModel(R.drawable.man,"Reema","378CB8");
        dataHolder.add(obj3);
        dataModel obj4 = new dataModel(R.drawable.man,"yash","378CB8");
        dataHolder.add(obj4);
        dataModel obj5 = new dataModel(R.drawable.man,"itanu","1664Br");
        dataHolder.add(obj5);
        dataModel obj6 = new dataModel(R.drawable.man,"zebra","8452Cv");
        dataHolder.add(obj6);
        dataModel obj7 = new dataModel(R.drawable.man,"Khushal","378CB8");
        dataHolder.add(obj7);
        dataModel obj8 = new dataModel(R.drawable.man,"Khushal","378CB8");
        dataHolder.add(obj8);
        dataModel obj9 = new dataModel(R.drawable.man,"Khushal","378CB8");
        dataHolder.add(obj9);
        dataModel obj10 = new dataModel(R.drawable.man,"Khushal","378CB8");
        dataHolder.add(obj10);
        dataModel obj11 = new dataModel(R.drawable.man,"Khushal","378CB8");
        dataHolder.add(obj11);
        dataModel obj12 = new dataModel(R.drawable.man,"Khushal","378CB8");
        dataHolder.add(obj12);
        dataModel obj13 = new dataModel(R.drawable.man,"Khushal","378CB8");
        dataHolder.add(obj13);
        dataModel obj14 = new dataModel(R.drawable.man,"Khushal","378CB8");
        dataHolder.add(obj14);
        dataModel obj15 = new dataModel(R.drawable.man,"Khushal","378CB8");
        dataHolder.add(obj15);
        dataModel obj16 = new dataModel(R.drawable.man,"Khushal","378CB8");
        dataHolder.add(obj16);



    }

    private void search() {
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
    }//Search end

    private void filterList(String text){
        ArrayList<dataModel> filteredList = new ArrayList<>();
        for(dataModel item : dataHolder){
            if(item.getpName().toLowerCase().contains(text.toLowerCase()) || item.getpRollNo().toLowerCase().contains(text.toLowerCase())){
                filteredList.add(item);
            }
        }
        if(filteredList.isEmpty()){
            Toast.makeText(this, "No Data Found ☹️", Toast.LENGTH_SHORT).show();
            searchView.clearFocus();
        }else{
            itemAdapter.setFilteredList(filteredList);
        }
    }

}//Main end