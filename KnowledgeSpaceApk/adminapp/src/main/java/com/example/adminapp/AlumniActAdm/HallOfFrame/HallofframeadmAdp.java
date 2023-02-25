package com.example.adminapp.AlumniActAdm.HallOfFrame;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.adminapp.R;

public class HallofframeadmAdp extends BaseAdapter {
    Context context;
    int[] images;
    String[] names;
    LayoutInflater inflater;

//    public CustomAdapter(Context applicationContext, String[] names, int[] images) {
//        this.context = applicationContext;
//        this.images = images;
//        this.names = names;
//        inflater = (LayoutInflater.from(applicationContext));
//    }


    public HallofframeadmAdp(Context context, int[] images, String[] names) {
        this.context = context;
        this.images = images;
        this.names = names;
        inflater = (LayoutInflater.from(context.getApplicationContext()));
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
        view = inflater.inflate(R.layout.single_resource_layout_hallofframe, null);

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
