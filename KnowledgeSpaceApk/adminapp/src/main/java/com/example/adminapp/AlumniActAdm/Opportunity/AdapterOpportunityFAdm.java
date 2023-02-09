package com.example.adminapp.AlumniActAdm.Opportunity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adminapp.R;

import java.util.ArrayList;

public class AdapterOpportunityFAdm extends RecyclerView.Adapter<AdapterOpportunityFAdm.myviewholder> {

    ArrayList<DataModelOpportunityFAdm> dataHolder;
    ArrayList<DataModelOpportunityFAdm> dataHolderBackup;

    public AdapterOpportunityFAdm(ArrayList<DataModelOpportunityFAdm> dataHolder) {
        this.dataHolder = dataHolder;
        dataHolderBackup = new ArrayList<>(dataHolder);
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new myviewholder(LayoutInflater.from(parent.getContext()).inflate(R.layout.single_rowd_recv_alumniopportunity_f_adm,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.opportunityTitleTvSingleRdRecVFAdm.setText(dataHolder.get(position).getOpportunityTitleTvSingleRdRecVFAdm());
        holder.opportunityDescTvSingleRdRecVFAdm.setText(dataHolder.get(position).getOpportunityDescTvSingleRdRecVFAdm());
    }

    @Override
    public int getItemCount() {
        return dataHolder.size();
    }

    public class myviewholder extends RecyclerView.ViewHolder {
        TextView opportunityTitleTvSingleRdRecVFAdm,opportunityDescTvSingleRdRecVFAdm;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            opportunityTitleTvSingleRdRecVFAdm = itemView.findViewById(R.id.opportunityTitleTvSingleRdRecVFAdm);
            opportunityDescTvSingleRdRecVFAdm = itemView.findViewById(R.id.opportunityDescTvSingleRdRecVFAdm);
        }
    }
}
