package com.company;

import java.util.HashMap;

public class Main {
    public static int findNumsOfRepetitions(String s,char c)
    {// Linear Time : O(n) Time
        int sum = 0;
        for(int i = 0;i < s.length();i++) // n , n+1,n
        {
            if(s.charAt(i)==c) // n
            {
                sum = sum + 1; // n
            }
        }
        return sum; // 1
    }
    public static int[] findNumsOfRepetitionsv1(String s,char[] c)
    {// Quad Time : O(n*m) Time
        int[] sums = new int[c.length];
        for(int i=0;i<s.length();i++) //1,n+1,n
        {
            for(int j=0;j<c.length;j++) // n, n*m+1, n*m
            {
                if(s.charAt(i)==c[j])// n*m
                {
                    sums[j]=sums[j]+1;//n*m
                }
            }
        }
        return sums; // 1
    }


    public static int[] findNumsOfRepetitionsv2(String s, char[] c)
    {//Opimal Time : O(n+m)
        int[] sums = new int[c.length];
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        for(int i = 0;i<s.length();i++)
        {
            if(!map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),1);
            }
            else
            {
                int sum = map.get(s.charAt(i));
                map.put(s.charAt(i),sum+1);
            }
        }
        for(int j = 0;j<c.length;j++)
        {
            int sum;
            if(!map.containsKey(c[j]))
            {
                sums[j]= 0;
            }
            else
            {
                sums[j]=map.get(c[j]);
            }
        }
        return sums;
    }



    public static void main(String[] args) {
	// write your code here


        long startTime = System.currentTimeMillis();

        System.out.println(findNumsOfRepetitions("abca",'a'));

        long endTime = System.currentTimeMillis();
        long duration = endTime-startTime;
        System.out.println("Test : "+duration + "ms");

        char[] a = {'a','b'};


         startTime = System.currentTimeMillis();

        System.out.println(findNumsOfRepetitionsv1("abcaasdhausdhaidaoisdioahshdiahdiosjdiwjdilalsjdilkajsdlasjdliajssdliajsdlijalidasalidhailskdnaliksndalsnsdlulasjshndasjdkjasbdaljdjasbdashdialsndasd",a));

         endTime = System.currentTimeMillis();
         duration = endTime-startTime;
        System.out.println("Test : "+duration + "ms");







         startTime = System.currentTimeMillis();

        System.out.println(findNumsOfRepetitionsv2("abcaadalsidijasilsdjasidasahdilasndlkadilandiasndioashdiuiashdouashdoiassdhoiqqdhdaoiusdhaisaosndq09wudjaoilsdihjas098zodijasdo9ilasud09asidja09isduja09psodjaopsdjaosisdj",a));

         endTime = System.currentTimeMillis();
         duration = endTime-startTime;
        System.out.println("Test : "+duration + "ms");



    }
}
