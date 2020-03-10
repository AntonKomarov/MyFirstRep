package com.epam;

public class Quest7 {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();

        book1.setBook("Java 11");
        book2.setBook("Java 11");

        if (book1.equals(book2)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
