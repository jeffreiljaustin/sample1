package com.jeffreiljaustin.sample1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ordertb1")
public class Order {

    @Id
    @GeneratedValue 
    private long id;
    private long userId;
    private double totalAmount;
    private String Status;
    
    Order() {

    }

    //constructor
    public Order(long userId, double totalAmount, String status) {
        this.userId = userId;
        this.totalAmount = totalAmount;
        Status = status;
    }

    //getters and setters
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public long getId() {
        return id;
    }

    
}
