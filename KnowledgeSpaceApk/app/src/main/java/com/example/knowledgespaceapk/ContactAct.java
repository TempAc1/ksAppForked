package com.example.knowledgespaceapk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ContactAct extends AppCompatActivity {

    private RecyclerView recyclerViewContactAct;
    private ArrayList<dataModelRecVContactAct> dataHolderContactActs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        recyclerViewContactAct = findViewById(R.id.recyclerVContacts);
        recyclerViewContactAct.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        dataHolderContactActs = new ArrayList<>();

        dataModelRecVContactAct obj1 = new dataModelRecVContactAct("Mrs.Repma Patel","8985848687"
                                            ,R.drawable.apple);
        dataHolderContactActs.add(obj1);

        dataModelRecVContactAct obj2 = new dataModelRecVContactAct("Mrs.Subtoshi Pandey",
                "9897949596",R.drawable.apple);
        dataHolderContactActs.add(obj2);
        dataModelRecVContactAct obj3 = new dataModelRecVContactAct("Mr.Dablu Kochi","5651545253"
                ,R.drawable.apple);
        dataHolderContactActs.add(obj3);
        dataModelRecVContactAct obj4 = new dataModelRecVContactAct("Mr.Girate Patel","4845464241"
                ,R.drawable.apple);
        dataHolderContactActs.add(obj4);
        dataModelRecVContactAct obj5 = new dataModelRecVContactAct("Mrs. Joti Japan","2326242521"
                ,R.drawable.apple);
        dataHolderContactActs.add(obj5);
        dataModelRecVContactAct obj6 = new dataModelRecVContactAct("Mrs.Yarisma Patel","8985848687"
                ,R.drawable.apple);
        dataHolderContactActs.add(obj6);
        dataModelRecVContactAct obj7 = new dataModelRecVContactAct("Mrs.Rinku Hiesenberg","8985848687"
                ,R.drawable.apple);
        dataHolderContactActs.add(obj7);
        recyclerViewContactAct.setAdapter(new adapterRecVContact(dataHolderContactActs));
    }
}