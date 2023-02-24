package com.example.adminapp.AlumniActAdm.HallOfFrame;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterViewFlipper;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.adminapp.R;

public class HallofFrameFragAdpAdm extends AppCompatActivity {
    AdapterViewFlipper adapterViewFlipper;

    int[] IMAGES = {
            R.drawable.apple,
            R.drawable.banana,
            R.drawable.graphes,
            R.drawable.logo_app
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
        setContentView(R.layout.activity_main);

        // Link those objects with their respective id's
        // that we have given in .XML file
        adapterViewFlipper = (AdapterViewFlipper) findViewById(R.id.adapterViewFlipper);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), NAMES, IMAGES);
        adapterViewFlipper.setAdapter(customAdapter);
        adapterViewFlipper.setFlipInterval(2600);
        adapterViewFlipper.setAutoStart(true);
    }
}

class CustomAdapter extends BaseAdapter {
    Context context;
    int[] images;
    String[] names;
    LayoutInflater inflater;

    public CustomAdapter(Context applicationContext, String[] names, int[] images) {
        this.context = applicationContext;
        this.images = images;
        this.names = names;
        inflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.hall_of_fame_custom_adapter_layout, null);

        // Link those objects with their respective id's
        // that we have given in .XML file
        TextView name = (TextView) view.findViewById(R.id.name);
        ImageView image = (ImageView) view.findViewById(R.id.image);

        // Set the data in text view
        name.setText(names[position]);

        // Set the image in Image view
        image.setImageResource(images[position]);
        return view;
    }

}
