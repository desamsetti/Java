package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] inputArray = {"bella","label","roller"};
        List<String> output = commonChars(inputArray);
        for(String c:output){
            System.out.print(c);
        }

    }

    public static List<String> commonChars(String[] A) {
        List<String> res = new ArrayList<String>();
        int[] count = new int[26];
        Arrays.fill(count, Integer.MAX_VALUE);
        for(String str: A){
            int[] map = new int[26];
            for(char c : str.toCharArray()){
                map[c - 'a']++;
            }
            for(int i = 0; i < 26; i++){
                count[i] = Math.min(count[i], map[i]);
            }
        }
        for(int i = 0; i < 26; i++){
            if(count[i] != Integer.MAX_VALUE){
                while(count[i]-- > 0){
                    res.add("" + (char)('a' + i));
                }
            }
        }
        return res;
    }
}
