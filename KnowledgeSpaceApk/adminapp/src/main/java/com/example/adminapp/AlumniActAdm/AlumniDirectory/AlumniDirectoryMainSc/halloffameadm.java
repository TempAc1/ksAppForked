package com.example.adminapp.AlumniActAdm.AlumniDirectory.AlumniDirectoryMainSc;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

import com.example.adminapp.R;

public class halloffameadm extends AppCompatActivity {
    ViewFlipper flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halloffameadm);
        int imagarr[]={R.drawable.fees,R.drawable.apple,R.drawable.banana};
        flipper=(ViewFlipper)findViewById(R.id.flipper);

        for(int i=0;i<imagarr.length;i++){
            showimage(imagarr[i]);
        }


    }

    public void showimage(int img ){
        Context context;
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(img);

        flipper.addView(imageView);
        flipper.setFlipInterval(3000);
        flipper.setAutoStart(true);

        flipper.setInAnimation(this,andirod.R.anim.slide_in_left);
        flipper.setOutAnimation(this,andirod.R.anim.slide_out_right);


    }
}
