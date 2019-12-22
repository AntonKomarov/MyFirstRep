package com.anton.collection;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class MyAtomics {
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    private final AtomicReference<Object> init = new AtomicReference<>();
    private Object someObject = new Object();

    void run(){
        Object o1 = new Object();
        if (!init.compareAndSet(someObject, o1)){
            throw new IllegalStateException("Already initialized");
        }
        Object prev = init.getAndSet(o1);
        init.set(someObject);
    }
}
