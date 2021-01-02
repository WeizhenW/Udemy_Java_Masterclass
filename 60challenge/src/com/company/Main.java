package com.company;

public class Main {

    private static final String INVALID_VALUE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(68, 20));
        System.out.println(getDurationString(3789));
        System.out.println(getDurationString(-1));
        System.out.println(getDurationString(10, 77));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE;
        }

        int hour = minutes / 60;
        int remainingMinutes = minutes % 60;

        String h = makeDoubleDigits(hour);
        String m = makeDoubleDigits(remainingMinutes);
        String s = makeDoubleDigits(seconds);
        return h + "h " + m + "m " + s + "s";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }

    public static String makeDoubleDigits(int a) {
        return (a < 10) ? "0" + a : String.valueOf(a);
    }
}
