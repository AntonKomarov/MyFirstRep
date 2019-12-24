package com.anton.Factory;

public class Mercedes implements Car{
    @Override
    public void drive() {
        System.out.println("I'm a Mercedes");
    }

    @Override
    public void stop() {
        System.out.println("I'm stopped");
    }
}
