package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] input = {1,2,3,4,5,6};
        System.out.println(simpleArraySum(input));
    }

    public static int simpleArraySum(int[] ar) {
        /*
         * Write your code here.
         */
        int sum = 0;
        for(int i=0;i<ar.length;i++){
            sum += ar[i];
        }
        return sum;
    }
}
