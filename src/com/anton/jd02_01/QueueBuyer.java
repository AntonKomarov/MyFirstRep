package com.anton.jd02_01;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueBuyer {

    private static final Deque<Buyer> deque = new ArrayDeque<>();

    static void addBuyer(Buyer buyer){
        synchronized (deque){
            deque.addLast(buyer);
        }
    }

    static Buyer extractBuyer(){
        synchronized (deque){
            return deque.pollFirst();
        }
    }

    static int getCountBuyer(){
        synchronized (deque){
            return deque.size();
        }
    }
}
