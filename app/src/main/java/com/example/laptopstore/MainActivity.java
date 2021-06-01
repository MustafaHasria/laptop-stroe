package com.example.laptopstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //region Components
    RecyclerView mainRecyclerViewLaptops;
    RecyclerView mainRecyclerViewLaptopsHorizontal;
    List<LaptopModel> laptopModelList;
    LaptopAdapter laptopAdapter;
    //endregion

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainRecyclerViewLaptops = findViewById(R.id.main_recycler_view_laptops);
        mainRecyclerViewLaptopsHorizontal = findViewById(R.id.main_recycler_view_laptops_horizontal);
        laptopModelList = new ArrayList<>();

        laptopModelList.add(new LaptopModel("fx505", true, "ASUS", "china", 1500));
        laptopModelList.add(new LaptopModel("ts16", false, "Apple", "MC", 100000));
        laptopModelList.add(new LaptopModel("f1234", true, "Lenovo", "VM", 5000));
        laptopModelList.add(new LaptopModel("xp2", false, "HP", "Tic", 6000));
        laptopModelList.add(new LaptopModel("xp2", false, "HP", "Tic", 6000));
        laptopModelList.add(new LaptopModel("xp2", false, "HP", "Tic", 6000));
        laptopModelList.add(new LaptopModel("xp2", false, "HP", "Tic", 6000));
        laptopModelList.add(new LaptopModel("xp2", false, "HP", "Tic", 6000));
        laptopModelList.add(new LaptopModel("xp2", false, "HP", "Tic", 6000));
        laptopModelList.add(new LaptopModel("xp2", false, "HP", "Tic", 6000));
        laptopModelList.add(new LaptopModel("xp2", false, "HP", "Tic", 6000));
        laptopModelList.add(new LaptopModel("xp2", false, "HP", "Tic", 6000));
        laptopModelList.add(new LaptopModel("xp2", false, "HP", "Tic", 6000));
        laptopModelList.add(new LaptopModel("xp2", false, "HP", "Tic", 6000));
        laptopModelList.add(new LaptopModel("op123", true, "ASUS", "Ger", 200));
        laptopModelList.add(new LaptopModel("op123", true, "ASUS", "Ger", 200));
        laptopModelList.add(new LaptopModel("op123", true, "ASUS", "Ger", 200));
        laptopModelList.add(new LaptopModel("op123", true, "ASUS", "Ger", 200));
        laptopModelList.add(new LaptopModel("op123", true, "ASUS", "Ger", 200));
        laptopModelList.add(new LaptopModel("op123", true, "ASUS", "Ger", 200));
        laptopModelList.add(new LaptopModel("op123", true, "ASUS", "Ger", 200));
        laptopModelList.add(new LaptopModel("op123", true, "ASUS", "Ger", 200));

        LaptopModel laptopModelAsus = new LaptopModel("15", true, "ASUS", "chain", 1500);

        laptopAdapter = new LaptopAdapter(laptopModelList);
        mainRecyclerViewLaptops.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        mainRecyclerViewLaptops.setAdapter(laptopAdapter);

        mainRecyclerViewLaptopsHorizontal.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        mainRecyclerViewLaptopsHorizontal.setAdapter(laptopAdapter);
    }

}