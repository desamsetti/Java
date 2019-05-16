package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
     int[] inputArray= {1,2,3,4,5,6,7,8,9,10};
     int target = 5;
     System.out.println("The index is :"+search(inputArray,target));
    }

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = (low+high) /2;
            if(nums[mid]<target){
                low = mid+1;
            }
            else if(nums[mid]>target){
                high = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }


}
