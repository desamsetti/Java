package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumFirstAndLastDigit(29));
    }

    public static int sumFirstAndLastDigit(int number){
        int counter = 0;
        int sum = 0;
        int num = number;
        int numOfDigits = 0;
        while(num!=0){
            numOfDigits++;
            num/=10;
        }

        while(number!=0){
            if(counter==0 || counter==numOfDigits-1){
                sum += number%10;
            }
            counter = counter+1;
            number=number/10;
        }

        return sum;
    }
}