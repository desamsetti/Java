package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printNumber(100);
    }
    public static int printNumber(int n){
        if(n==0){
            System.out.println(0);
            return 0;
        }
        else{
            System.out.println(n);
            return printNumber(n-1);
        }
    }
}
