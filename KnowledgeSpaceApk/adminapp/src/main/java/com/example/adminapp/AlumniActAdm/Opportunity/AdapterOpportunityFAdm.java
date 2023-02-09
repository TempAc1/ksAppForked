package com.example.adminapp.AlumniActAdm.Opportunity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adminapp.AlumniActAdm.Opportunity.SingleOpportunity.SingleOpportunityFAdm;
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
        CardView cardVSingleRDRecVAlumniOpportunityFAdm;
        TextView opportunityTitleTvSingleRdRecVFAdm,opportunityDescTvSingleRdRecVFAdm;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            opportunityTitleTvSingleRdRecVFAdm = itemView.findViewById(R.id.opportunityTitleTvSingleRdRecVFAdm);
            opportunityDescTvSingleRdRecVFAdm = itemView.findViewById(R.id.opportunityDescTvSingleRdRecVFAdm);

            cardVSingleRDRecVAlumniOpportunityFAdm = itemView.findViewById(R.id.cardVSingleRDRecVAlumniOpportunityFAdm);
            cardVSingleRDRecVAlumniOpportunityFAdm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AppCompatActivity activity = (AppCompatActivity) itemView.getContext();
                    FrameLayout fl = activity.findViewById(R.id.frameLayAlumniOpportunityFragAdm);
                    fl.removeAllViews();
                    Fragment fragment = new SingleOpportunityFAdm();
                    FragmentManager manager = activity.getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = manager.beginTransaction();
                    fragmentTransaction.replace(R.id.frameLayAlumniFragHomeSc,fragment).commit();
                    fragmentTransaction.addToBackStack(null);


                }
            });
        }
    }
}
