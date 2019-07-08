package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String input = "hey hello";
        String output = upperCaseConversion(input);
        System.out.println(output);
    }

    public static String upperCaseConversion(String input){
        String[] inputArray = input.split(" ");
        StringBuilder str = new StringBuilder();
        for(int i=0;i<inputArray.length;i++){
            str.append(Character.toUpperCase(inputArray[i].charAt(0))+inputArray[i].substring(1));
            str.append(" ");
        }
        return str.toString();
    }
}
