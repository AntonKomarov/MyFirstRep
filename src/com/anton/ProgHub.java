package com.anton;

public class ProgHub  extends Thread{
    private int x = 2;
    short[] y;
    short [] z [][];
    int [] a = new int [15];
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
