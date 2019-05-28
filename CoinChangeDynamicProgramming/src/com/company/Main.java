package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int amount = 11;
        int[] coins = {1,2,5};
        int output = minimumCoinsRequired2(amount,coins);
        System.out.println(output);
    }


    public static int minimumCoinsRequired2(int amount,int[] coins) {
        int max = amount+1;
        int[] dp = new int[max];
        Arrays.fill(dp,max);

        dp[0] = 0;

        for(int i=1;i<=amount;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j]<=i){
                    dp[i] = Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }

    public static int minimumCoinsRequired1(int amount,int[] coins){
        int max = amount+1;
        int[] dp = new int[max];
        Arrays.fill(dp,max);

        dp[0] = 0;

        for(int i=1;i<=amount;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j]<=i){
                    dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }


    public static int minimumCoinsRequired(int amount,int[] coins){
        int max = amount+1;
        int[] dp = new int[max];

        Arrays.fill(dp,max);

        dp[0] = 0;
        for(int i=1;i<=amount;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j]<=i){
                    dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }

        return dp[amount]>amount?-1:dp[amount];
    }
}
