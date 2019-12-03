package com.anton.thread;

public class Runner {
    public static void main(String[] args) {
        new MyThread("Второй поток").start();
    }
}
