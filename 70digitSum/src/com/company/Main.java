package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        sumDigits(123);
//        sumDigits(5678);
//        sumDigits(9);

//        System.out.println("0 " + isPalindrome(0));
//        System.out.println("111 " + isPalindrome(111));
//        System.out.println("1221 " + isPalindrome(1221));
//        System.out.println("-12321 " + isPalindrome(-12321));
//        System.out.println("123 " + isPalindrome(123));

        System.out.println(firstAndLastDigitsSum(1234));
        System.out.println(firstAndLastDigitsSum(10));
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

    public static boolean isPalindrome(int number) {
        int tempNumber = Math.abs(number);
        int reverseNumber = 0;

        while( tempNumber > 0) {
            int lastDigit = tempNumber % 10;
            reverseNumber = (reverseNumber * 10 + lastDigit);
            tempNumber /= 10;
        }
        return reverseNumber == Math.abs(number);
    }

    public static int firstAndLastDigitsSum(int number) {
        if(number < 0) {
            return -1;
        }
        int sum = number % 10;
        while (number >= 10) {
            number /= 10;
        }
        return sum + number;
    }
}
