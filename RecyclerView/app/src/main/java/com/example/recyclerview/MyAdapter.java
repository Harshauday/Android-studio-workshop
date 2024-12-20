package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.HoldView> {
    Context ct;
    String names[];
    int images[];

    public MyAdapter(Context ct, String[] name, int[] images) {
        this.ct = ct;
        this.names = name;
        this.images = images;
    }

    @NonNull
    @Override
    public MyAdapter.HoldView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HoldView(LayoutInflater.from(ct).inflate(R.layout.row,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.HoldView holder, int position) {
        holder.iv.setImageResource(images[position]);
        holder.tv.setText(names[position]);

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class HoldView extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView tv;
        public HoldView(@NonNull View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.iv);
            tv = itemView.findViewById(R.id.tv);
        }
    }
}
