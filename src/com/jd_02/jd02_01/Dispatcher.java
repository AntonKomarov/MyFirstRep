package com.jd_02.jd02_01;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher extends Thread {
    static int kSpeed = 1000;
    static volatile int countBuyer = 0;
    static final int PLAN = 100;
    static volatile int countCompeteBuyers = 0;

    static List<Thread> cashiers = new ArrayList<>();

    @Override
    public void run() {
        while (countCompeteBuyers < PLAN) {
            if ((QueueBuyer.getCountBuyer() > cashiers.size() * 5) && (cashiers.size() < 5)) {
                Thread cashier = new Thread(new Cashier(cashiers.size()+1));
                cashiers.add(cashier);
                cashier.start();
            }
            Helper.sleep(1000);
        }
    }
}

