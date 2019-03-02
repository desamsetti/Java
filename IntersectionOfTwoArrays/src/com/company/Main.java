package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        for(int i=0;i<nums1.length;i++)
        {
            set1.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++)
        {
            set2.add(nums2[i]);
        }

        
    }
}
