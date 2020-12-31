package com.company;

public class Main {

    public static void main(String[] args) {
        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        double result1 = (firstDouble + secondDouble) * 100.00d;
        double remainder1 = result1 % 40.00d;
        boolean isZero = remainder1 == 0 ? true: false;

        System.out.println(isZero);

        if (!isZero) {
            System.out.println("Got some remainder");
        } else {
            System.out.println("no remainder");
        }
    }
}
