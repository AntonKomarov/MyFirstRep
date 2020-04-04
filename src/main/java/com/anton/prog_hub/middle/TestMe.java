package com.anton.prog_hub.middle;

public class TestMe {
    TestMe(){ System.out.println("construction TestMe"); }
    
    public Integer variable = 1;

    private static int i = 9;

    static { System.out.println("with static"); }

    { System.out.println("without static 3"); }

    { System.out.println("without static"); }

    public static void main(String[] args) {
        TestMe testMe = new TestMeOneMoreTime();
        System.out.println(testMe.variable);
    }
}

class TestMeOneMoreTime extends TestMe {
    TestMeOneMoreTime(){ System.out.println("construction TestMeOneMoreTime"); }
    public Integer variable = 2;
}
