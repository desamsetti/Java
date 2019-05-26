package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int input = 1;
        System.out.println(countAndSay(input));

    }
    public static String countAndSay(int n) {
        String s = "1";
        if(n==1) return s;
        for(int i=0;i<n-1;i++){
            s=transfer(s);
        }
        return s;
    }
    public static String transfer(String s){
        char[] arr=s.toCharArray();
        String res="";
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]) count++;
            else{
                res=res+count+arr[i-1];
                count=1;
            }
        }
        res=res+count+arr[arr.length-1];
        return res;
    }
}
