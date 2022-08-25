package com.example.knowledgespaceapk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.example.knowledgespaceapk.databinding.ActivitySettingsBinding;

public class SettingsAct extends AppCompatActivity {

    private ActivitySettingsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySettingsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        actClicked();
    }//End OnCreate

    private void actClicked() {
        binding.profileSettingTvSettingsAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),SettingFrMangerAct.class);
                i.putExtra("view",getTag(view));
//                Log.i("Id ====== ",getTag(view));
                startActivity(i);
            }
        });
        binding.tNcTvSettingsAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),SettingFrMangerAct.class);
                i.putExtra("view",getTag(view));
//                Log.i("Id ====== ",getTag(view));
                startActivity(i);
            }
        });
        binding.signOutTvSettingsAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),SettingFrMangerAct.class);
                i.putExtra("view",getTag(view));
//                Log.i("Id ====== ",getTag(view));
                startActivity(i);
            }
        });
    }

    private String getTag(View view){
        String tag = (String) view.getTag();
        return tag;
    };


}//Main