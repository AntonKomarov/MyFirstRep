package com.anton.prog_hub;

public class Task_16 {
    int leavesCount;
    String threeName;

    Task_16(int leaves) {
        this.leavesCount = leaves;
        System.out.println("int");
    }

    Task_16() {
        System.out.println("name: " + threeName + " leaves: " + leavesCount);
    }

    Task_16(String name) {
        this.threeName = name;
        System.out.println("String");
    }


    public static void main(String[] args) {
        Task_16 bj = new Task_16("first");
        new Task_16();
    }
}
