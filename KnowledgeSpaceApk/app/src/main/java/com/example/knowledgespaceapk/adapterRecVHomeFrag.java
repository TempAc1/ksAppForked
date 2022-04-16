package com.example.knowledgespaceapk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapterRecVHomeFrag  extends  RecyclerView.Adapter<adapterRecVHomeFrag.myviewholder>{

    ArrayList<dataModelRecVFragHome> dataHolder;

    public adapterRecVHomeFrag(ArrayList<dataModelRecVFragHome> dataHolder) {
        this.dataHolder = dataHolder;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new myviewholder(LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row_design_rec_homef
                                    ,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.img.setImageResource(dataHolder.get(position).getImage());
        holder.title.setText(dataHolder.get(position).getTitle());
        holder.desc.setText(dataHolder.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return dataHolder.size();
    }

    class myviewholder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView title,desc;

        public myviewholder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.imageVSingleRowDesRecHomeF);
            title = itemView.findViewById(R.id.titleTxtVSingleRDesRecHomeF);
            desc = itemView.findViewById(R.id.descriptionTxtVSingleRDesRecHomeF);
        }
    }
}
