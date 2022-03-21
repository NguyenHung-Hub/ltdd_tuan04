package com.example.ltdd_tuan04;

import java.io.Serializable;

public class Donut implements Serializable {

    private int id;
    private String donutName;
    private String description;
    private double price;

    public Donut() {

    }

    public Donut(int id, String donutName, String description, double price) {
        this.id = id;
        this.donutName = donutName;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDonutName() {
        return donutName;
    }

    public void setDonutName(String donutName) {
        this.donutName = donutName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Donut{" +
                "id=" + id +
                ", donutName='" + donutName + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
