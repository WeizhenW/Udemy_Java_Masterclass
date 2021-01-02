package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char n = 'D';
        switch (n) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("a letter " + n + " is found");
                break;

            default:
                System.out.println("nothing found");
                break;
        }

        String month = "January";

        switch (month.toLowerCase()) {
            case "january": case "february": case "march":
                System.out.println("Term 1 is found");
                break;
            case "april": case "may": case "june":
                System.out.println("Term 2 is found");
                break;
            default:
                System.out.println("second half of the year");
                break;
        }

        printDayOfTheWeek(6);
        printDayOfTheWeek(0);
        printDayOfTheWeek(7);


    }

    public static void printDayOfTheWeek(int day) {

        String[] daysOfWeek = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        switch (day){
            case 0: case 1: case 2: case 3: case 4: case 5: case 6:
                System.out.println(daysOfWeek[day]);
                break;
            default:
                System.out.println("invalid");
        }
    }


}
