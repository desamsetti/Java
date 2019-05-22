package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] inputArray = {1,2,2,3};
        System.out.println(isMonotonic(inputArray));
    }

    public static boolean isMonotonic(int[] A) {
        boolean isIncreasing = true, isDecreasing = true;
        for(int i=1;i<A.length;i++) {
            if (A[i] > A[i - 1]) {
                isDecreasing = false;
            } else if (A[i] < A[i - 1]) {
                isIncreasing = false;
            }
            if (!isIncreasing && isDecreasing) {
                return false;
            }
        }
            return isIncreasing||isDecreasing;
    }
}
