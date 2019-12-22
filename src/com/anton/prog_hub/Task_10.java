package com.anton.prog_hub;

class AA{
    public void process(){
        System.out.println("A ");
    }
}

class BB extends AA{
    public void process() throws RuntimeException {
        super.process();
        if (true) throw new RuntimeException();
        System.out.println("B ");
    }

    public static void main(String[] args) {
        try{
            ((AA) new BB()).process();
        }
        catch (Exception e){
            System.out.println("Exception ");
        }
    }
}