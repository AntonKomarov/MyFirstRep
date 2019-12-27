package com.anton.prog_hub;

public class Task_15 {

}

class B extends Task_15{}
class C extends B{
    public static void main(String[] args) {
        Task_15 obj1 = new Task_15();
        C obj2 = new C();
        obj1 = obj2;
        C obj3 = (C)obj1;
        Task_15 c1 = new C();
    }
}

