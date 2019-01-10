package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


//In this program, we are taking the input of the string to be reversed from the user. Using a new string, we are assigning
//the input string from backwards to the new string and then displaying the new string.
//We can also use the StringBuilder and then use the methods.
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some string to display the reverse : ");
        String input = sc.nextLine();
        sc.close();
        System.out.println("The Entered string is : "+ input);

        StringBuilder sb = new StringBuilder(input);

        System.out.println("The Reverse of the Entered string using StringBuilder is : "+sb.reverse().toString());
        System.out.println("The Reverse of the Entered string is : " + reverseString(input));




    }

    public static String reverseString(String input)
    {
        String revString = "";
        for(int i=input.length()-1;i>=0;i--)
        {
            revString += (String.valueOf(input.charAt(i)));
        }
        return revString;
    }
}
