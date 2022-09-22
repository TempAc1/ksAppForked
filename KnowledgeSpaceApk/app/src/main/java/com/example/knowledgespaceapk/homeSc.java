package com.example.knowledgespaceapk;


import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.knowledgespaceapk.QnAact.QnAAct;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;


public class homeSc extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private BottomNavigationView bottomNavigationView;
    private Toolbar toolbar;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_sc);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        toolbar = findViewById(R.id.appBar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24);

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

        setNavigationView();

    }//End OnCreate

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.custom_toolbar_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

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

    private void setNavigationView() {
        navigationView = findViewById(R.id.drawerNavigationView);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.cv:
                        startActivity(new Intent(getApplicationContext(),Resume.class));
                        break;
                    case R.id.alumni:
                        Toast.makeText(homeSc.this, "alumni clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.QnA:
                        startActivity(new Intent(getApplicationContext(), QnAAct.class));
                        break;
                    case R.id.hw:
                        Toast.makeText(homeSc.this, "hw clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.fees:
                        startActivity(new Intent(getApplicationContext(),FeesAct.class));
                        Toast.makeText(homeSc.this, "fees clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.scholarship:
                        Toast.makeText(homeSc.this, "scholarship clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.attendance:
                        //Toast.makeText(homeSc.this, "attendance clicked", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(),AttendanceAct.class));
                        break;
                    case R.id.routine:
                        //Toast.makeText(homeSc.this, "routine clicked", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(),RoutineAct.class));
                        break;
                    case R.id.placement:
                        Toast.makeText(homeSc.this, "placement clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.contactList:
                        startActivity(new Intent(getApplicationContext(),ContactAct.class));
                        break;
                    case R.id.examEnrollment:
                        Toast.makeText(homeSc.this, "exams enrollment clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.onlineExams:
                        Toast.makeText(homeSc.this, "online exams clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.posts:
                        Toast.makeText(homeSc.this, "posts clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.settings:
                        startActivity(new Intent(getApplicationContext(),SettingsAct.class));
                        //Toast.makeText(homeSc.this, "settings clicked", Toast.LENGTH_SHORT).show();
                        break;
//                    case R.id.tNc:
//                        Toast.makeText(homeSc.this, "tnC clicked", Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.signOut:
//                        Toast.makeText(homeSc.this, "signOut clicked", Toast.LENGTH_SHORT).show();
//                        break;
                }
                return false;
            }
        });
    }

}//End Main