package com.example;

class Pet2 {
    int x = 5;
    int y = 5;
    int weight = 10;

    Pet2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Cat2 extends Pet2{
    int tailLength = 8;
    int age;
    Cat2(int x, int y, int age){
        super(x,y);
        this.age = age;
    }
}

