package com.company;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence that is to be capitalized : ");
        String str1 = sc.nextLine();
        System.out.println(capitalizeSentence(str1));
        //System.out.println(capitalizeSentence(str1));
    }


    /*public static StringBuilder capitalizeSentence(String input)
    {
        String upper_case_line = "";
        StringBuilder sb = new StringBuilder(input.length());
        String[] array1 = input.split(" ");
        for(int i=0;i<array1.length;i++)
        {
            upper_case_line += Character.toUpperCase(array1[i].charAt(0)) + array1[i].substring(1) + " ";
        }
        sb.append(upper_case_line);
        return sb;
    }*/


    public static String capitalizeSentence(String input)
    {
        String outputString = "";
        for(int i=0;i<input.length();i++)
        {
            if(i==0)
            {
                outputString += Character.toUpperCase(input.charAt(i));
            }
            else if(input.charAt(i-1)==' ')
            {
                outputString += Character.toUpperCase(input.charAt(i));
            }
            else
            {
                outputString += input.charAt(i);
            }
        }
        return outputString;
    }

    /*public static String capitalizeSentence(String input)
    {
        String newString = "";
        String[] array1 = input.split("" );
        char s1 = ' ';
        String s2="";
        for(int i=0;i<array1.length;i++)
        {
            char[] charArray1 = array1[i].toCharArray();
            charArray1[0] = Character.toUpperCase(charArray1[0]);
            array1[i] = charArray1.toString();


            System.out.println(charArray1);
        }

        String finalVal = Character.toString(s1).concat(s2);
        return finalVal;
    }*/
}
