package com.example.knowledgespaceapk.QnAact;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.knowledgespaceapk.R;

import java.util.ArrayList;

public class adapterRecVQnAAct extends RecyclerView.Adapter<adapterRecVQnAAct.holder> {

    ArrayList<dataModelRecVQnAAct> dataHolder;
    ArrayList<dataModelRecVQnAAct> dataHolderBackup;

    public void setFilteredList(ArrayList<dataModelRecVQnAAct> filteredList){
        this.dataHolder = filteredList;
        notifyDataSetChanged();
    }

    public adapterRecVQnAAct(ArrayList<dataModelRecVQnAAct> dataHolder) {
        this.dataHolder = dataHolder;
        dataHolderBackup =  new ArrayList<>(dataHolder);
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view  =   inflater.inflate(R.layout.single_row_design_qand_n_act,parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        holder.titleTv.setText(dataHolder.get(position).getTitle());
        holder.descriptionTv.setText(dataHolder.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return dataHolder.size();
    }

    public class holder extends RecyclerView.ViewHolder{
        TextView titleTv,descriptionTv;
        public holder(@NonNull View itemView) {
            super(itemView);
            titleTv =  itemView.findViewById(R.id.titleTxtVSingleRDesQnAAct);
            descriptionTv = itemView.findViewById(R.id.descriptionTxtVSingleRDesRecQnNAct);
        }
    }
}
