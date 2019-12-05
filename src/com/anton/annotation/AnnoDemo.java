package com.anton.annotation;

import java.lang.reflect.Method;

@Anno(level = 3, sqlRequest = "Hello World!")
public class AnnoDemo {

    private void doAnno(){
        Class<AnnoDemo> f = AnnoDemo.class;
        Anno a = f.getAnnotation(Anno.class);
        System.out.println("level = " + a.level());
        System.out.println("sqlRequest = " + a.sqlRequest());
    }

    public static void main(String[] args) {
        new AnnoDemo().doAnno();
        Method[] methods = (Anno.class).getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
