package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number = 0;
        int finish = 100;
        int count = 0;
        while(number <= finish) {
            number ++;
            if(!isEvenNumber(number)) {
                continue; //bypass the following code and back to the beginning of the loop
            }
            System.out.println("Even number: " + number);
            count ++;
            if(count == 5) {
                break;
            }
        }

        System.out.println(count + " even numbers are found");

        do{
            System.out.println("Even number: " + number);
            number++;
        } while(number < finish);
    }

    public static boolean isEvenNumber(int a) {
        return a % 2 == 0;
    }
}
