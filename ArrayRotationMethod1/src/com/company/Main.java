package com.company;

public class Main {
    public static void main(String[] args) {
	// write your code here
        //Time Complexity : O(n)  Auxiliary Space : O(d)
        int[] input = new int[]{1,2,3,4,5,6,7};
        int d = 2;
        rotateMethod1(input,d);
    }

    public static void rotateMethod1(int[] input, int d){
        int[] temp = new int[d];
        for(int i=0;i<d;i++){
            temp[i]=input[i];
        }
        int j=0;
        for(int i=d;i<input.length;i++){
            input[j] = input[i];
            j++;
        }


        int k = temp.length-1;
        for(int i=input.length-1;i>=input.length-d;i--){
            input[i] = temp[k];
            k--;
        }
        for(Integer i:input){
            System.out.println(i);
        }
    }
}
