package com.anton.service;

import java.lang.reflect.Method;

public class Runner {
    public static void main(String[] args) {
        processServiceCreate(SimpleService.class);
        processServiceCreate(LazyService.class);
    }

    private static void processServiceCreate(Class<?> cls){
        if(cls.isAnnotationPresent(Service.class)){
            Service service = cls.getAnnotation(Service.class);

            cls.getAnnotations();
            cls.getDeclaredAnnotations();

            System.out.println("Поле в Service аннотации name = " + service.name());
            System.out.println("Поле в Service аннотации lazyload = " + service.lazyload());

            if(!service.lazyload()){
                try{
                    Method[] methods = cls.getMethods();
                    Object o = null;
                    for(Method m: methods){
                        if (m.isAnnotationPresent(Init.class)){
                            if (o == null)
                                o = cls.newInstance();
                            m.invoke(o);
                            Init init = m.getAnnotation(Init.class);
                            boolean suprressError = init.suppressExeption();
                            System.out.println("Подавление ошибок " + suprressError);

                        }
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
            else
                System.out.println("Нет аннотации Service в классе" + cls.getName());
        }

    }
}
