package com.prog_hub;

public class Task_01 {
    // инициализация статическх полей осуществляется в порядке записи
    private static Task_01 instance = new Task_01(); // выводит путь к новому объекту
    private static final int DELTA = 5;
    private static int BASE = 7;
    private int x;

    private Task_01(){
        x = DELTA + BASE; // x = 5
    }

    public static int getBASE(){
        return BASE;
    }

    public static void main(String[] args) {
       System.out.println(Task_01.instance.x);
    }
}
