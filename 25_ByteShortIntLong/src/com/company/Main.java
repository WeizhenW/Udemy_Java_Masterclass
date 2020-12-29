package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        //int 32 bits
        int myMinInt = Integer.MIN_VALUE;
        int myMaxInt = Integer.MAX_VALUE;
        System.out.println("Integer max = " + myMaxInt);
        System.out.println("Integer min = " + myMinInt);

        //byte 8 bits
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("byte " + minByte + " " + maxByte);

        //short 16 bits
        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("short " + minShort + " " + maxShort);

        //if not put L at the end => will be treated as integer
        long myLongValue = 100000000000L;

        //long 64 bits
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("long " + minLong + " " + maxLong);

        //casting
        short newByte = (short)(minShort / 2);

    }
}
