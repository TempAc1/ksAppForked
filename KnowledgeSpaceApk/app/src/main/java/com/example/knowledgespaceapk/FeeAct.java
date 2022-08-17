package com.example.knowledgespaceapk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FeeAct extends AppCompatActivity {

    private ExpandableListView expandableListView;
    adapterExpListFeeAct expandableListAdapter;
    List<String> expandableTitleList;
    HashMap<String, List<String>> expandableDetailList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fee);

        expandableListView = findViewById(R.id.expListVFeeAct);
        expandableDetailList = ExpandableListDataItems.getData();
        expandableTitleList = new ArrayList<String>(expandableDetailList.keySet());
        expandableListAdapter = new adapterExpListFeeAct(this,expandableTitleList,expandableDetailList);
        expandableListView.setAdapter(expandableListAdapter);
        
        listGrpExpand();
        listGrpCollapse();
        listChildOpen();


    }

    private void listChildOpen() {
        // This method is called when the child in any group is clicked
        // via a toast method, it is shown to display the selected child item as a sample
        // we may need to add further steps according to the requirements
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int grpPos, int childPos, long id) {
                Toast.makeText(getApplicationContext(), expandableTitleList.get(grpPos)
                        + " -> "
                        + expandableDetailList.get(
                        expandableTitleList.get(grpPos)).get(
                        childPos), Toast.LENGTH_SHORT
                ).show();
                return false;
            }
        });
    }

    private void listGrpCollapse() {
        // This method is called when the group is expanded
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getApplicationContext(), expandableTitleList.get(groupPosition) + " List Expanded.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void listGrpExpand() {
        // This method is called when the group is collapsed
        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getApplicationContext(), expandableTitleList.get(groupPosition) + " List Collapsed.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}