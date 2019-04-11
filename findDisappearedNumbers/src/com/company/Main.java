package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] inputArray = {4,3,2,7,8,2,3,1};
        List<Integer> list = findDisappearedNumbers(inputArray);
        for(Integer i:list){
            System.out.println(i);
        }
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list1 = new ArrayList<Integer>();
        boolean[] checkArray = new boolean[nums.length+1];
        for(int i:nums){
            checkArray[i] = true;
        }
        if(nums.length<1){
            return list1;
        }
        for(int i=1;i<checkArray.length;i++){
            if(!checkArray[i]){
                list1.add(i);
            }
        }
        return list1;
    }
}
