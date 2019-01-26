package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] a = uncommonFromSentences("hello how are you?","hello how are you? Sir");
        for(String s : a)
        {
            System.out.print(s +" ");
        }

    }
    public static String[] uncommonFromSentences(String A, String B) {
        HashSet<String> m1 = new HashSet<String>();
        HashSet<String> m2 = new HashSet<String>();

        for(String s:A.split(""))
        {
            check(s,m1,m2);
        }
        for(String s:B.split(""))
        {
            check(s,m1,m2);
        }
        return m1.toArray(new String[m1.size()]);


    }



    public static void check(String s, Set<String> m1, Set<String> m2)
    {
        if(m1.contains(s) && !m2.contains(s)){
            m2.add(s);
            m1.remove(s);
        }
        else if( !m2.contains(s) && !m1.contains(s)) m1.add(s);

    }
}
