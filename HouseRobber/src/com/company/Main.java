package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //int[] inputArray = {1,2,3,1,6,10};
        int[] inputArray = {2,1,1,2};
        int output = rob(inputArray);
        System.out.println(output);
    }


    public static int rob(int[] nums) {
        if(nums.length==0 || nums==null){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        //Created an array
        int[] dp = new int[nums.length];

        //First element value is stored in the first element of table
        dp[0] = nums[0];

        //Second element value is the max of first and second elements and stored in the table
        dp[1] = Math.max(nums[0],nums[1]);

        //For loop starts from 2 to arrays length
        for(int i=2;i<dp.length;i++){
            //Maximum of alternate elements i.e, i and i-2 and i-1 elements are checked and stored in dp[i]
            dp[i] = Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        //Returning the dp[nums.length-1] which is the last element
        return dp[nums.length-1];
    }
}
