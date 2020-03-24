package com.anton.prog_hub;

class Base {
    Base(int i){
        System.out.println("Base");
    }
}
class Derived extends Base{
    Derived(int i) {
        super(i);
    }

    public static void main(String[] args) {
        Derived d = new Derived(6);
    }
    void Derived(){
        System.out.println("Derived");
    }
}
