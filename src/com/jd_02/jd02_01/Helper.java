package com.jd_02.jd02_01;


import java.util.Random;

class Helper {
    private static final Random random = new Random(System.currentTimeMillis());

    static int random(int max){
        return fromTo(0, max);
    }

    static int fromTo(int from, int to){
        return from + random.nextInt(to - from + 1);
    }

    static  void sleep(int timeout) {
        try {
            Thread.sleep(timeout/ Dispatcher.kSpeed);
        } catch (InterruptedException e) {
            System.out.println("Unexpected error");
        }
    }
}
