package com.prog_hub;

class Task_24 {
    private void print(){
        System.out.println(777);
    }

    void print (Task_24 t){
        t.print();
    }
}

class Print2 extends Task_24 {

    void print () {
        System.out.println(666);
    }

    public static void main(String[] args) {
      Task_24 t = new Task_24();
      Print2 p = new Print2();
      t.print(p);
    }
}
