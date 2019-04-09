package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the input to check if it contains Unique Characters : ");
        String input = reader.readLine();

        System.out.println(isUnique(input));
    }

    /*public static boolean isUnique(String text){
        char[] inputArray = text.toCharArray();
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();

        for(int i=0;i<inputArray.length;i++){
            int count = map.containsKey(inputArray[i])?map.get(inputArray[i])+1:0+1;
            map.put(inputArray[i],count);
        }

        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry pairs = (Map.Entry)it.next();
            System.out.println(pairs.getKey()+"==>"+pairs.getValue());
            if(!pairs.getValue().equals(1)){
                return false;
            }
        }
        return true;
    }*/

    public static boolean isUnique(String text){
        Set<Character> set = new HashSet<Character>();
        for(int i=0;i<text.length();i++){
            if(!set.contains(text.charAt(i))){
                set.add(text.charAt(i));
            }else{
                return false;
            }
        }
        return true;
    }
}
