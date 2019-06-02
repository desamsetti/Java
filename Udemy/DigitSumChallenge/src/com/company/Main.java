package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number = 125;
        System.out.println("The sum is :"+digitSum(number));
    }

    public static int digitSum(int number){
        int sum = 0;
        while(number!=0){
            sum += number%10;
            number /= 10;
        }
        return sum;
    }
}
