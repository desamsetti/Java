package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String input = "abbaca";
        String output = removeDuplicates(input);
        System.out.println(output);
    }

    public static String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder();
        for(char c:S.toCharArray()){
            int size = sb.length();
            if(size>0 && sb.charAt(size-1) == c){
                sb.deleteCharAt(size-1);
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }


}
