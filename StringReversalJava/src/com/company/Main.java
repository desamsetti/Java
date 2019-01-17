package com.company;

public class Main {



    public static void main(String[] args) {
	// write your code here

        System.out.println(reverseWords("Let's take LeetCode contest"));
    }


    public static String reverseWords(String s) {
        String[] array1 = s.split(" ");
        String s2 = "";
        for(String s1:array1) {

            for(int i=s1.length()-1;i>=0;i--) {
                s2 += s1.charAt(i);
            }
            s2 += " ";
        }

        s2 = s2.substring(0,s2.length()-1);

        return s2;
    }

//Using String Builder

    public Main() {
        super();
    }

    /*public String reverseWords(String s) {
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++) str[i] = new StringBuilder(str[i]).reverse().toString();
        StringBuilder result = new StringBuilder();
        for (String st : str) result.append(st + " ");
        return result.toString().trim();
    }*/
}
