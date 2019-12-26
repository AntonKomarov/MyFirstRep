package com.anton.service;

@Service(name = "Lazy Service", lazyload = true)
public class LazyService {

    @Init
    public void start() throws Exception{
        System.out.println("Lazy Service started");
    }
    
    public void stop(){
        System.out.println("Lazy Service stoped");
    }

    public LazyService(){
        System.out.println("Создан экземпляр Lazy Service");
    }
}
