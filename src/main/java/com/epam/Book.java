package com.epam;

class Book {
    Book(){

    }
    private String book;
    public void setBook(String boo){
        book = boo;
    }
}

class DF {
    public static void main(String[] args) {
        String s1 = new String("Test");
        String s2 = "Test";
        System.out.println(s1 == s2);
    }


}
