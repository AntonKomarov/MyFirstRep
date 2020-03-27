package com.anton.prog_hub;

interface Ap{
    void go();
    interface B{
        int goTo();
    }
}
class Task_20 implements Ap.B{
    interface C {
        void stop();
    }
    public int goTo(){
        System.out.println("Идём гулять в парк");
        return 5;
    }
    public static void main(String[] args) {
        Task_20 o = new Task_20();
        Task_20.C p = new Task_20.C() {
            @Override
            public void stop() {
                System.out.println("stop");
            }
        };
        p.stop();
        o.goTo();
    }

}

