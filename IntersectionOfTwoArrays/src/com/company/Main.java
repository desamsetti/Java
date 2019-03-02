package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //int[] nums1 = {1,2,2,1};
        //int[] nums2 = {2,2};
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        int[] outputArray = intersection(nums1,nums2);

        for(int a:outputArray)
        {
            System.out.print(a+",");
        }
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        HashSet<Integer> set3 = new HashSet<Integer>();
        for(int i=0;i<nums1.length;i++)
        {
            set1.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++)
        {
            set2.add(nums2[i]);
        }

        for(int a:set1)
        {
            if(set2.contains(a))
            {
                set3.add(a);
            }
        }


        int[] outputArray = new int[set3.size()];
        int i=0;
        for(int a:set3)
        {
            outputArray[i] = a;
            i++;
        }

        return outputArray;
    }
}
