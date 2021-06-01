package com.example.laptopstore;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class LaptopAdapter extends RecyclerView.Adapter<LaptopAdapter.LaptopViewHolder> {

    //region Variables
    List<LaptopModel> laptopModelList;
    //endregion

    //region Adapter

    //region Constructor

    public LaptopAdapter(List<LaptopModel> laptopModelList) {
        this.laptopModelList = laptopModelList;
    }

    //endregion

    @NonNull
    @Override
    public LaptopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.laptop_item, parent, false);
        return new LaptopViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LaptopViewHolder holder, int position) {
        holder.laptopItemTextFactoryName.setText(laptopModelList.get(position).getCompany());
        holder.laptopItemTextMadeIn.setText(laptopModelList.get(position).getMadeIn());
        holder.laptopItemTextModel.setText(laptopModelList.get(position).getModel());
        holder.laptopItemTextPrice.setText(String.valueOf(laptopModelList.get(position).getPrice()));

        if (laptopModelList.get(position).isStatus())
            holder.laptopItemTextStatus.setText("New");
        else
            holder.laptopItemTextStatus.setText("Used");

    }

    @Override
    public int getItemCount() {
        return laptopModelList.size();
    }
    //endregion

    //region View holder
    public class LaptopViewHolder extends RecyclerView.ViewHolder {

        //region Components
        TextView laptopItemTextModel;
        TextView laptopItemTextStatus;
        TextView laptopItemTextFactoryName;
        TextView laptopItemTextMadeIn;
        TextView laptopItemTextPrice;
        //endregion

        //region Constructor
        public LaptopViewHolder(@NonNull View itemView) {
            super(itemView);
            laptopItemTextModel = itemView.findViewById(R.id.laptop_item_text_model);
            laptopItemTextStatus = itemView.findViewById(R.id.laptop_item_text_status);
            laptopItemTextFactoryName = itemView.findViewById(R.id.laptop_item_text_factory_name);
            laptopItemTextMadeIn = itemView.findViewById(R.id.laptop_item_text_made_in);
            laptopItemTextPrice = itemView.findViewById(R.id.laptop_item_text_price);
        }
        //endregion
    }
    //endregion
}
