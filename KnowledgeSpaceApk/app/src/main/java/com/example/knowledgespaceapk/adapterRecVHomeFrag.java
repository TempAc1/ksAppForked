package com.example.knowledgespaceapk;
import android.animation.Animator;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapterRecVHomeFrag  extends  RecyclerView.Adapter<adapterRecVHomeFrag.myviewholder>{

    // TODO : atif wala dependecy hatana hai dont believe any third party

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
        holder.likeImg.setImageResource(dataHolder.get(position).getLikeImg());
        holder.commentImg.setImageResource(dataHolder.get(position).getCommentImg());
    }

    @Override
    public int getItemCount() {
        return dataHolder.size();
    }

    class myviewholder extends RecyclerView.ViewHolder{

        ImageView img,likeImg,commentImg;
        TextView title,desc;

        public myviewholder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.imageVSingleRowDesRecHomeF);
            title = itemView.findViewById(R.id.titleTxtVSingleRDesRecHomeF);
            desc = itemView.findViewById(R.id.descriptionTxtVSingleRDesRecHomeF);
            likeImg = itemView.findViewById(R.id.likeImgVSingleRDesRecHomeF);
            commentImg = itemView.findViewById(R.id.commentImgVSingleRDesRecHomeF);

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                // Apply activity transition
                commentImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(view.getContext(), "Clicked", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(view.getContext(),commentSc.class);
                        itemView.getContext().startActivity(i);
                    }
                });
            } else {
                // Swap without transition
                commentImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(view.getContext(), "clicked", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(view.getContext(),commentSc.class);
                        itemView.getContext().startActivity(i);
                    }
                });
            }

        }//End myViewHolder
    }//End classMyViewHolder
}
