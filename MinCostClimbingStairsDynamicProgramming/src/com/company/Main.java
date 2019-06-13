package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] input = {10,15,20};
        int output = minCostClimbingStairs(input);
        System.out.println(output);
    }

    public static int minCostClimbingStairs(int[] cost) {
        for(int i=2;i<cost.length;i++){
            cost[i] += Math.min(cost[i-1],cost[i-2]);
        }
        return Math.min(cost[cost.length-1],cost[cost.length-2]);
    }
}
