package com.mind.dashboardui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterDrink extends RecyclerView.Adapter<AdapterDrink.ViewHolder> {
    List<DataDrink> drinkList;
    Context context;

    public AdapterDrink(List<DataDrink> drinkList, Context context) {
        this.drinkList = drinkList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_more_food,viewGroup,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.foodname.setText(drinkList.get(i).getdrinkName());
        viewHolder.price.setText("Rp."+drinkList.get(i).getPrice());
        viewHolder.img.setImageResource(drinkList.get(i).getImg());
    }

    @Override
    public int getItemCount() {
        return drinkList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView foodname,price;
        public ImageView img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            foodname    = itemView.findViewById(R.id.tvNameFood);
            price       = itemView.findViewById(R.id.tvPrice);
            img         = itemView.findViewById(R.id.img);
        }
    }
}
