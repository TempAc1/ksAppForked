package com.example.adminapp.AlumniActAdm.AlumniDirectory.AlumniDirectoryMainSc;

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

public class halloffameadm extends AppCompatActivity {
//    ViewFlipper flipper;
//    @Override
//    protected void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.halloffameadm);
//        int imagarr[]={R.drawable.fees,R.drawable.apple,R.drawable.banana};
//        flipper=(ViewFlipper)findViewById(R.id.flipper);
//
//        for(int i=0;i<imagarr.length;i++){
//            showimage(imagarr[i]);
//        }
//
//
//    }
//
//    public void showimage(int img ){
//        Context context;
//        ImageView imageView = new ImageView(this);
//        imageView.setBackgroundResource(img);
//
//        flipper.addView(imageView);
//        flipper.setFlipInterval(3000);
//        flipper.setAutoStart(true);
//
//        flipper.setInAnimation(this,android.R.anim.slide_in_left);
//        flipper.setOutAnimation(this,android.R.anim.slide_out_right);
//
//
//    }
AdapterViewFlipper adapterViewFlipper;

    int[] IMAGES = {
            R.drawable.graphes,
            R.drawable.apple,
            R.drawable.banana,
            R.drawable.graphes
    };

    String[] NAMES = {
            "pic of grapes",
            "pic of apple",
            "pic of banaba",
            "new fruit"
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
