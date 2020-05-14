package com.epam;

class Book {
    Book(String s){ }
    private String book;
    public void setBook(String boo){
        book = book; }
}
class DF extends Book{
    DF(String s) {
        super(s);
    }
    public static void main(String[] args) {
        String s1 = new String("Test");
        String s2 = "Test";
        System.out.println(s1 == s2);
    }
}