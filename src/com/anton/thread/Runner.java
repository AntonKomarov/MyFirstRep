package com.anton.thread;

public class Runner {
    public static void main(String[] args) {
        System.out.println(new MyThread("Второй поток").getState());

        MyRunnable one = new MyRunnable("one");
        Thread thr1 = new Thread(one);
        System.out.println("one:" + thr1.getState());
        thr1.start();
        System.out.println("one:" + thr1.getState());

    }
}
