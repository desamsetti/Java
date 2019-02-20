package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //System.out.println(isAnagram("anagram","nagaram"));
        System.out.println(isAnagram("rat","car"));
    }

    public static boolean isAnagram(String s, String t) {
        Map<Character,Integer> map1 = new HashMap<Character, Integer>();
        Map<Character,Integer> map2 = new HashMap<Character, Integer>();

        if(s.length()!=t.length())return false;

        for(int i=0;i<s.length();i++)
        {
            int count1 = map1.containsKey(s.charAt(i))?map1.get(s.charAt(i)):0;
            map1.put(s.charAt(i),count1+1);
            int count2 = map2.containsKey(t.charAt(i))?map2.get(t.charAt(i)):0;
            map2.put(t.charAt(i),count2+1);
        }
        return map1.equals(map2);
    }

}