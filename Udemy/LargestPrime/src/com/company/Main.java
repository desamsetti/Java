package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int input = 70;
        System.out.println("=====================");
        System.out.println(getLargestPrime(input));
        System.out.println("=====================");
    }

    public static long getLargestPrime(int number){
        long maxPrime = -1;

        while(number%2==0){
            maxPrime = 2;

            number >>=1;
        }


        for(int i=3;i<Math.sqrt(number);i++){
            while(number%i==0){
                maxPrime = i;
                number = number/i;
            }

            if(number>2){
                maxPrime = number;
            }

        }
        return maxPrime;
    }
}
