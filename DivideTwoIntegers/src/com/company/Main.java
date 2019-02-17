package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int val = divide(-5,-1231);
        System.out.println(val);

    }


    public static int divide(int dividend, int divisor) {
        int a = Math.abs(dividend);
        int b = Math.abs(divisor);
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
        int val = Math.pow(2,31)-1;
        if(divisor==-2147483648)
        {
            if(signed==true)
            {
                return -val;
            }
            else
            {
                return val;
            }
        }

        if(divisor==1 && dividend!=1)
        {
            return dividend;
        }


        int rem = Integer.MAX_VALUE;
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
