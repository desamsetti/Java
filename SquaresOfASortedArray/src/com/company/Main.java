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
    /*public static int[] sortedSquares(int[] A) {
        for(int i=0;i<A.length;i++){
            A[i] = A[i]*A[i];
        }
        Arrays.sort(A);
        return A;
    }*/
    public static int[] sortedSquares(int[] A) {
        int result[] = new int[A.length];
        int i = 0;
        int j = A.length - 1;
        int index = A.length - 1;
        while(i <= j) {
            if(Math.abs(A[i]) > Math.abs(A[j]))
                result[index--] = A[i] * A[i++];
            else
                result[index--] = A[j] * A[j--];
        }

        return result;
    }
}
