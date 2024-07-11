package com.jeffreiljaustin.sample1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {

    private @Id
    @GeneratedValue Long id;
    private String productName;
    private String description;
    private double price;
    private String url;

    Product(){}

    //Constructor
    public Product(String productName, String description, double price, String url) {
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.url = url;
    }

    //Setters
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void seturl(String url) {
        this.url = url;
    }

    //Getters
    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String geturl() {
        return url;
    }
    

}
