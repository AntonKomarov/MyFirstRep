package com.prog_hub;

public class Task30 {
    public static void main(String[] args) {

    }
}

class At{
    At(){}

    At(int x){
        a(x);
    }

    void a(int x){
        System.out.println("A-a: " + x);
    }
}

class Bt extends At{
//    чтобы не было ошибки компиляци необходим конструктор по умолчанию
    Bt(int x){
        a(x);
    }

    void a(int x){
        System.out.println("B-a: " + x);
    }
}
