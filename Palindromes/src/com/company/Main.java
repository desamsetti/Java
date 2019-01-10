package com.company;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter the input to check for palindrome or not : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Boolean value = palindrome(input);
        sc.close();
        if(value)
        {
            System.out.println("The entered input is a Palindrome");
        }
        else
        {
            System.out.println("The entered input is not a Palindrome");
        }
    }

    public static Boolean palindrome(String input)
    {
        int i=0;
        int j=input.length()-1;
        while(input.charAt(i)==input.charAt(j))
        {
            i++;
            j--;
            if(i==j)
            {
                if(input.charAt(i)==input.charAt(j))
                {
                    return true;
                }
                    return false;
            }
        }
        return false;
    }
}
