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
    int tailLength = 8;
    int age;
    Cat2(int x, int y, int age){
        super(x,y);
        this.age = age;
    }
}

