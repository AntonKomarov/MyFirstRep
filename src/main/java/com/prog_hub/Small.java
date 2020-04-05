package com.prog_hub;

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
//    public Integer growUp(){
//        System.out.println("I'm not so big");
//        return 5;
//    }
    protected Float growUp(float f){
        System.out.println("I want to be bigger");
        return 5f;
    }
}
