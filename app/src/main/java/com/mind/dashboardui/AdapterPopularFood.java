package com.mind.dashboardui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class AdapterPopularFood extends RecyclerView.Adapter<AdapterPopularFood.ViewHolder> {
    List<DataFood> foodList;
    Context context;

    public AdapterPopularFood(List<DataFood> foodList, Context context) {
        this.foodList = foodList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_popular_food,viewGroup,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.foodname.setText(foodList.get(i).getFoodName());
        viewHolder.price.setText("Rp."+foodList.get(i).getPrice());
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView foodname,price;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            foodname    = itemView.findViewById(R.id.tvNameFood);
            price       = itemView.findViewById(R.id.tvPrice);
        }
    }
}
