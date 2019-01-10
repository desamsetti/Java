package com.company;

import java.util.*;

public class Main {

    //Multiples of 3 and 5
    //Problem 1
    //If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
    //
    //Find the sum of all the multiples of 3 or 5 below 1000.

    public static void main(String[] args) {
	// write your code here
        int sum = 0;
        ArrayList<Integer> list1 = new ArrayList<Integer>();


        for(int i=2;i<1000;i++)
        {
            if(i%3==0 || i%5==0)
            {
                list1.add(i);
            }
        }

        for(int i=0;i<list1.size();i++)
        {
            sum += list1.get(i);
        }
        System.out.println(sum + " is the sum");
    }
}
