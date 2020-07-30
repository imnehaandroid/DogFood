package com.example.dogfood;

public class FoodListData {
 private int imgId;
 private String description;
 private String qtys;
 private String spinner;

    public FoodListData(int imgId,String description,String qtys,String spinner) {
        this.description = description;
        this.imgId = imgId;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getQty() {
        return qtys;
    }
    public void setImgId(String qtys) {
        this.qtys = qtys;
    }
    public String getspinner() {
        return spinner;
    }
    public void setSpinner(String spinner) {
        this.spinner = spinner;
    } public int getImgId() {
        return imgId;
    }
    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

}
