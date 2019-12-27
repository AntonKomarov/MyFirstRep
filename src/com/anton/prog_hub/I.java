package com.anton.prog_hub;

interface I {
    public final static int EASY = 5;
}

class Main implements I{
    public static void main(String[] args) {
        int a = 5;
        test(++a);
    }

    static void test(int a){
    a += EASY + a++;
        System.out.println(a);
    }
}
