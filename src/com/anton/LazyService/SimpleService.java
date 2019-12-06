package com.anton.LazyService;

@Service(name = "Just simple service")
public class SimpleService {

    @Init()
    public void initialization(){
        System.out.println("Инициализация Simple Service запущена");
    }

    public void halt(){
        System.out.println("Just Simple Service осттановлен");
    }

    public SimpleService(){
        System.out.println("Создан экземпляр Just Simple Service");
    }
}
