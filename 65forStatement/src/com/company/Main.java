package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(double i=2; i <= 8; i += 0.5) {
            System.out.println(calculateInterest(10000, i));
        }

        for(double i=8; i >= 2; i -= 0.5) {
            System.out.println(calculateInterest(10000, i));
        }
        int count = 0;
        for(int i=11111; i<22222; i++) {
            if(isPrime(i)) {
                count ++;
                System.out.println(i + " is a prime number");
            }
            if(count == 3) {
                break;
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * interestRate / 100;
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        for(int i=2; i<= (int)Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
