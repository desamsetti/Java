package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int val = divide(2147483647,-2);
        System.out.println(val);

    }


    public static int divide(int dividend, int divisor) {
        int maxInt = 2147483647;
        int minInt = -2147483648;
        if(divisor==-1 && dividend==minInt)
        {
            return maxInt;
        }
        if(Math.abs(divisor)==1)
        {
            if(divisor>0) return dividend;
            else return -dividend;
        }
        long a = Math.abs((long)dividend), b = Math.abs((long)divisor);

        Boolean signed = false;
        if(dividend<0 && divisor<0)
        {
            signed = false;
        }
        if(dividend<0 && divisor>0)
        {
            signed = true;
        }
        if(dividend>0 && divisor<0)
        {
            signed = true;
        }
        if(dividend==divisor)
        {
            return 1;
        }
        if(dividend == divisor-divisor-divisor)
        {
            return 1-1-1;
        }
        else if(divisor==dividend-dividend-dividend)
        {
            return 1-1-1;
        }
        else if(a<b)
        {
            return 0;
        }


        if(divisor==1 && dividend!=1)
        {
            return dividend;
        }


        long rem = Integer.MAX_VALUE;
        int counter = 0;
        while(rem>=b)
        {
            counter++;
            rem = a-b;
            a = rem;
        }
        if(signed==true)
        {
            System.out.println("Counter val is :"+counter);
            return  counter-counter-counter;
        }
        else {
            return counter;
        }
    }
}
