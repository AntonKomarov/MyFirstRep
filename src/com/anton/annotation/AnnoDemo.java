package com.anton.annotation;

@Anno(level = 3, sqlRequest = "Hello World!")
public class AnnoDemo {
    
    void doAnno(){
        Class<AnnoDemo> f = AnnoDemo.class;
        Anno a = f.getAnnotation(Anno.class);
        System.out.println("level = " + a.level());
        System.out.println("sqlRequest = " + a.sqlRequest());
    }

    public static void main(String[] args) {
        new AnnoDemo().doAnno();
    }
}
