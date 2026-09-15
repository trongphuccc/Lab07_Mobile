package com.example.myapplication;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

public class CountryViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private MyAdapter madapter;
    public TextView txtID;
    public TextView tcountry;
    public CountryViewHolder (View item, MyAdapter adapter){
        super(item);
        this.madapter = adapter;
        this.txtID = item.findViewById(R.id.txtID);
        this.tcountry = item.findViewById(R.id.tcountry);
        item.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        String msg = txtID.getText() + " | " + tcountry.getText();
        Toast.makeText(v.getContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
