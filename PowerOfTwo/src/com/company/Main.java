package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int inputValue = 218;
        System.out.println(isPowerOfTwo(inputValue));
    }

    public static boolean isPowerOfTwo(int n) {
        if(n==0)
        {
            return false;
        }


        while(n%2==0)
            n/=2;

        return n == 1;
    }
}
