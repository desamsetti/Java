package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string : ");
        String str1 = sc.nextLine();
        System.out.println();
        System.out.print("Enter the second string : ");
        String str2 = sc.nextLine();

        if(anagram(str1,str2))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

    }


    public static Boolean anagram(String str, String pair)
    {
        Map<Character,Integer> map1 = new HashMap<Character,Integer>();
        Map<Character,Integer> map2 = new HashMap<Character,Integer>();
        Integer counter1 = 1;
        Integer counter2 = 1;
        for(int i=0;i<str.length();i++)
        {
            int count = map1.containsKey(str.charAt(i))?map1.get(str.charAt(i)):0;
            map1.put(str.charAt(i),count+1);
        }

        for(int i=0;i<pair.length();i++)
        {
            int count = map2.containsKey(pair.charAt(i))?map2.get(str.charAt(i)):0;
            map2.put(pair.charAt(i),count+1);
        }

        if(map1.equals(map2))
        {
            return true;
        }

        return false;
    }

    /*public static Boolean anagram(String str, String pair)
    {

        if(str.length()!=pair.length())
        {
            return false;
        }
        char[] strArr = str.toCharArray();
        char[] pairArr = pair.toCharArray();


        Arrays.sort(strArr);
        str = new String(strArr);

        Arrays.sort(pairArr);
        pair = new String(pairArr);



        if(str.equals(pair)) {
            return true;
        }
        return false;
         /*for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) != pair.charAt(i)){
                return false;
            }
        }*/
    //}*/
}
