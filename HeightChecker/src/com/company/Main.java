package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] input = {1,1,4,2,1,3};
        System.out.println(heightChecker(input));
    }

    public static int heightChecker(int[] heights) {
        int[] temp = heights.clone();
        Arrays.sort(temp);
        int output = 0;
        for(int i=0;i<heights.length;i++) {
            if (heights[i] != temp[i]) {
                output++;
            }
        }
        return output;
    }
}
