package com.company;



import javax.xml.stream.events.Characters;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter the string to find the number of vowels in it : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        findVowels(s);
    }

    public static void findVowels(String s)
    {
        int counter = 0;
        String vowels = "aeiou";

        /*for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            {
                counter = counter + 1;
            }
        }*/

        for(int i=0;i<s.length();i++)
        {
            if(vowels.contains(Character.toString(s.charAt(i))))
            {
                counter = counter + 1;
            }
        }
        System.out.println("The number of vowels in "+s + " is "+counter);
    }
}
