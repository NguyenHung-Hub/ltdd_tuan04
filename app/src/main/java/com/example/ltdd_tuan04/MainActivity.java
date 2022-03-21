package com.example.ltdd_tuan04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ListView lv_donut;
    private DonutListView donutListView;
    private ArrayList<Donut> donut_list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        donut_list.add(new Donut(1, "Tasty Donut", "Spicy tasty donut family", 10.00));
        donut_list.add(new Donut(2, "Pink Donut", "Spicy tasty donut family", 20.00));

        lv_donut = findViewById(R.id.lv_donut);
        donutListView = new DonutListView(donut_list);
        lv_donut.setAdapter(donutListView);

        for (Donut item:
             donut_list) {
            System.out.println(item);
        }

    }
}