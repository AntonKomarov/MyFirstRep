package com.anton.jd02_05;

import java.util.Locale;
import java.util.ResourceBundle;

public class MyLocale {
    public static void main(String[] args) {
        for(Integer j = 0; j < 3; j++){
            char i = j.toString().charAt(0);
            String country = "";
            String language = "";

            switch (i){
                case '1':
                    country = "RU";
                    language = "RU";
                    System.out.println("\n" + i + " - русский");
                    break;
                case '2':
                    country = "BY";
                    language = "BE";
                    System.out.println("\n" + i + " - Белорусский");
                    break;
                default:
                    System.out.println("\n" + i + " - English");
            }
            Locale current = new Locale(language, country);
            ResourceBundle rb = ResourceBundle.getBundle("com.anton.jd02_05", current);
            String s1 = rb.getString("str1");
            System.out.println(s1);
            String s2 = rb.getString("str2");
            System.out.println(s2);
        }
    }
}
