package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(numDecodings("226"));


    }


    public static int numDecodings(String s) {
        if(s.length()==0 || s.charAt(0)=='0'){
            return 0;
        }

        int a = 1;
        int b = 1;

        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='0'){
                a=0;
            }
            if(s.charAt(i-1)=='1' || (s.charAt(i-1) =='2' && s.charAt(i) <= '6')){
                a = a+b;
                b = a-b;
            }else{
                b=a;
            }
        }

        return a;
    }
}
