package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "abcdefg";
        int k = 2;

        System.out.println(reverseStr(s,k));
    }

    public static String reverseStr(String s, int k) {
        char[] inputArray = s.toCharArray();

        int left = 0;
        int len = inputArray.length;
        while(left<len)
        {
            if(left+k>=len)
            {
                reverse(inputArray,left,len-1);
            }
            else
            {
                reverse(inputArray,left,left+k-1);
            }
            left += 2*k;
        }
        return new String(inputArray);

    }

    public static void reverse(char[] inputArray, int left, int right)
    {
        while(left<right)
        {
            char temp = inputArray[left];
            inputArray[left++] = inputArray[right];
            inputArray[right--] = temp;
        }
    }
}
