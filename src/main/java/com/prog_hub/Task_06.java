package com.prog_hub;

public class Task_06 {
    public static void main(String[] args) {
        String s1 = new String("string");
        String s2 = new String("STRINg");

        StringBuilder sb1 = new StringBuilder("test");
        StringBuilder sb2 = new StringBuilder("test");

//        System.out.println(s2.charAt(s2.length()-1) == 'g'); // true
//        System.out.println(sb1.equals(sb2)); // false. метод equals() не переопределен
//        System.out.println(s1.equalsIgnoreCase(s2)); // true

        System.out.println(s1.equalsIgnoreCase(s2) && sb1.equals(sb2) && s2.charAt(s2.length()) == 'g');
    }
}
