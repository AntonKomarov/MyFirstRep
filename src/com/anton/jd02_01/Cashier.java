package com.anton.jd02_01;

public class Cashier implements Runnable {
    private String name;

    Cashier(int number){ name = "Cashier №:" + number; }

    @Override
    public String toString() { return this.name; }

    @Override
    public void run(){
        Buyer b;
        System.out.println(this + " cashier open");
        while((b = QueueBuyer.extractBuyer()) != null){
            System.out.println(this + " service " + b);
            Helper.sleep(Helper.fromTo(2000, 5000));
            System.out.println(b + " bought " + b.goodsInBacket);
            System.out.println(b + " total prise " + b.getTotalPrice() + "BIN");
            System.out.println(this + " finished service for " + b);

            synchronized (b){
                b.notify();
            }
        }
        System.out.println(this + " cashier closed");
        Dispatcher.cashiers.remove(Thread.currentThread());
    }
}
