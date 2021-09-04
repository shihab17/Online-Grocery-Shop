package com.example.onlinedailygrocery.model;

public class AllCategoryModel {

    Integer id;
    Integer imageURL;

    public AllCategoryModel(Integer id, Integer imageURL) {
        this.id = id;
        this.imageURL = imageURL;
    }


    public Integer getId(){
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getImageURL() {
        return imageURL;
    }

    public void setImageURL(Integer imageURL) {
        this.imageURL = imageURL;
    }
}
