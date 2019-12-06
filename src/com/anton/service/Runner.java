package com.anton.service;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        processServiceCreate(SimpleService.class);

    }

    static void processServiceCreate(Class<?> cls){
        if(cls.isAnnotationPresent(Service.class)){
            Service service = cls.getAnnotation(Service.class);

            cls.getAnnotations();
            cls.getDeclaredAnnotations();

            System.out.println("Поле в Service аннотации name = " + service.name());
            System.out.println("Поле в Service аннотации lazyload = " + service.lazyload());
        }

    }
}
