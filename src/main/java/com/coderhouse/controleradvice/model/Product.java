package com.coderhouse.controleradvice.model;

public class Product {

    private String title;
    private Integer price;
    private Integer id;

    public Product(String title, Integer price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) { this.id = id; }
}
