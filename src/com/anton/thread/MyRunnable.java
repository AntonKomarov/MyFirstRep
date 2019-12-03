package com.anton.thread;

public class MyRunnable implements Runnable {

    String name;

    MyRunnable(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + "Цикл№" + i);
            try {
                Thread.sleep(7);
                Thread.yield();
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}
