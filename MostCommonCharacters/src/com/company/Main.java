package com.company;

import jdk.internal.org.objectweb.asm.Label;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Here, we are using a Dictionary of Key and Value types <Character,Integer> to check continuously if the map contains
//the key and if it doesn't, then we are adding the key to the map or else if it contains, then we are increasing the value.


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter the input to check the most occurred character : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        Integer counter = 1;
        for(int i=0;i<input.length();i++)
        {
            if(map.containsKey(input.charAt(i)))
            {
                map.put(input.charAt(i),counter+1);
            }
            else
            {
                map.put(input.charAt(i),1);
            }
        }


        /*for (Character key : map.keySet()) {
            // use the key here
            System.out.println(key);
        }

        for (Integer value : map.values()) {
            // use the key here
            System.out.println(value);
        }*/

        Map.Entry<Character, Integer> maxEntry = null;
        for(Map.Entry<Character, Integer> e : map.entrySet())
        {
            if(maxEntry==null||e.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = e;
                System.out.println(maxEntry.getKey()+ "is the most");
            }
            System.out.println(e.getKey() + ": " + e.getValue());
        }





    }
}
