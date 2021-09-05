package com.example.onlinedailygrocery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductDetails extends AppCompatActivity {
    ImageView img, back;
    TextView productName,productPrice, productDescription,productQuantity, productUnit;
    String name,desc,price,qty, unit;
    int image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_product_details);

        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        image = intent.getIntExtra("image", R.drawable.b1);
        desc = intent.getStringExtra("description");
        qty = intent.getStringExtra("Quantity");
        price = intent.getStringExtra("price");
        unit = intent.getStringExtra("Unit");

        productName = findViewById(R.id.product_name);
        productDescription = findViewById(R.id.prodDesc);
        productPrice = findViewById(R.id.prodPrice);
        productQuantity = findViewById(R.id.qty);
        productUnit = findViewById(R.id.unit);
        img = findViewById(R.id.big_image);
        back = findViewById(R.id.back2);

        productName.setText(name);
        productPrice.setText(price);
        productDescription.setText(desc);
        img.setImageResource(image);

       back.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i = new Intent(ProductDetails.this, MainActivity.class);
               startActivity(i);
               finish();
           }
       });

    }
}