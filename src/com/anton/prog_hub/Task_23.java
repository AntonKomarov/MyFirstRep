package com.anton.prog_hub;

public class Task_23 {
    public static boolean methodOne(){
        System.out.println("methodOne");
        return false;
    }

    private static boolean methodTwo(){
        System.out.println("methdTwo");
        return true;
    }

    public static boolean methodThree(){
        System.out.println("methodThree");
        return true;
    }
    public static void main(String[] args) {
        System.out.println(Task_23.methodOne() || Task_23.methodTwo() || Task_23.methodThree());

    }
}
