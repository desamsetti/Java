package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] inputArray = {-4,-1,0,3,10};
        int[] outputArray = sortedSquares(inputArray);
        for(int i:outputArray){
            System.out.println(i);
        }
    }
    public static int[] sortedSquares(int[] A) {
        for(int i=0;i<A.length;i++){
            A[i] = A[i]*A[i];
        }
        Arrays.sort(A);
        return A;
    }
}
