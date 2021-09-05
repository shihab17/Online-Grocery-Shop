package com.example.onlinedailygrocery.adapter;

import android.content.Context;
import android.content.pm.LabeledIntent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onlinedailygrocery.R;
import com.example.onlinedailygrocery.model.RecentlyViewed;

import java.util.List;

public class RecentlyViewedAdapter extends RecyclerView.Adapter<RecentlyViewedAdapter.RecentlyViewedHolder> {

    Context context;
    List<RecentlyViewed> recyclerViewList;

    public RecentlyViewedAdapter(Context context, List<RecentlyViewed> recyclerViewList) {
        this.context = context;
        this.recyclerViewList = recyclerViewList;
    }

    @NonNull
    @Override
    public RecentlyViewedHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recently_viewed_items, parent, false);
        return new RecentlyViewedHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentlyViewedHolder holder, int position) {
        holder.name.setText(recyclerViewList.get(position).getName());
        holder.description.setText(recyclerViewList.get(position).getDescription());
        holder.price.setText(recyclerViewList.get(position).getPrice());
        holder.qty.setText(recyclerViewList.get(position).getQuantity());
        holder.unit.setText(recyclerViewList.get(position).getUnit());
        holder.bg.setBackgroundResource(recyclerViewList.get(position).getImageURL());


    }

    @Override
    public int getItemCount() {
        return recyclerViewList.size();
    }

    public static class RecentlyViewedHolder extends RecyclerView.ViewHolder {
        TextView name, description, price, qty, unit;
        ConstraintLayout bg;

        public RecentlyViewedHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.product_name);
            description = itemView.findViewById(R.id.description);
            price = itemView.findViewById(R.id.price);
            qty = itemView.findViewById(R.id.qty);
            unit = itemView.findViewById(R.id.unit);
            bg = itemView.findViewById(R.id.recently_layout);
        }
    }
}
