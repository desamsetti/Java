package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] array1 = {"abcd","dcba","lls","s","sssll"};
        List<List<Integer>> l1 = palindromePairs(array1);
        System.out.println(l1.size());

    }

    /*public static List<List<Integer>> palindromePairs(String[] words) {
        String word = "";
        List<List<Integer>> l1 = new ArrayList<List<Integer>>();
        if (words == null || words.length < 2) return l1;
        for(int i=0;i<words.length-1;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                if(checkPalindrome(words[i],words[j]))
                {
                    List<Integer> l = new ArrayList<Integer>();
                    l.add(i);
                    l.add(j);
                    l1.add(l);
                }
                if(checkPalindrome(words[j],words[i]))
                {
                    List<Integer> l = new ArrayList<Integer>();
                    l.add(j);
                    l.add(i);
                    l1.add(l);
                }
            }
        }
        return l1;
    }*/

    public static List<List<Integer>> palindromePairs(String[] words) {
        String word = "";
        List<List<Integer>> l1 = new ArrayList<List<Integer>>();
        Map<String,Integer> map = new HashMap<String,Integer>();
        if (words == null || words.length < 2) return l1;
        for(int i=0;i<words.length;i++)
        {
            map.put(words[i],i);
        }
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words[i].length();j++)
            {
                String s1 = words[i].substring(0,j);
                String s2 = words[i].substring(j);
                if(checkPalindrome(s1))
                {
                    String str2rvs = new StringBuilder(s2).reverse().toString();
                    if(map.containsKey(str2rvs) && map.get(str2rvs)!=i)
                    {
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(map.get(str2rvs));
                        list.add(i);
                        l1.add(list);
                    }
                }
                if(checkPalindrome(s2))
                {
                    String str1rvs = new StringBuilder(s1).reverse().toString();
                    if(map.containsKey(str1rvs) && map.get(str1rvs)!=i)
                    {
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(map.get(str1rvs));
                        list.add(i);
                        l1.add(list);
                    }
                }
            }
        }
        return l1;
    }


    public static boolean checkPalindrome(String sentence)
    {
        String checkSentence = "";
        for(int i=sentence.length()-1;i>=0;i--)
        {
            checkSentence += sentence.charAt(i);
        }
        if(checkSentence.equalsIgnoreCase(sentence))
        {
            return true;
        }
        else
        {
            return false;
        }
    }



    /*public static boolean checkPalindrome(String sentence1,String sentence2)
    {
        String sentence = sentence1+sentence2;
        String checkSentence = "";
        for(int i=sentence.length()-1;i>=0;i--)
        {
            checkSentence += sentence.charAt(i);
        }
        if(checkSentence.equalsIgnoreCase(sentence))
        {
            return true;
        }
        else
        {
            return false;
        }
    }*/
}