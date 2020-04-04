package com.anton.prog_hub.middle;

public class Print1{
    private void print(){ System.out.println(777); }
    void print(Print1 p){ p.print(); }
    public void test(Object o){ System.out.println("Object test"); }
    void over(Integer o){ System.out.println("Integer over"); }

    public String sing() {return "la";}
}

 class Print2 extends Print1{
    public String sing(){return "fa";}
    public void test(Integer o){ System.out.println("Integer test"); }
    @Override
    void over(Integer o){ System.out.println("Override over Integer"); }
    void print(){ System.out.println(666); }

    public static void main(String[] args) {
        Print2 p2 = new Print2();
        Print1 p1 = new Print2();
        System.out.println(p2.sing() + " " + p1.sing());
    }
}
