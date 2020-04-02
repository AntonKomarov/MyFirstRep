package com.anton.prog_hub.middle;

class Q implements Cloneable{
    public int i = 10;
    @Override
    public Q clone() throws CloneNotSupportedException{
        return (Q) super.clone();
    }
}

class R extends Q implements Cloneable{
    public int i = 20;
    @Override
    public R clone() throws CloneNotSupportedException{
        Q cloneQ = super.clone();
        R cloneR = (R) cloneQ;
        System.out.println(cloneR.i + " ");
        return cloneR;
    }
}
public class MyClass {
    public static void main(String[] args) throws CloneNotSupportedException{
        R r = new R();
        Q q = r.clone();
        System.out.println(q.clone().i);
    }
}
