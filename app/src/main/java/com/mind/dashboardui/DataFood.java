package com.mind.dashboardui;

public class DataFood {
    String foodName;
    String price;
    int img;

    public DataFood() {

    }

    public DataFood(String foodName, String price, int img) {
        this.foodName = foodName;
        this.price = price;
        this.img = img;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
