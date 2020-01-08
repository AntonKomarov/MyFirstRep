package com.anton.prog_hub;

public class Task32 {
    private int anInt = 4;

    public Task32(){
        anInt = 5;
    }

    public static void main(String[] args) {
        Task32 m = new Task32();
        int anInt = 6;
        m.print(anInt);
    }

    public void print(int anInt) {
        System.out.println(anInt);
    }
}
