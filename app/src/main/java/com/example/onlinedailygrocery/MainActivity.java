package com.example.onlinedailygrocery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.onlinedailygrocery.adapter.CategoryAdapter;
import com.example.onlinedailygrocery.adapter.DiscountedProductAdapter;
import com.example.onlinedailygrocery.adapter.RecentlyViewedAdapter;
import com.example.onlinedailygrocery.model.Category;
import com.example.onlinedailygrocery.model.DiscountedProducts;
import com.example.onlinedailygrocery.model.RecentlyViewed;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView discountRecyclerView, categoryRecyclerView, recentlyViewedRecycler;
    DiscountedProductAdapter discountedProductAdapter;
    CategoryAdapter categoryAdapter;
    RecentlyViewedAdapter recentlyViewedAdapter;

    List<DiscountedProducts> discountedProductsList;
    List<Category> categoryList;
    List<RecentlyViewed> recentlyViewedList;

    ImageView allCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        discountRecyclerView = findViewById(R.id.discountedRecyler);
        categoryRecyclerView = findViewById(R.id.categoryRecycler);
        allCategory = findViewById(R.id.allCategoryImage);
        recentlyViewedRecycler = findViewById(R.id.recently_item);

        allCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,AllCategory.class);
                startActivity(i);
            }
        });
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

        //adding data to model
        recentlyViewedList = new ArrayList<>();
        recentlyViewedList.add(new RecentlyViewed("Watermelon","Watermelon has high water content and also provided some fiber ","80","2","KG",R.drawable.card4,R.drawable.b4));
        recentlyViewedList.add(new RecentlyViewed("Papaya","Watermelon has high water content and also provided some fiber ","80","2","KG",R.drawable.card3,R.drawable.b3));
        recentlyViewedList.add(new RecentlyViewed("Strawberry","Watermelon has high water content and also provided some fiber ","80","2","KG",R.drawable.card2,R.drawable.b2));
        recentlyViewedList.add(new RecentlyViewed("Kiwi","Watermelon has high water content and also provided some fiber ","80","2","KG",R.drawable.card1,R.drawable.b1));

        setDiscountedRecycler(discountedProductsList);
        setCategoryRecycler(categoryList);
        setRecentlyViewedRecycler(recentlyViewedList);
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

    private void setRecentlyViewedRecycler(List<RecentlyViewed> recentlyViewedDataList) {
//        Log.d("DataList: ","dataList");
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
        recentlyViewedRecycler.setLayoutManager(layoutManager);
        recentlyViewedAdapter = new RecentlyViewedAdapter(this,recentlyViewedDataList);
        recentlyViewedRecycler.setAdapter(recentlyViewedAdapter);
    }
}