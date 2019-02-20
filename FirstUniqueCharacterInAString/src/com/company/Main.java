package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }


    public static int firstUniqChar(String s) {
        int index = -1;
        char[] a = s.toCharArray();

        Map<Character,Integer> m1 = new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++)
        {
            int count = 0;
            count = m1.containsKey(s.charAt(i))?m1.get(s.charAt(i))+1:1;
            m1.put(s.charAt(i),count);
        }


        for(int i = 0; i < a.length; i++){
            if(m1.containsKey(a[i]) && m1.get(a[i])==1){
                return i;
            }
        }
        return index;
    }
}
