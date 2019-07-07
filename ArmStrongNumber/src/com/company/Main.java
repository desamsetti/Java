package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int input = 371;
        System.out.println("Is an ArmStrong number : "+isAnArmStrongNumber(input));
    }

    /**
     *  Input : 371
     *  Length = 3
     *  3^3 + 7^3 + 1^3 = 27 + 343 + 1 = 371
     *
     */
    public static boolean isAnArmStrongNumber(int input){
        int counter = 0;
        int tempVal = input;
        int tempVal1 = input;
        while(tempVal!=0){
            counter++;
            tempVal = tempVal/10;
        }
        int sum = 0;
        while(tempVal1!=0){
            sum += Math.pow((tempVal1%10),counter);
            tempVal1 /= 10;
        }
        System.out.println("The sum value is :"+sum);
        if(sum==input){
            return true;
        }
        else{
            return false;
        }
    }
}
