package com.jd_02.jd02_01;

public class Good {

    private String name;

    private double price;

    Good(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void setName(String name) { this.name=name; }

    public void setPrice(double price) { this.price=price; }

    public String getName() { return name; }

    public double getPrice() { return price; }

    @Override
    public String toString() { return name ; }
}
