package com.anton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Example extends Thread{

    private enum State{
        NEW, INITIALIZING, INITIALIZED
    }

    private static final AtomicInteger atomicCount = new AtomicInteger(0);

    // целлостная ссылка на состояние
    // класс для атомарных операция с ссылкой на объект
    private static final AtomicReference<State> init = new AtomicReference<>(State.NEW);

    @Override
    public void run(){
        System.out.println("Step 0:" + init.get());
        if(!init.compareAndSet(State.NEW, State.INITIALIZING)){
            throw new IllegalStateException("Already initialize");
        }
        System.out.println("Step 1:" + init.get());
        State prev = init.getAndSet(State.INITIALIZED);
        System.out.println("Step 2:" + init.get() + "prev" + prev);
        atomicCount.getAndAdd(1);
    }

    public static void main(String[] args) throws InterruptedException{
        List<Thread> threadList = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            threadList.add(new Example());
            threadList.get(i).start();
        }

        for (Thread thread: threadList){
            thread.join();
        }
        System.out.println("atomicCount=" + atomicCount);
    }
}
