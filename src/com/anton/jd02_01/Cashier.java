package com.anton.jd02_01;

public class Cashier implements Runnable {
    private String name;

    Cashier(int number){ name = "Cashier №:" + number; }

    @Override
    public String toString() { return this.name; }

    @Override
    public void run(){
        System.out.println(this + " cashier open");
        Buyer b;
        while((b = QueueBuyer.extractBuyer()) != null){
            System.out.println(this + " service " + b);
            Randomize.sleep(Randomize.fromTo(2000, 5000));
            System.out.println(b + "  ");

        }
    }
}
