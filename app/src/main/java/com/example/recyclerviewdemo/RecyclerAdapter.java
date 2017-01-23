package com.example.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by gc on 22-Jan-17.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>  {
    String[] country_name,country_capital;

    public RecyclerAdapter(String[] country_name,String[] country_capital){
        this.country_name=country_name;
        this.country_capital=country_capital;

    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        RecyclerViewHolder recyclerViewHolder=new RecyclerViewHolder(view);

        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.Tx_Country.setText(country_name[position]);
        holder.Tx_Capital.setText(country_capital[position]);


    }

    @Override
    public int getItemCount() {

        return country_name.length;
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{

        TextView Tx_Country,Tx_Capital;
        public RecyclerViewHolder(View view){
            super(view);
            Tx_Country=(TextView) view.findViewById(R.id.tx_country_name);
            Tx_Capital=(TextView) view.findViewById(R.id.tx_country_name1);
        }


    }
}
