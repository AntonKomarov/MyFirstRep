package com.anton.jd02_01;

public class Cashier implements Runnable {
    private String name;

    Cashier(int number){ name = "Cashier №:" + number; }

    @Override
    public String toString() { return this.name; }

    @Override
    public void run(){
        System.out.println(this + " cashier open");

    }
}
