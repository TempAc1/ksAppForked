package com.example.adminapp.ApplicationActAdm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adminapp.R;

import java.util.ArrayList;

public class AdapterApplicationMainFAdm extends RecyclerView.Adapter<AdapterApplicationMainFAdm.myviewholder> {

    private ArrayList<DataModelRecVApplicationMainFAdm> dataHolder;
    private ArrayList<DataModelRecVApplicationMainFAdm> dataHolderBackup;

    public AdapterApplicationMainFAdm(ArrayList<DataModelRecVApplicationMainFAdm> dataHolder) {
        this.dataHolder = dataHolder;
        dataHolderBackup = new ArrayList<>(dataHolder);
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new myviewholder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_resd_recv_application_fadm,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return dataHolder.size();
    }

    public class myviewholder extends RecyclerView.ViewHolder{
        TextView applicationSenderIdTvSingleRdRecVApplicationDefaultFAdm,
                appTitleTvSingleRdRecVApplicationDefaultFAdm,appDescTvSingleRdRecVApplicationDefaultFAdm;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            applicationSenderIdTvSingleRdRecVApplicationDefaultFAdm = itemView.findViewById(R.id.applicationSenderIdTvSingleRdRecVApplicationDefaultFAdm);
            appTitleTvSingleRdRecVApplicationDefaultFAdm  = itemView.findViewById(R.id.appTitleTvSingleRdRecVApplicationDefaultFAdm);
            appDescTvSingleRdRecVApplicationDefaultFAdm = itemView.findViewById(R.id.appDescTvSingleRdRecVApplicationDefaultFAdm);
        }
    }
}
