package com.example.onlinedailygrocery.model;

public class DiscountedProducts {
    int id;
    String imageURL;

    public DiscountedProducts(int id, String imageURL){
        this.id = id;
        this.imageURL = imageURL;
    }
    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
