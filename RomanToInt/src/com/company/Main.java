package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String input = "XC";
        System.out.println(romanToInt(input));
    }

    public static int romanToInt(String s) {
        HashMap<Character,Integer> hashMap = new HashMap<Character, Integer>();
        hashMap.put('I',1);
        hashMap.put('V',5);
        hashMap.put('X',10);
        hashMap.put('L',50);
        hashMap.put('C',100);
        hashMap.put('D',500);
        hashMap.put('M',1000);
        int sum = hashMap.get(s.charAt(s.length()-1));

        int length = s.length();
        if (1 == length) {
            return hashMap.get(s.charAt(0));
        }

        for(int i=s.length()-2;i>=0;i--)
            if(hashMap.get(s.charAt(i))>=hashMap.get(s.charAt(i+1)))
            {
                sum += hashMap.get(s.charAt(i));
            }
            else{
                sum -= hashMap.get(s.charAt(i));
            }
        return sum;
    }
}