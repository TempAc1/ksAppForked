package com.example.adminapp.AttendanceAct;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.widget.ImageViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adminapp.R;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.holder> {

    ArrayList<dataModel> dataHolder;
    ArrayList<dataModel> dataHolderBackup;

    public  void setFilteredList(ArrayList<dataModel> filteredList){
        this.dataHolder = filteredList;
        notifyDataSetChanged();
    }

    public adapter(ArrayList<dataModel> dataHolder) {
        this.dataHolder = dataHolder;
        dataHolderBackup =  new ArrayList<>(dataHolder);
    }

    @NonNull
    @Override
    public adapter.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view  = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_row_des_attendance_act,parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapter.holder holder, int position) {
        holder.img.setImageResource(dataHolder.get(position).getpImg());
        holder.pName.setText(dataHolder.get(position).getpName());
        holder.pRollNo.setText(dataHolder.get(position).getpRollNo());
    }

    @Override
    public int getItemCount() {
        return dataHolder.size();
    }

    public class holder extends RecyclerView.ViewHolder {
       ImageView img;
        TextView pName,pRollNo;
        public holder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.pImgVSingleRowAttendanceAct);
            pName = itemView.findViewById(R.id.pNameSingleRowAttendanceAct);
            pRollNo = itemView.findViewById(R.id.pRollNoSingleRowAttendanceAct);
        }
    }
}
