package com.anton.prog_hub.middle;

public class Test1 {
    int x = 0;
    void move(int dx){
        x += dx;
    }

    int getX(){
        return x;
    }

    public static void main(String[] args) {
        Child test1 = new Child();
        test1.move(1);
        System.out.println(test1.getX());
    }
}

class Child extends Test1{
    int x =  3;

    void move(int dx){
        move((float) dx);
    }

    void move(float dx){
        x += dx;
    }

    int getX(){
        return x;
    }
}
