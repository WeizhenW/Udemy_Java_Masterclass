package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(5, 8));
        System.out.println(calcFeetAndInchesToCentimeters(6, 0));
        System.out.println(calcFeetAndInchesToCentimeters(-1, 2));
        System.out.println(calcFeetAndInchesToCentimeters(1, -1));
        System.out.println(calcFeetAndInchesToCentimeters(72));
        System.out.println(calcFeetAndInchesToCentimeters(-1));

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12 ) {
            return -1;
        }

        double totalInches = inches + feet * 12;
        return totalInches * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }

        double feet = Math.floor(inches / 12);
        double inchesRemainder = inches % 12;
        return calcFeetAndInchesToCentimeters(feet, inchesRemainder);
    }
}
