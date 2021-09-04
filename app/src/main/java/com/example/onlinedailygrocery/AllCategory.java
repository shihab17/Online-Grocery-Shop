package com.example.onlinedailygrocery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.onlinedailygrocery.adapter.AllCategoryAdapter;
import com.example.onlinedailygrocery.model.AllCategoryModel;

import java.util.ArrayList;
import java.util.List;

public class AllCategory extends AppCompatActivity {
    RecyclerView allCategoryRecycler;
    AllCategoryAdapter allCategoryAdapter;
    List<AllCategoryModel> categoryModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_category);

        allCategoryRecycler = findViewById(R.id.all_category);

        categoryModelList = new ArrayList<>();
        categoryModelList.add(new AllCategoryModel(1, R.drawable.discountberry));
        categoryModelList.add(new AllCategoryModel(2, R.drawable.discountbrocoli));
        categoryModelList.add(new AllCategoryModel(3, R.drawable.discountmeat));
        categoryModelList.add(new AllCategoryModel(4, R.drawable.discountberry));
        categoryModelList.add(new AllCategoryModel(5, R.drawable.discountbrocoli));
        categoryModelList.add(new AllCategoryModel(6, R.drawable.discountmeat));

        setAllCategoryRecycler(categoryModelList);
    }

    private void setAllCategoryRecycler(List<AllCategoryModel> allCategoryModelList) {
//        Log.d("DataList: ","dataList");
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 3);
        allCategoryRecycler.setLayoutManager(layoutManager);
        allCategoryAdapter = new AllCategoryAdapter(this,allCategoryModelList);
        allCategoryRecycler.setAdapter(allCategoryAdapter);
    }
}