package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int month = 8;
        int day = 5;
        int year = 2015;
        System.out.println(findDay(month,day,year));
        System.out.println(findDay(month,day,year));

    }

    public static String findDay(int month, int day, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().name();
    }
}
