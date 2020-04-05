package com.prog_hub;

public class Task_23 {
    private static boolean methodOne(){
        System.out.println("methodOne");
        return false;
    }
    private static boolean methodTwo(){
        System.out.println("methodTwo");
        return true;
    }
    private static boolean methodThree(){
        System.out.println("methodThree");
        return true;
    }
    public static void main(String[] args) {
        System.out.println(Task_23.methodOne() || Task_23.methodTwo());
//        || Task_23.methodThree() || Task_23.methodOne());
    }
}
