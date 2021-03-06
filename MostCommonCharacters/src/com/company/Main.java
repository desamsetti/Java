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

        for(int i=0;i<input.length();i++)
        {
            //if(map.containsKey(input.charAt(i)))
            //{
                int count = map.containsKey(input.charAt(i))?map.get(input.charAt(i)):0;
                map.put(input.charAt(i),count+1);
            //}
            /*else
            {

                map.put(input.charAt(i),);
            }*/
        }


        /*for (Character key : map.keySet()) {
            // use the key here
            System.out.print(key+" ");
        }

        System.out.println("******");
        for (Integer value : map.values()) {
            // use the key here
            System.out.print(value+" ");
        }*/

        Map.Entry<Character, Integer> maxEntry = null;
        for(Map.Entry<Character, Integer> e : map.entrySet())
        {
            if(maxEntry==null||e.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = e;
            }
        }
        System.out.println(maxEntry.getKey()+ " is the most occurred character with "+maxEntry.getValue()+" times");






    }
}
