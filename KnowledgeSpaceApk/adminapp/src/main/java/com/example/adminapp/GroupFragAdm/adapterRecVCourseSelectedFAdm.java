package com.example.adminapp.GroupFragAdm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adminapp.R;

import java.util.ArrayList;

public class adapterRecVCourseSelectedFAdm extends RecyclerView.Adapter<adapterRecVCourseSelectedFAdm.myviewholder> {

    ArrayList<dataModelRecVCourseSelectedFAdm> dataHolder;
    ArrayList<dataModelRecVCourseSelectedFAdm> dataHolderBackup;

    public adapterRecVCourseSelectedFAdm(ArrayList<dataModelRecVCourseSelectedFAdm> dataHolder) {
        this.dataHolder = dataHolder;
        dataHolderBackup = new ArrayList<>(dataHolder);
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new myviewholder(LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row_des_course_selectedf_adm
                        ,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.chapterNameSingleRDCourseSelectedFAdm.setText(dataHolder.get(position).getChapterName());
        holder.totalNoOfModulesTvSingleRDCourseSelectedFAdm.setText(new StringBuilder().append("No Of Modules")
                .append(" : ").append(dataHolder.get(position).getTotalNoOfModules()).toString());
    }

    @Override
    public int getItemCount() {
        return dataHolder.size();
    }

    public class myviewholder extends RecyclerView.ViewHolder {

        TextView chapterNameSingleRDCourseSelectedFAdm,totalNoOfModulesTvSingleRDCourseSelectedFAdm;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            chapterNameSingleRDCourseSelectedFAdm = itemView.findViewById(R.id.chapterNameSingleRDCourseSelectedFAdm);
            totalNoOfModulesTvSingleRDCourseSelectedFAdm = itemView.findViewById(R.id.totalNoOfModulesTvSingleRDCourseSelectedFAdm);
        }
    }
}
