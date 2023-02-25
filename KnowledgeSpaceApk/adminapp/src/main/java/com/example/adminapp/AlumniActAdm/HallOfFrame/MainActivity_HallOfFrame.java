package com.example.adminapp.AlumniActAdm.HallOfFrame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterViewFlipper;

import com.example.adminapp.R;


public class MainActivity_HallOfFrame extends AppCompatActivity {

    AdapterViewFlipper adapterViewFlipper;

    int[] IMAGES = {
            R.drawable.apple,
            R.drawable.banana,
            R.drawable.graphes,
            R.drawable.apple
    };

    String[] NAMES = {
            "Deosai National Park",
            "Lake Dudipatsar",
            "Rama Meadows",
            "Lower Kachura Lake"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hall_of_frame);

        adapterViewFlipper = (AdapterViewFlipper) findViewById(R.id.adapterViewFlipper);
        HallofframeadmAdp customAdapter = new HallofframeadmAdp(getApplicationContext(), IMAGES,NAMES);
        adapterViewFlipper.setAdapter(customAdapter);
        adapterViewFlipper.setFlipInterval(2600);
        adapterViewFlipper.setAutoStart(true);
    }
}