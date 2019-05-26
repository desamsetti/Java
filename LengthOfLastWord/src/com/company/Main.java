package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String input = "hello world";
        System.out.println(lengthOfLastWord(input));
    }

    public static int lengthOfLastWord(String s) {
        String[] inputArray = s.split(" ");
        if(inputArray.length<1){
            return 0;
        }
        else{
            return inputArray[inputArray.length-1].length();
        }
    }

    /**
     * public int lengthOfLastWord(String s) {
     *     s = s.trim();
     *     int spaceAt = s.lastIndexOf(' ');
     *     return spaceAt != -1 ? s.length() - spaceAt - 1 : s.length();
     * }
     */
}
