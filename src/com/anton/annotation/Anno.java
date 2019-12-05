package com.anton.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Anno {
    int level(); // значение обязательно
    boolean lazyLoad()default false; // значение в аннотации необязательно

    String sqlRequest(); // значение обязательно

}
