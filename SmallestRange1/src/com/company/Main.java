package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] A = {1,3,6};
        int K = 3;
        int output = smallestRangeI(A,K);
        System.out.println(output);
    }

    public static int smallestRangeI(int[] A, int K) {
        int minVal = A[0];
        int maxVal = A[0];
        for(int i:A){
            minVal = Math.min(minVal,i);
            maxVal = Math.max(maxVal,i);
        }
        if(minVal+K>maxVal-K){
            return 0;
        }
        return maxVal-minVal - 2*K;
    }
}
