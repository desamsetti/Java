package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //String input = "A man, a plan, a canal: Panama";
        //System.out.println(isPalindrome(input));
        String input = "aha";
        StringBuilder sb = new StringBuilder(input);
        System.out.println(sb.reverse());
        System.out.println(input);
        System.out.println(sb.reverse().toString().equals(input));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        String newString = sb.toString().toLowerCase();
        String reversedString = sb.reverse().toString().toLowerCase();
        return newString.equals(reversedString);
    }


}
