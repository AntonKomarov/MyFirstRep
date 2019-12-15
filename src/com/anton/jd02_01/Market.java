package com.anton.jd02_01;

import java.util.ArrayList;
import java.util.List;

public class Market {

    public static void main(String[] args) throws InterruptedException {
        List<Thread> buyerList = new ArrayList<>();
        System.out.println("Market opened");
        new Dispatcher().start();
        while (Dispatcher.countBuyer < Dispatcher.PLAN) {
            int currentCount = Helper.random(2);
                for (int j = 0; j <= currentCount; j++) {
                    if (Dispatcher.countBuyer == Dispatcher.PLAN) {
                        break;
                    }
                    Buyer buyer = new Buyer(++Dispatcher.countBuyer);
                    buyerList.add(buyer);
                    buyer.start();

                }
            Helper.sleep(1000);
        }
        for(Thread buyer : buyerList){
            buyer.join();
        }
        System.out.println("Market closed");
    }
}

