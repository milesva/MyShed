package com.example.myapplication.adapter;

import android.content.Context;
import android.telecom.TelecomManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.database.enity.ItemShed;

import java.util.ArrayList;
import java.util.List;

public class ListItemShedApapter extends RecyclerView.Adapter<ListItemShedApapter.MyHolder> {
    Context context;
    ArrayList<ItemShed> itemSheds;

    public ListItemShedApapter(Context context, ArrayList<ItemShed> itemSheds){
        this.context=context;
        this.itemSheds=itemSheds;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shed, parent, false);
        return new ListItemShedApapter.MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.textViewTime.setText(itemSheds.get(position).getTime());
        holder.textViewAddress.setText(itemSheds.get(position).getAddress());
        holder.textViewObject.setText(itemSheds.get(position).getObject());
        holder.textViewTeacher.setText(itemSheds.get(position).getTeacher());
    }

    @Override
    public int getItemCount() {
        return itemSheds.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{

        TextView textViewObject;
        TextView textViewTeacher;
        TextView textViewAddress;
        TextView textViewTime;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            textViewObject=itemView.findViewById(R.id.textView_object);
            textViewTeacher=itemView.findViewById(R.id.textView_teacher);
            textViewAddress=itemView.findViewById(R.id.textView_address);
            textViewTime=itemView.findViewById(R.id.textView_time);
        }
    }
}
