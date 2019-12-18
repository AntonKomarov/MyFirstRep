package com.anton.prog_hub;

public class Task_02 {
    static int method(){
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
            try{
                if (i == 1){
                    throw new Exception();
                }
            } catch (Exception e){
                System.out.println("Exeption!");
                return i;
            } finally {
                System.out.println("Finally block");
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println("method() returned " + method());
    }
}
