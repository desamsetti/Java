package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int counter = 0;
    public static void main(String[] args) {
	// write your code here
        System.out.print(getNumber(999));

    }


    private static int getNumber(int num)
    {
        List<Integer> newList = new ArrayList<Integer>();
        counter += 1;
        while(num!=0)
        {
            int digit = num%10;
            num /= 10;
            newList.add(digit);
        }

        int multiplyVal = 1;
        for(int i=0;i<newList.size();i++)
        {
            multiplyVal = multiplyVal*newList.get(i);
        }

        if(String.valueOf(multiplyVal).length()!=1)
        {
            getNumber(multiplyVal);
        }

        if(String.valueOf(multiplyVal).length()==1)
        {
            return counter;
        }
        return counter;
    }
}
