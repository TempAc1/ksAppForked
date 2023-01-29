package com.example.adminapp.AlumniActAdm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adminapp.R;

import java.util.ArrayList;

public class AdapterRecVAlumniFragHomeSc extends RecyclerView.Adapter<AdapterRecVAlumniFragHomeSc.myviewholder> {

    ArrayList<DataModelAlumniHomeSc> dataHolder;
    ArrayList<DataModelAlumniHomeSc> dataHolderBackup;


    public AdapterRecVAlumniFragHomeSc(ArrayList<DataModelAlumniHomeSc> dataHolder) {
        this.dataHolder = dataHolder;
        dataHolderBackup = new ArrayList<>(dataHolder);
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new myviewholder(LayoutInflater.from(parent.getContext()).inflate(R.layout.single_rowdes_recv_alumnifrag_mainsc,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.titleTvlAlumniMainScSingleRdRecV.setText(dataHolder.get(position).getTitleTvlAlumniMainScSingleRdRecV());
        holder.descTvlAlumniMainScSingleRdRecV.setText(dataHolder.get(position).getDescTvlAlumniMainScSingleRdRecV());
    }

    @Override
    public int getItemCount() {
        return dataHolder.size();
    }

    public class myviewholder extends RecyclerView.ViewHolder{
        TextView descTvlAlumniMainScSingleRdRecV,titleTvlAlumniMainScSingleRdRecV;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            titleTvlAlumniMainScSingleRdRecV = itemView.findViewById(R.id.titleTvlAlumniMainScSingleRdRecV);
            descTvlAlumniMainScSingleRdRecV = itemView.findViewById(R.id.descTvlAlumniMainScSingleRdRecV);
        }
    }
}
