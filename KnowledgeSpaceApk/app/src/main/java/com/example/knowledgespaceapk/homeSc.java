package com.example.knowledgespaceapk;


import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;


import com.example.knowledgespaceapk.databinding.ActivityHomeScBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class homeSc extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_sc);

        Toolbar toolbar = findViewById(R.id.drawerNavigationToolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawerNavigationDrawerLayout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,
                            toolbar,R.string.open,R.string.close);
       drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        replaceFrag(new HomeFragment());
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(item -> {

            switch (item.getItemId()){
                case R.id.home : replaceFrag(new HomeFragment()); break;
                case R.id.group: replaceFrag(new GroupFragment()); break;
                case R.id.notification:replaceFrag(new NotificationFragment()); break;
            }
            return true;
        });

    }//End OnCreate

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }
    }

    private  void replaceFrag(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment);
        fragmentTransaction.commit();
    }
}//End Main