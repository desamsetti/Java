package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] inputArray = new int[]{0,1,0,3,12};

        moveZeroes(inputArray);

        for(int i=0;i<inputArray.length;i++)
        {
            System.out.print(" "+inputArray[i]);
        }
    }


    /*public static void moveZeroes(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        while(i<=j)
        {
            if(nums[i]==0 && nums[j]!=0)
            {
                swap(nums,i,j);
                i++;
                j--;
            }
            else if(nums[i]!=0 && nums[j]==0)
            {
                i++;
                j--;
            }
            else if(nums[i]!=0 && nums[j]!=0) {
                i++;
                j--;
            }
            else if(i==j)
            {
                swap(nums,(0+nums.length-1)/2,((0+nums.length-1)/2)+1);
            }
        }
    }*/
    public static void moveZeroes(int[] nums) {
        int snowBallSize = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                snowBallSize++;
            }
            else if(snowBallSize>0)
            {
                int t = nums[i];
                nums[i] = 0;
                nums[i-snowBallSize]=t;
            }
        }
    }

    /*public static void moveZeroes(int[] nums) {
        for(int i=0,j=nums.length-1;i<j;i++)
        {
            if(nums[i]==0 && nums[i+1]!=0)
            {
                swap(nums,i,i+1);
                //System.out.println(nums[i]+" A"+nums[i+1]);
            }
            else if(i==j)
            {
                swap(nums,(nums.length-1)/2,j);
            }
            else if(nums[i]!=0 && nums[i+1]!=0)
            {

            }
        }
    }*/


    public static void swap(int[] inputArray, int i,int j)
    {
        if(i==j)
        {
            return;
        }
        int temp = inputArray[i];
        inputArray[i] = inputArray[j];
        inputArray[j] = temp;
    }
}
