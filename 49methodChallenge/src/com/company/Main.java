package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("inside main");
        int highScorePosition =  calculateHighScorePosition(1500);
        displayHighScorePosition("bear", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("bear", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("bear", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("bear", highScorePosition);


    }

    public static void displayHighScorePosition (String playName, int position) {
        System.out.println(playName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition (int playScore) {
        if (playScore >= 1000) {
            return 1;
        } else if (playScore >= 500) {
            return 2;
        } else if (playScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }

}
