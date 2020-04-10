package com.epam;

interface Stack {
    public abstract void printg();
}

interface Stook {
    public abstract void printg();

    public static void main(String[] args) {
        System.out.println("interface");
        Stook stook = new N();
        stook.printg();
    }
}

 class N implements Stack, Stook {


    public static void main(String[] args) {
        Stook s = new N();
        s.printg();

    }


     @Override
     public void printg() {

     }
 }


