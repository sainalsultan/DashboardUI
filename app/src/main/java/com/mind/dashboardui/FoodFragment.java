package com.mind.dashboardui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {

    RecyclerView rvPopularFood,rvMoreFood;
    AdapterPopularFood mAdapter;
    AdapterMoreFood mAdapter2;
    String foods[]={"food1","food1"};
    String price[]={"5000","10000"};

    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_food, container, false);


        rvPopularFood   = v.findViewById(R.id.rvPopularFood);
        rvMoreFood      = v.findViewById(R.id.rvMoreFood);

        rvPopularFood.setHasFixedSize(true);
        rvMoreFood.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL,false);
        rvPopularFood.setLayoutManager(layoutManager);

        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(getActivity());
        rvMoreFood.setLayoutManager(layoutManager2);

        ArrayList<DataFood> dataFoods = getData();

        mAdapter = new AdapterPopularFood(dataFoods,getActivity());
        rvPopularFood.setAdapter(mAdapter);

        mAdapter2 = new AdapterMoreFood(dataFoods,getActivity());
        rvMoreFood.setAdapter(mAdapter2);
        return v;
    }

    private ArrayList<DataFood> getData() {
        ArrayList<DataFood> foodArrayList = new ArrayList<>();
        for (int i = 0; i<foods.length;i++){
            DataFood dataFood = new DataFood();
            dataFood.setFoodName(foods[i]);
            dataFood.setPrice(price[i]);
            foodArrayList.add(dataFood);
        }
        return foodArrayList;
    }
}
