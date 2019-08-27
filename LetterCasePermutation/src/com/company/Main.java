package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String input = "a1b2";
        String[] output = letterCasePermutation(input);

        for(String s:output){
            System.out.println(s);
        }
    }

    public static String[] letterCasePermutation(String input){
        String[] outputArray = new String[input.length()];
        for (int i=0;i<input.length();i++){
            StringBuilder stringBuilder = new StringBuilder(input);
            stringBuilder.replace(i,i+1,input.substring(i,i+1).toUpperCase());
            outputArray[i] = stringBuilder.toString();
        }

        return outputArray;
    }
}
