package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //int[] numbers = {2,7,11,15};
        //int target = 9;
        int[] numbers = {2,3,4};
        int target = 6;

        int[] outputArray = twoSum(numbers,target);

        for(int i=0;i<outputArray.length;i++)
        {
            System.out.println(outputArray[i]);
        }




    }


    public static int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        int a = 0;
        int b = 0;
        while(i<j){
            if(numbers[i]+numbers[j]>target) {
                j--;
            }
            else if(numbers[i]+numbers[j]<target)
            {
                i++;
            }
            else
            {
                a = ++i;
                b = ++j;
                break;
            }
        }
        return new int[]{a,b};
    }
}