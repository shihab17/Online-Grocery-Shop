package com.example.onlinedailygrocery.model;

public class RecentlyViewed {
    String name;
    String description;
    String price;
    String quantity;
    String unit;
    int imageURL;

    public RecentlyViewed (String name, String description, String price, String quantity, String unit, int imageURL) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getImageURL() {
        return imageURL;
    }

    public void setImageURL(int imageURL) {
        this.imageURL = imageURL;
    }
}
