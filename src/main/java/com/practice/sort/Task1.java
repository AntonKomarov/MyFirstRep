package com.practice.sort;

public class Task1 {
    public static void main(String[] args) {
        if(null instanceof String){ System.out.println("instanceof true"); }
        float amount = 1.0000005F;
        float avalue = 0.0000004F;
        float result = amount - avalue;
        System.out.println(result);
        double sqrt = Math.sqrt(-4);
        System.out.println(sqrt + 1);
        if (Double.isNaN(sqrt)) { System.out.println("So sad"); }
        System.out.println(Double.NaN == sqrt);
        String costForPrint = "5$";
        System.out.println("Цена только для вас " +
                + costForPrint.charAt(0) + getCurrencyName(costForPrint.charAt(1))); }
    public static String getCurrencyName(char symbol) {
        if (symbol == '$') {
            return " долларов";
        }
        else {
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }
}



