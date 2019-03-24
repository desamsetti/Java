package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String input = "Hello";
        System.out.println(detectCapitalUse(input));
    }

    public static boolean detectCapitalUse(String word) {
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                counter++;
            }
        }
        return counter == 0 || counter == 1 || counter == word.length() && (Character.isUpperCase(word.charAt(0)));
    }

    /*public static boolean detectCapitalUse(String word)
        {
            return word.toUpperCase().equals(word) || word.toLowerCase().equals(word)
                    || (word.charAt(0) + word.substring(1,word.length()).toLowerCase()).equals(word);
        }*/
}
