// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        String x = "";
        while(N > 0)
        {
            int a = N % 2;
            x = a + x;
            N = N / 2;
        }
        //So x is the binary
        
        int counter = 0;
        //Counter initialized with value 0
        for(int i=0;i<x.length();i++)
        {
        //For loop runs till the end of the binary number
            if(x.charAt(i)=='0' && x.charAt(i-1)=='1')
            {
            //If condition to check where 0 starts and previous value of 0 is 1
            int temp = i;
            //Using a temp variable and assigning it the value where 0 is found
             while(x.charAt(temp)!='1')
             {
            //While condition runs till 1 is found and counter as well as temp are increased
              temp++;
              counter++;
              
             if(temp>=x.length())
             {
             //If condition to check if the temp variable is greater than or equal to the binary length and then return 0. This means if binary starts with one and ends with zero like decimal 32 is 100000 in binary and it doesn't end with one.
                 return 0;
             }
             }
             break;
            }
        }
       return counter;
    }
}