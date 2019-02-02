package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] array1 = {"abcd","dcba","lls","s","sssll"};
        List<List<Integer>> l1 = palindromePairs(array1);
        System.out.println(l1.size());

    }

    public static List<List<Integer>> palindromePairs(String[] words) {
        String word = "";
        List<List<Integer>> l1 = new ArrayList<List<Integer>>();
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
    }


    public static boolean checkPalindrome(String sentence1,String sentence2)
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
    }
}