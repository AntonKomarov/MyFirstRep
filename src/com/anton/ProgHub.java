package com.anton;

public class ProgHub  extends Thread{
    private int x = 2;
//    short x [];
    short[] y;
//    short[5] x2;
//    short z2 [5];
    short [] z [][];
//    short[] y2 = [5];

//    Integer i [][] = (4, 5, 6)(1, 2, 3);
    int [] a = new int [15];
//    float f = new float[20];
//    char [] c = "some string";
    Object o = new float[20];


    public static void main(String[] args) throws Exception {
        new ProgHub().makeItSo();

        try {
            int i = new Integer(10);
            System.out.println(i);
        } catch(Exception e){
            System.out.println("opsss... error");
        }
    }

    public ProgHub(){
        x = 5;
        start();
    }

    public void makeItSo() throws Exception{
        join();
        x = x - 1;
        System.out.println(x);
    }

    public void run(){
        x *= 2;
    }
}
