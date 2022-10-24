package com.example.adminapp.MyPosts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adminapp.R;

import java.util.ArrayList;

public class adapterMyPostsAdm extends RecyclerView.Adapter<adapterMyPostsAdm.myviewholder> {

    ArrayList<dataModelRecVMyPostsAdm> dataHolder;
    ArrayList<dataModelRecVMyPostsAdm> dataHolderBackup;

    public adapterMyPostsAdm(ArrayList<dataModelRecVMyPostsAdm> dataHolder) {
        this.dataHolder = dataHolder;
        dataHolderBackup = new ArrayList<>(dataHolder);
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_row_des_mypost_adm,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.postTitleTvSingleRdMyPostActAdm.setText(dataHolder.get(position).getPostTitleTvSingleRdMyPostActAdm());
        holder.postDesTvSingleRdMyPostActAdm.setText(dataHolder.get(position).getPostDesTvSingleRdMyPostActAdm());
    }

    @Override
    public int getItemCount() {
        return dataHolder.size();
    }

    public class myviewholder extends RecyclerView.ViewHolder {
        TextView postTitleTvSingleRdMyPostActAdm,postDesTvSingleRdMyPostActAdm;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            postTitleTvSingleRdMyPostActAdm =itemView.findViewById(R.id.postTitleTvSingleRdMyPostActAdm);
            postDesTvSingleRdMyPostActAdm = itemView.findViewById(R.id.postDesTvSingleRdMyPostActAdm);
        }
    }
}
