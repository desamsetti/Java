package com.company;

public class Main {
    public static void main(String[] args) {
	// write your code here
        double miles = SpeedConverter.toMilesPerHour(10.5);
        double miles1 = SpeedConverter.toMilesPerHour(15);
        System.out.println("Miles = "+miles);
        System.out.println("Miles = "+miles1);
    }
}