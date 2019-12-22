package com.jd_02.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintString {

    public static void main(String[] args) {

        Class<String> stringClassStructure = String.class;
        Method[] methodsStringClass = stringClassStructure.getDeclaredMethods();
        System.out.println(Bean.max(3,5));
        System.out.println(Bean.min(3,5));
        System.out.println(Bean.avg(3,5));

        for (Method stringClassMetod : methodsStringClass) {
            if (!Modifier.isStatic(stringClassMetod.getModifiers())) {
                System.out.println(stringClassMetod.getName());
            }
        }
    }
}