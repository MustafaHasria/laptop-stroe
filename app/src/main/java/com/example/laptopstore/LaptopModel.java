package com.example.laptopstore;

public class LaptopModel {

    //region property
    private String model;
    private boolean status;
    private String company;
    private String madeIn;
    private int price;
    //endregion

    //region Constructor
    public LaptopModel(String model, boolean status, String company, String madeIn, int price) {
        this.model = model;
        this.status = status;
        this.company = company;
        this.madeIn = madeIn;
        this.price = price;
    }
    //endregion

    //region Getters & Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    //endregion
}
