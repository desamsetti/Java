package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] Input =  {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> output = groupAnagrams(Input);
        /*[
        ["ate","eat","tea"],
        ["nat","tan"],
        ["bat"]
        ]*/

        for(List<String> l:output){
            for(int i=0;i<l.size();i++){
                System.out.print(l.get(i)+",");
            }
            System.out.println();
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupedAnagrams = new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<String,List<String>>();
        for(int i=0;i< strs.length;i++){
            char[] inputArray = strs[i].toCharArray();
            Arrays.sort(inputArray);
            String sorted = new String(inputArray);
            if(!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<String>());
            }
            map.get(sorted).add(strs[i]);
        }
        groupedAnagrams.addAll(map.values());
        return groupedAnagrams;
    }
}