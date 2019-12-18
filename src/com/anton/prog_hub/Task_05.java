package com.anton.prog_hub;

public class Task_05 extends A{
    public int i = 1;
    public int getI(){
        return this.i;
    }
    public static void main(String[] args) {
        A a = new Task_05();
        Task_05 b = new Task_05();
        System.out.println(b.getI());
        System.out.println(a.i);
        System.out.println((new Task_05()).i);
        System.out.println((new A().i));
        System.out.println(((A)new Task_05()).i);
    }
}

class A{
    public int i = 2;
}
