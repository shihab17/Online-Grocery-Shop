package com.example.onlinedailygrocery.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onlinedailygrocery.model.DiscountedProducts;

import java.util.List;

public class DiscountedProductAdapter extends RecyclerView.Adapter<DiscountedProductAdapter.DiscountedProductViewHolder> {

    Context context;
    List<DiscountedProducts> discountedProducts;

    @NonNull
    @Override
    public DiscountedProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull DiscountedProductViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return discountedProducts.size();
    }

    public static class DiscountedProductViewHolder extends RecyclerView.ViewHolder {
        public DiscountedProductViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
