package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] input = {7,1,5,3,6,4};
        System.out.println(maxProfit(input));
    }

    public static int maxProfit(int[] prices) {
        if(prices.length == 0 ) return 0;
        int buy = prices[0];
        int max = 0;
        for(int i=1;i<prices.length;i++){
            max = Math.max(max,prices[i]-buy);
            buy = Math.min(buy,prices[i]);
        }
        return max;
    }
}
