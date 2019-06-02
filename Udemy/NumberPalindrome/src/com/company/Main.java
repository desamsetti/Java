package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int input = 1121211;
        System.out.println(isPalindrome(input));
    }

    public static boolean isPalindrome(int number){
        int num = number;
        int output = 0;
        while(number!=0){
            output = output*10;
            output = output+number%10;
            number /=10;
        }
        return output==num;
    }
}
