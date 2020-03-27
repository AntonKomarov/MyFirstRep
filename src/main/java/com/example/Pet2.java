package com.example;

class Pet2 extends Object{
    int x;
    int y;
    int weight;

    Pet2(int x, int y) {
        // вызов конструктора базового класса Object
        super();
        // инициализация переменных
        this.x = 5;
        this.y = 5;
        this.weight = 10;
        // вызов кода конструктора
        this.x = x;
        this.y = y;
    }
}

class Cat2 extends Pet2{
    int tailLength;
    int age;
    Cat2(int x, int y, int age){
        // вызов конструктора базового класса
        super(x,y);
        // инициализация переменных
        this.tailLength = 8;
        // вызов кода конструктора
        this.age = age;
    }
}

