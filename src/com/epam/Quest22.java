package com.epam;

public class Quest22 {

    String java = "Java 11";

        public static void main (String[]args){
        Quest22 q = new Quest22();
        System.out.println(q.java);

        //System.out.println(java); ошибка, поле не static

            String s;
            if((s = "java")=="java"){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }

//            System.out.println(args[2]); IndexOutOfBoundsExeption
    }

    {
        System.out.println("fa");
    }
}
