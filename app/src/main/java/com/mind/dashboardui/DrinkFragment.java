package com.mind.dashboardui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class DrinkFragment extends Fragment {

    RecyclerView rvDrink;
    AdapterDrink mAdapter;
    String drinks[]={"drink1","drink2"};
    String price[]={"5000","10000"};
    int img[]={R.drawable.drink,R.drawable.drink};
    public DrinkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_drink, container, false);
        rvDrink = v.findViewById(R.id.rvDrink);
        rvDrink.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        rvDrink.setLayoutManager(layoutManager);

        ArrayList<DataDrink> dataDrinks = getData();

        mAdapter = new AdapterDrink(dataDrinks,getActivity());
        rvDrink.setAdapter(mAdapter);

        return v;
    }

    private ArrayList<DataDrink> getData() {
        ArrayList<DataDrink> dataDrinks = new ArrayList<>();
        for (int i = 0; i<drinks.length;i++){
            DataDrink drink = new DataDrink();
            drink.setdrinkName(drinks[i]);
            drink.setPrice(price[i]);
            drink.setImg(img[i]);
            dataDrinks.add(drink);
        }
        return dataDrinks;
    }

}
