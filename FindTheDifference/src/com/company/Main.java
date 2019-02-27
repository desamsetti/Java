package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s,t));
    }

    public static char findTheDifference(String s, String t) {
        char result = '0';
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        for(int i=0;i<t.length();i++)
        {
            if(map.containsKey(t.charAt(i)))
                map.put(t.charAt(i),map.get(t.charAt(i))+1);
            else
                map.put(t.charAt(i),1);
        }

        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
            }
        }


        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            if(entry.getValue()==1)
                result = entry.getKey();
        }
        return result;
    }
}
