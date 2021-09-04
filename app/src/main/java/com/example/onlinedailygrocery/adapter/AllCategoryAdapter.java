package com.example.onlinedailygrocery.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onlinedailygrocery.AllCategory;
import com.example.onlinedailygrocery.R;
import com.example.onlinedailygrocery.model.AllCategoryModel;
import com.example.onlinedailygrocery.model.Category;

import java.util.List;

public class AllCategoryAdapter extends RecyclerView.Adapter<AllCategoryAdapter.AllCategoryHolder> {
    Context context;
    List<AllCategoryModel> categoryList;

    public AllCategoryAdapter(Context context, List<AllCategoryModel> categoryList) {
        this.context = context;
        this.categoryList = categoryList;
    }

    @NonNull
    @Override
    public AllCategoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.all_category_row_items,parent,false);
        return new AllCategoryHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AllCategoryHolder holder, int position) {
holder.categoryImage.setImageResource(categoryList.get(position).getImageURL());
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public static class AllCategoryHolder extends RecyclerView.ViewHolder {
        ImageView categoryImage;
        public AllCategoryHolder(@NonNull View itemView) {
            super(itemView);
            categoryImage = itemView.findViewById(R.id.categoryImage);
        }
    }
}
