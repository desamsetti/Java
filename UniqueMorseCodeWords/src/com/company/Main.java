package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        String morseArray[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        String morseArray1[] = {"gin", "zen", "gig", "msg"};


        UniqueMorseRepresentationsClass u1 = new UniqueMorseRepresentationsClass();

        System.out.println(u1.uniqueMorseRepresentations(morseArray1));
    }
}
