package com.example.adminapp;

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
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.adminapp.AttendanceAct.AttendanceAct;
import com.example.adminapp.GroupFragAdm.GroupFragAdm;
import com.example.adminapp.HomeFragAdm.HomeFragAdm;
import com.example.adminapp.HomeworkActAdm.HomeworkActAdm;
import com.example.adminapp.NotiFragAdm.NotiFragAdm;
import com.example.adminapp.ScholarshipAct.ScholarshipActAdm;
import com.example.adminapp.SettingsAct.settingAct;
import com.example.adminapp.contactAct.ContactAct;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class HomeScAdm extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private BottomNavigationView bottomNavigationView;
    private Toolbar toolbar;
    private NavigationView navigationView;
    private   float uPoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_sc_adm);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        toolbar = findViewById(R.id.appBar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24);

        drawerLayout = findViewById(R.id.drawerNavigationDrawerLayoutAdmin);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,
                toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        replaceFrag(new HomeFragAdm());

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(item -> {

            switch (item.getItemId()){
                case R.id.home : replaceFrag(new HomeFragAdm()); break;
                case R.id.group: replaceFrag(new GroupFragAdm()); break;
                case R.id.notification:replaceFrag(new NotiFragAdm()); break;
            }
            return true;
        });

        setNavigationView();

    }//End OnCreate

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.custom_toolbar_menu_adm,menu);
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
                      //  startActivity(new Intent(getApplicationContext(), Resume.class));
                        break;
                    case R.id.alumni:
                        Toast.makeText(HomeScAdm.this, "alumni clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.hw:
                        startActivity(new Intent(getApplicationContext(), HomeworkActAdm.class));
                        Toast.makeText(HomeScAdm.this, "hw clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.fees:
                    //    startActivity(new Intent(getApplicationContext(), FeesAct.class));
                        Toast.makeText(HomeScAdm.this, "fees clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.scholarship:
                        startActivity(new Intent(getApplicationContext(),ScholarshipActAdm.class));
                        Toast.makeText(HomeScAdm.this, "scholarship clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.attendance:
                        //Toast.makeText(HomeScAdm.this, "attendance clicked", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(), AttendanceAct.class));
                        break;
                    case R.id.routine:
                        //Toast.makeText(HomeScAdm.this, "routine clicked", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(), RoutineAct.class));
                        break;
                    case R.id.placement:
                        Toast.makeText(HomeScAdm.this, "placement clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.contactList:
                        startActivity(new Intent(getApplicationContext(), ContactAct.class));
                        break;
                    case R.id.examEnrollment:
                        Toast.makeText(HomeScAdm.this, "exams enrollment clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.onlineExams:
                        Toast.makeText(HomeScAdm.this, "online exams clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.posts:
                        Toast.makeText(HomeScAdm.this, "posts clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.settings:
                        startActivity(new Intent(getApplicationContext(), settingAct.class));
                        //Toast.makeText(HomeScAdm.this, "settings clicked", Toast.LENGTH_SHORT).show();
                        break;
//                    case R.id.tNc:
//                        Toast.makeText(HomeScAdm.this, "tnC clicked", Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.signOut:
//                        Toast.makeText(HomeScAdm.this, "signOut clicked", Toast.LENGTH_SHORT).show();
//                        break;
                }
                return false;
            }
        });
    }


    // User Points Methods
    public HomeScAdm(){
        this.uPoints = 0;
    }

    public float getUPoints(){
        return this.uPoints;
    }

    public void setuPoints(float uPoints) {
        this.uPoints = uPoints;
    }



}//End Main