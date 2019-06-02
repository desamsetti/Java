package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Time Complexity : O(n*d)  Auxiliary Space : O(1)
        int[] input = {1,2,3,4,5,6,7,8};
        int d = 2;
        rotateArrayMethod2(input,d);
    }

    public static void rotateArrayMethod2(int[] input,int d){
        for(int i=0;i<d;i++){
            rotateArray(input);
        }

        for(Integer i:input){
            System.out.println(i);
        }
    }

    public static void rotateArray(int[] input){
        int temp = input[0];
        for(int i=0;i<input.length-1;i++){
            input[i] = input[i+1];
        }
        input[input.length-1] = temp;
    }


}
