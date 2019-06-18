package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int x = 123;
        System.out.println(reverse(x));
    }

    /*
    123
    output = 30 num = 12
    output = 320 num = 1
    output = 321 num = 0
     */
    public static int reverse(int x){
        if(x> Integer.MAX_VALUE || x<Integer.MIN_VALUE){
            return 0;
        }

        int output = 0;
        long temp = 0l;

        while(x!=0){
            output = output * 10 + x%10;
            temp = temp * 10 + x%10;
            x = x/10;
            if(temp!=output){
                return 0;
            }
        }

        if(temp!=output){
            return 0;
        }
        return output;
    }
}