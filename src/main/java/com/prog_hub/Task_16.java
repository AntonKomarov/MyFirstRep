package com.prog_hub;

public class Task_16 {
    private int leavesCount;
    private String threeName;

    Task_16(int leaves) {
        this.leavesCount = leaves;
        System.out.println("int");
    }

    private Task_16() {
        System.out.println("name: " + threeName + " leaves: " + leavesCount);
    }

    private Task_16(String name) {
        this.threeName = name;
        System.out.println("String");
    }

    public static void main(String[] args) {
        Task_16 bj = new Task_16("first");
        new Task_16();
    }
}
