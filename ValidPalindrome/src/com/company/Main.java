package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //String input = "A man, a plan, a canal: Panama";
        String input = "0P";
        System.out.println(isPalindrome(input));
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
