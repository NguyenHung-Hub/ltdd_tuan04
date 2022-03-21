package com.example.ltdd_tuan04;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class DonutListView extends BaseAdapter {
    final ArrayList<Donut> donuts;

    public DonutListView(ArrayList<Donut> donuts) {
        this.donuts = donuts;
    }


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View donutView;
        if (view == null) {
            donutView = View.inflate(viewGroup.getContext(), R.layout.lv_donut, null);
        } else {
            donutView = view;
        }

        Donut donut = (Donut) getItem(i);
        ((TextView) donutView.findViewById(R.id.donut_name)).setText(donut.getDonutName());
        ((TextView) donutView.findViewById(R.id.description)).setText(donut.getDescription());
        ((TextView) donutView.findViewById(R.id.price)).setText(donut.getPrice()+"");

    System.out.println(i);
        return donutView;
    }
}
