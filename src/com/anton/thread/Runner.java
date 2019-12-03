package com.anton.thread;

public class Runner {
    public static void main(String[] args) {
        System.out.println(new MyThread("Второй поток").getState());

        MyRunnable one = new MyRunnable("one");
        MyRunnable two = new MyRunnable("two");
        Thread thr1 = new Thread(one);
        Thread thr2 = new Thread(two);
        System.out.println("one:" + thr1.getState() + " two:" + thr2.getState());
        thr1.start();
        thr2.start();
        System.out.println("one:" + thr1.getState() + " two:" + thr2.getState());
        try {
            thr1.join();
            System.out.println("one:" + thr1.getState() + " two:" + thr2.getState());
            thr2.join();
            System.out.println("one:" + thr1.getState() + " two" + thr2.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
