package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] input = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(input,k);
    }

    public static void rotate(int[] nums, int k) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        for(int i=0;i<k;i++){
            int x = list.remove(list.size()-1);
            list.addFirst(x);
        }
        for(int i=0;i<list.size();i++){
            nums[i] = list.get(i);
        }
    }
}
