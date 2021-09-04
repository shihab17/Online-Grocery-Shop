package com.example.onlinedailygrocery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.onlinedailygrocery.adapter.CategoryAdapter;
import com.example.onlinedailygrocery.adapter.DiscountedProductAdapter;
import com.example.onlinedailygrocery.model.Category;
import com.example.onlinedailygrocery.model.DiscountedProducts;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView discountRecyclerView, categoryRecyclerView;
    DiscountedProductAdapter discountedProductAdapter;
    CategoryAdapter categoryAdapter;

    List<DiscountedProducts> discountedProductsList;
    List<Category> categoryList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        discountRecyclerView = findViewById(R.id.discountedRecyler);
        categoryRecyclerView = findViewById(R.id.categoryRecycler);
        //adding data to model
        discountedProductsList = new ArrayList<>();
        discountedProductsList.add(new DiscountedProducts(1, R.drawable.discountberry));
        discountedProductsList.add(new DiscountedProducts(2, R.drawable.discountbrocoli));
        discountedProductsList.add(new DiscountedProducts(3, R.drawable.discountmeat));
        discountedProductsList.add(new DiscountedProducts(4, R.drawable.discountberry));
        discountedProductsList.add(new DiscountedProducts(5, R.drawable.discountbrocoli));
        discountedProductsList.add(new DiscountedProducts(6, R.drawable.discountmeat));

        //adding data to model
        categoryList = new ArrayList<>();
        categoryList.add(new Category(1, R.drawable.ic_fruits));
        categoryList.add(new Category(2, R.drawable.ic_home_fish));
        categoryList.add(new Category(3, R.drawable.ic_home_fruits));
        categoryList.add(new Category(4, R.drawable.ic_juce));
        categoryList.add(new Category(5, R.drawable.ic_cookies));
        categoryList.add(new Category(6, R.drawable.ic_home_veggies));
        categoryList.add(new Category(7, R.drawable.ic_egg));
        categoryList.add(new Category(8, R.drawable.ic_meat));
        categoryList.add(new Category(8, R.drawable.ic_meat));
        categoryList.add(new Category(9, R.drawable.ic_drink));

        setDiscountedRecycler(discountedProductsList);
        setCategoryRecycler(categoryList);
    }

    private void setDiscountedRecycler(List<DiscountedProducts> dataList) {
        Log.d("DataList: ","dataList");
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        discountRecyclerView.setLayoutManager(layoutManager);
        discountedProductAdapter = new DiscountedProductAdapter(this,dataList);
        discountRecyclerView.setAdapter(discountedProductAdapter);
    }
    private void setCategoryRecycler(List<Category> categoryDataList) {
//        Log.d("DataList: ","dataList");
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        categoryRecyclerView.setLayoutManager(layoutManager);
        categoryAdapter = new CategoryAdapter(this,categoryDataList);
        categoryRecyclerView.setAdapter(categoryAdapter);
    }
}