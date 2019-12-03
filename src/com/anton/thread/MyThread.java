package com.anton.thread;

public class MyThread extends Thread{

    MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 40; i++) {
            System.out.println(getName() + " " + i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
