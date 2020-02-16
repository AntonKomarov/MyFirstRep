package com.anton.prog_hub;

class Singleton {
    private static Singleton s = new Singleton();
    protected Singleton(){
        System.out.println("S");
    }
    public static Singleton getInstance(){
        return s;
    }
}
class Testt{
    public void method(){
        Singleton.getInstance();
    }
    public static void main(String[] str){
        new Testt();
        new Singleton();
    }
}
