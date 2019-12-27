package com.anton.prog_hub;

class Task_18 {
    public static void main(String[] args) {


        Task_18 a;
        SubClass b;

        a = new Task_18();
        b = new SubClass();

        a = b;
//        b = a;
        

    }
}

class SubClass extends Task_18{}
