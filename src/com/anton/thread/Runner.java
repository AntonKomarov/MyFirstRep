package com.anton.thread;

public class Runner {
    public static void main(String[] args) {

        Thread maxPriority =  new MyThread("MaxPriority");
        Thread normPriority = new MyThread("    NormPriority");
        Thread minPriority =  new MyThread("        MinPriority");

        maxPriority.setPriority(Thread.MAX_PRIORITY);
        normPriority.setPriority(Thread.NORM_PRIORITY);
        minPriority.setPriority(Thread.MIN_PRIORITY);

        maxPriority.start();
        normPriority.start();
        minPriority.start();
    }
}
