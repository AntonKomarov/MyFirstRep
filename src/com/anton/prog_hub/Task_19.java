package com.anton.prog_hub;

class Task_19 {
    int x = 3;
    void printX() {
        System.out.println(x);
    }
}

class Children extends Task_19{
    int x = 0;
    public static void main(String[] args) {
        Task_19 o = new Children();
        Children p = new Children();
        System.out.println(o.x);
        System.out.println(p.x);
        p.printX();
        new Children().printX();
    }
}
