package com.anton.Factory;

public class Geep implements Car {
    @Override
    public void drive() {
        System.out.println("I'm a Geep");
    }

    @Override
    public void stop() {
        System.out.println("I'm stopped");
    }
}
