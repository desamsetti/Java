package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] inputArray = {1,1,2,3,4,5,5,5,5,6,6,7,8,8,9,10};
        int[] outputArray = removeDuplicates(inputArray);
        for(int i:outputArray){
            System.out.println(i);
        }
    }

    public static int[] removeDuplicates(int[] inputArray){
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for(int i:inputArray){
            hashSet.add(i);
        }
        int[] outputArray = new int[hashSet.size()];
        int i=0;
        for(int x:hashSet){
            outputArray[i]=x;
            i++;
        }
        return outputArray;
    }
}
