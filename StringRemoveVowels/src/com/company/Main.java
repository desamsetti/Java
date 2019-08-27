package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String input = "This is a String with vowels";
        //String input = "Welcome to geeksforgeeks";
        //String output = removeVowels(input);
        String output = removeVowelsUsingList(input);
        System.out.println(output);
    }

    /*public static String removeVowels(String input){
        StringBuilder newStr = new StringBuilder();
        for(Character c:input.toCharArray()){
            if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
                continue;
            }
            else{
                newStr.append(c);
            }
        }
        return newStr.toString();
    }*/

    public static String removeVowelsUsingList(String input){
        Character[] vowels = {'a','e','i','o','u','A','E','I','O','U'};

        List<Character> newStr = Arrays.asList(vowels);

        StringBuffer sb = new StringBuffer(input);

        for(int i=0;i<sb.length();i++){
            if(newStr.contains(sb.charAt(i))){
                sb.replace(i,i+1,"");
                i--;
            }
        }
        return sb.toString();
    }
}
