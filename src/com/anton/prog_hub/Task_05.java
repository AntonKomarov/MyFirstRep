package com.anton.prog_hub;

public class Task_05 extends A{
    public int i = 1;
    public static void main(String[] args) {
        System.out.println((new Task_05()).i);
        System.out.println((new A().i));
        System.out.println(((A)new Task_05()).i);
    }
}

class A{
    public int i = 2;
}
