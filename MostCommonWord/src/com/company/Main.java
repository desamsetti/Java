package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence to see the Most Common Non Banned word");
        String sentence = sc.nextLine();
        //System.out.println("The entered sentence is : "+sentence);


        System.out.print("Enter the number of Banned words : ");
        int n = sc.nextInt();
        String[] banned = new String[n+1];
        for(int i=0;i<n+1;i++)
        {
            banned[i] = sc.nextLine();
        }

        /*System.out.print("The entered words are : ");
        for(int i=0;i<banned.length;i++)
        {
            System.out.print(banned[i]+" ");
        }*/

        //mostCommonWord(sentence,banned);
        System.out.println("The Most Common Word from the Entered sentence is : "+mostCommonWord(sentence,banned));
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        //String[] splitParagraph = paragraph.split(" ");
        Map<String,Integer> m1 = new HashMap<String, Integer>();
        HashSet<String> bannedWords = new HashSet<String>();
        for(String s:banned)
        {
            bannedWords.add(s.toLowerCase());
        }

        for(String word:paragraph.replaceAll("[^a-zA-Z]"," ").toLowerCase().split(" "))
        {
            if(!bannedWords.contains(word)) {
                int count = m1.containsKey(word) ? m1.get(word) : 0;
                m1.put(word, count + 1);
            }

            //m1.put(word,m1.getOrDefault(word,0)+1);
        }

        /*Map.Entry<String, Integer> maxEntry = null;
        for(Map.Entry<String, Integer> e : m1.entrySet())
        {
            if(maxEntry==null||e.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = e;
            }
        }
        System.out.println(maxEntry.getKey()+ " is the most occurred word with "+maxEntry.getValue()+" times");
        return maxEntry.getKey();*/


        String result = "";
        for(String key:m1.keySet())
        {
            if(result.equals("")||m1.get(key)>m1.get(result))
            {
                result = key;
            }
        }
        return result;
    }
}
