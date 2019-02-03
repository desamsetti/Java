package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] inputArray = {"Hello", "Alaska", "Dad", "Peace"};
        String[] outputArray = findWords(inputArray);
        for(int i=0;i<outputArray.length;i++)
        {
            System.out.print(outputArray[i]+" ");
        }

    }

    public static String[] findWords(String[] words) {
        List<String> list = new ArrayList<String>();
        Set<Character> s1 = new HashSet<Character>();
        Set<Character> s2 = new HashSet<Character>();
        Set<Character> s3 = new HashSet<Character>();
        s1.add('q');s1.add('w');s1.add('e');s1.add('r');s1.add('t');s1.add('y');s1.add('u');s1.add('i');s1.add('o');s1.add('p');
        s2.add('a');s2.add('s');s2.add('d');s2.add('f');s2.add('g');s2.add('h');s2.add('j');s2.add('k');s2.add('l');
        s3.add('z');s3.add('x');s3.add('c');s3.add('v');s3.add('b');s3.add('n');s3.add('m');
        for(int i=0;i<words.length;i++)
        {
            Set<Integer> set = new HashSet<Integer>();
            String lowerCase = words[i].toLowerCase();
            for(int j=0;j<lowerCase.length();j++)
            {
                Character c = lowerCase.charAt(j);
                if(s1.contains(c))
                {
                    set.add(1);
                }
                else if(s2.contains(c))
                {
                    set.add(2);
                }
                else if(s2.contains(c))
                {
                    set.add(3);
                }
            }
            if(set.size()==1)
            {
                list.add(words[i]);
            }
        }
        String[] result = new String[list.size()];
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}

/**
 * // Maps each character to the row in the keyboard in which it occurs.
 * private int[] map = {2,3,3,2,1,2,2,2,1,2,2,2,3,3,1,1,1,1,2,1,1,3,1,3,1,3};
 *
 * public String[] findWords(String[] words) {
 *
 *     String[] w = new String[words.length];	// Store filtered words
 *     int index = 0;							// Where to insert the filtered words
 *     for (String s: words)					// for each word in words
 *         if (checkWord(s.toLowerCase()))		// convert it to lowercase and check if all char
 *             w[index++] = s;					// occurs in the same row, if it does, add it
 *     return Arrays.copyOfRange(w, 0, index);	// Simply return a copy of the array from 0
 * }											// index
 *
 * private boolean checkWord(String word){		// Check if all chars in the word belong in the
 *     int row = map[word.charAt(0)-'a'];		// same row. Check first chars row
 *     for (char c: word.toCharArray()){		// For all the chars in the word
 *         if (map[c-'a'] != row)				// if that char belongs to a different row,
 *             return false;					// return false
 *     }
 *     return true;							// All chars in same row, return true.
 * }
 */
