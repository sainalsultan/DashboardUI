package com.mind.dashboardui;

public class DataDrink {
    String drinkName;
    String price;
    int img;

    public DataDrink() {

    }

    public DataDrink(String drinkName, String price, int img) {
        this.drinkName = drinkName;
        this.price = price;
        this.img = img;
    }

    public String getdrinkName() {
        return drinkName;
    }

    public void setdrinkName(String drinkName) {
        this.drinkName = drinkName;
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
