package com.anton.prog_hub.middle;

public class Test1 {
    int x = 0;
    int f = 5;
    void move(int dx){
        x += dx;
    }

    int getX(){
        return x;
    }

    Test1 getType(){
        return this;
    }

    public static void main(String[] args) {
        Child test1 = new Child();
        test1.move(1);
        System.out.println(test1.getX());

        Test1 test11 = new Child();
        System.out.println(test11.f);
    }
}

class Child extends Test1{
    int x =  3;
    int f = 78;

    void move(int dx){
        move((float) dx);
    }

    void move(float dx){
        x += dx;
    }

    int getX(){
        return x;
    }

    Test1 getType(){
        return this;
    }

    String getType(int i){
        return "this";
    }
}
