package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String input = "aaabbbccc";
        String output = compress(input);
        System.out.println(output);
    }

    public static String compress(String text){
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        for(int i=0;i<text.length();i++){
            int count = map.containsKey(text.charAt(i))?map.get(text.charAt(i))+1:0+1;
            map.put(text.charAt(i),count);
        }


        StringBuilder str = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry pairs = (Map.Entry)it.next();
            str.append(pairs.getKey());
            str.append(pairs.getValue());
        }
        return str.toString();

    }
}
