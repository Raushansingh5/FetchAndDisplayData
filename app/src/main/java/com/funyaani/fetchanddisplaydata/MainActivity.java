package com.funyaani.fetchanddisplaydata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<String> dataList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the RecyclerView
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize the data list with predefined data
        dataList = new ArrayList<>();
        dataList.add("John Doe");
        dataList.add("Jane Smith");
        dataList.add("Michael Johnson");
        dataList.add("Emily Davis");
        dataList.add("William Brown");

        // Initialize the adapter and set it to the RecyclerView
        adapter = new MyAdapter(dataList);
        recyclerView.setAdapter(adapter);
    }
}




