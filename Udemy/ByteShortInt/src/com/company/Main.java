package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //int myValue = 10000;
        //Integer has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("My Total : "+myTotal);
        //Byte has a width of 8
        byte myByteValue = -128; //-128 to 127  Quarter of an Integer
        byte myNewByteValue = (byte)(myByteValue/2);
        System.out.println("myNewByteValue :"+myNewByteValue);

        //Short has a width of 16
        short myShortValue = -32768; //-32768 to 32767 Half of an Integer

        // Long has a width of 64
        long myLongValue = 100L;
        long exampleLongValue = -9_223_372_036_854_775_808L; // Minimum
        long exampleLongValue1 = 9_223_372_036_854_775_807L; // Maximum



        byte bytevar = 10;
        short shortvar = 20;
        int intvar = 50;
        long longvar = 50000 + 10L*(bytevar +shortvar+intvar);

        System.out.println("LongTotal "+longvar);


        

    }
}
