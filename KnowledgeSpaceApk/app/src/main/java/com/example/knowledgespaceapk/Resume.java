package com.example.knowledgespaceapk;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarDataSet;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class Resume extends AppCompatActivity {

    com.github.mikephil.charting.charts.RadarChart RadarChart;
    RadarData radarData;
    RadarDataSet radarDataSet;
    ArrayList radarEntries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);

        RadarChart = findViewById(R.id.radarChartResumeAct);
        getEntries();
        radarDataSet = new RadarDataSet(radarEntries, "Details");
        radarData = new RadarData(radarDataSet);
        RadarChart.setData(radarData);
        radarDataSet.setColors(ColorTemplate.JOYFUL_COLORS);
        radarDataSet.setValueTextColor(Color.BLACK);
        radarDataSet.setValueTextSize(18f);

    }//End OnCreate

    private void getEntries() {
        radarEntries = new ArrayList<>();
        radarEntries.add(new RadarEntry(0, 21f));
        radarEntries.add(new RadarEntry(1, 12f));
        radarEntries.add(new RadarEntry(2, 20f));
        radarEntries.add(new RadarEntry(2, 52f));
        radarEntries.add(new RadarEntry(3, 29f));
        radarEntries.add(new RadarEntry(4, 62f));
    }

}//End Main