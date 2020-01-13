package com.anton.prog_hub;

public class Small {
    Number growUp(){
        System.out.println("I'm big now");
        return 5;
    }
}

class Mediun extends Small{
    protected Number growUp(){
        System.out.println("I'm a small");
        return 5;
    }
}
