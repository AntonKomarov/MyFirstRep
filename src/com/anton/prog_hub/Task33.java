package com.anton.prog_hub;

public class Task33 {
      static void printt(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
//        Task33 b = new N();
//        Task33.printt(); // b.printt();
        N n = new N();
        n.printt(6);
    }
}

class N extends Task33 {
      void printt(int i){
          super.printt();
        System.out.println("Bye");
    }
}
