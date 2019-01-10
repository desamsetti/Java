package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashSet<Integer> hashSet = new HashSet<Integer>();

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(int i=100;i<=999;i++)
        {
            for(int j=100;j<=999;j++)
            {
                arrayList.add(i*j);
            }
        }

        hashSet = findOutPalindromes(arrayList);

        List sortedList = new ArrayList(hashSet);

        Collections.sort(sortedList);

        for(int i=0;i<sortedList.size();i++)
        {
            System.out.println(sortedList.get(i));
        }

        /*for (Integer s : hashSet) {
            System.out.println(s);
        }*/

    }

    private static HashSet<Integer> findOutPalindromes(ArrayList<Integer> arrayList)
    {
        String intStr = "";
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for(int i=0;i<arrayList.size();i++)
        {

            intStr = String.valueOf(arrayList.get(i));
            if(intStr.equals(new StringBuilder(intStr).reverse().toString()))
            {
                hashSet.add(arrayList.get(i));
            }
        }
        return hashSet;
    }
}
