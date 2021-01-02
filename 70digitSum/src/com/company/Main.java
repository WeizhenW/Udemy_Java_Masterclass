package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        sumDigits(123);
        sumDigits(5678);
        sumDigits(9);
    }

    public static int sumDigits(int a) {
        if(a < 10) {
            System.out.println("invalid");
            return -1;
        }
        int sum = 0;

        while(a >= 1) {
            sum += a % 10;
            a = a / 10;
        }

        System.out.println(" digits sum is " + sum);
        return sum;

    }
}
