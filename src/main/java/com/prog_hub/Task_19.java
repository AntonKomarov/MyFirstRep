package com.prog_hub;

class Task_19 {
    int x = 3;
    void printX() {
        System.out.println(x);
    }
}

class Children extends Task_19{
    int x = 0;
    void printX(){
        System.out.println(x);
    }
    public static void main(String[] args) {
        Task_19 o = new Children();
        Children p = new Children();
        o.printX();
    }
}
