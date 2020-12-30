package com.company;

public class Main {

    public static void main(String[] args) {

        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;

        System.out.println("min float " + minFloat + "max float " + maxFloat);

        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;

        System.out.println("min float " + minDouble + "max float " + maxDouble);

        //double can work with much bigger range of number and more precise - also takes more bits

        int myInt = 5;
        float myFloat = 5.25f;
        double myDouble = 5.25;
        //default to integer(whole number) and double (with decimal)

        System.out.println("input number in pounds:");
        double numberInPounds = 100;
        double resultInKilo = numberInPounds * 0.45359237;
        System.out.println(resultInKilo);

    }
}
