package com.example.ex13_year2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class SpinnerAdapt extends BaseAdapter {
    private Context c;
    private int[] flags;
    private String[] names;
    private String[] capitals;
    private LayoutInflater inflater;

    public SpinnerAdapt(Context c, int[] flags, String[] names, String[] capitals) {
        this.c = c;
        this.flags = flags;
        this.names = names;
        this.capitals = capitals;
        inflater = LayoutInflater.from(c);
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int i) {
        return names[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.my_spinner, parent, false);
        ImageView flg = view.findViewById(R.id.flags);
        TextView country = view.findViewById(R.id.country);
        TextView cap = view.findViewById(R.id.capital);
        flg.setImageResource(flags[i]);
        country.setText(names[i]);
        cap.setText(capitals[i]);
        return view;
    }
}
