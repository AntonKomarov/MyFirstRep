package com.prog_hub.middle;

public class Main {
    public static void main(String[] args) {
        Aa a1 = new Aa();
        Aa a2 = new Bb();
        Aa a3 = new Cc();

//        Bb b1 = a2;
        Bb b2 = (Bb) a2;
        Aa a4 = a3;
        Aa a5 = (Aa) a3;
//        Cc c1 = a3;
        Cc c2 = (Cc) a3;
        Aa a6 = (Bb) a3;


    }
}

class Aa{}
class Bb extends Aa{}
class Cc extends Bb{}