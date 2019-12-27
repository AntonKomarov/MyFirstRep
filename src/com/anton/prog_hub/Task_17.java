package com.anton.prog_hub;

class Task_17 {
    Task_17(String s){
        print(s);
    }

    static void print(String created) {
        System.out.println("Task_17: " + created);
    }
}

class Child extends Task_17 {
    Child(String s) {
        super(s);
    }

    public static void print(String s){
        System.out.println("Child: " + s);
    }

    public static void main(String[] args) {
        Child child = new Child("stop");
        print("created");
    }
}