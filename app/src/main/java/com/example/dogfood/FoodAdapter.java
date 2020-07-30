package com.example.dogfood;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import static androidx.recyclerview.widget.RecyclerView.*;

public class FoodAdapter extends  RecyclerView.Adapter<FoodAdapter.ViewHolder> {
    private FoodListData[] listdata;

    public FoodAdapter(FoodListData[] listdata) {
        this.listdata = listdata;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.foodlist_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView dFoodImage;
        public TextView dtextView1;
        public TextView dtextView2;
        public Spinner spinner;
        public ConstraintLayout constraintLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            this.dFoodImage = (ImageView) itemView.findViewById(R.id.dFoodImage);
            this.dtextView1 = (TextView) itemView.findViewById(R.id.dTextView1);
            this.dtextView2 = (TextView) itemView.findViewById(R.id.dTextView2);
            this.spinner =(Spinner) itemView.findViewById(R.id.spinner);
            constraintLayout = (ConstraintLayout) itemView.findViewById(R.id.constraintlayout);
        }
    }




}
