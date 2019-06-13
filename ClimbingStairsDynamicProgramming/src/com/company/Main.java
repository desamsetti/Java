package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Time Complexity : O(N)
        //Space Complexity : O(N)
        int input = 5;
        System.out.println(climbStairs(input));
    }

    public static int climbStairs(int n) {
        if(n<2){
            return n;
        }else{
            //Creating an array of size N
            int[] output = new int[n];
            //Setting the first two possible values
            output[0] = 1;
            output[1] = 2;

            //For loop that runs till N and for each iteration stores the maximum possible ways to climb the stairs
            //For each iteration, there are two ways. Either it is the sum of the array[iteration-1]+1 or
            // array[iteration-1] + array[iteration-2]
            for(int i=2;i<n;i++){
                output[i] = Math.max(output[i-1]+1,output[i-1]+output[i-2]);
            }
            //Returning the output[iteration-1]
            return output[n-1];
        }
    }

    /*public static int climbStairs(int n){
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        if(hashMap.containsKey(n)){
            return hashMap.get(n);
        }
        int result;
        if(n==1 || n==2){
            return n;
        }
        else{
            result = climbStairs(n-1)+climbStairs(n-2);
        }
        hashMap.put(n,result);
        return result;
    }*/
}
