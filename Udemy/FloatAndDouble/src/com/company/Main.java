package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Width of int = 32 (4 bytes)
        int myIntValue = 5/2;

        //Width of float = 32 (4 bytes)
        float myFloatValue = 5f/3f;

        //Width of double = 64 ( 8 bytes)

        double myDoubleValue = 5d/3d;
        System.out.println("myIntValue = "+myIntValue);
        System.out.println("myFloatValue = "+myFloatValue);
        System.out.println("myDoubleValue = "+myDoubleValue);


        double numberOfPounds = 200d;
        double numberOfKilograms = numberOfPounds*(0.45359237d);
        System.out.println(numberOfKilograms);


    }
}
