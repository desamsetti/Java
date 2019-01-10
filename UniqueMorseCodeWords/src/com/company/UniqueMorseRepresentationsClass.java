package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueMorseRepresentationsClass {

    public int uniqueMorseRepresentations(String[] words) {
        Map<Character, String> map = new HashMap<Character, String>();

        String morseArray[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};


        //Mapping the alphabets to the Morse code
        int counter = 0;
        for(int i=97;i<=122;i++)
        {

            map.put((char)i,morseArray[counter]);
            counter++;
        }

        //Printing the alphabets and their Morsecodes
        /*for (Map.Entry<Character,String> pair : map.entrySet()){
            //iterate over the pairs
            System.out.println(pair.getKey()+" "+pair.getValue());
        }*/
        String morseString = "";

        Set<String> s1 = new HashSet<String>();
        for(int i=0;i<words.length;i++)
        {
            String word = words[i];

            for(int j=0;j<word.length();j++)
            {
                morseString += map.get(word.charAt(j));
            }
            System.out.println(morseString);

            s1.add(morseString);

            morseString ="";
        }


        return s1.size();
    }
}
