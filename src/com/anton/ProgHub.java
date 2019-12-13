package com.anton;

public class ProgHub  extends Thread{
    public static void main(String[] args) throws Exception {
        try {
            int i = new Integer(10); // boxing
            System.out.println(i);
        } catch(Exception e){
            System.out.println("opsss... error");
        }
    }
}
