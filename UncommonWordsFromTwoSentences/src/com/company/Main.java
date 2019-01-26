package com.company;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] a = uncommonFromSentences("","banana");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] +" ");
        }

    }
    public static String[] uncommonFromSentences(String A, String B) {
        HashSet<String> ans = new HashSet<String>();
        HashSet<String> dup = new HashSet<String>();
        for(String word: A.split(" ")) check(word, ans, dup);
        for(String word: B.split(" ")) check(word, ans, dup);
        return ans.toArray(new String[ans.size()]);
    }

    public static void check(String word, Set<String> ans, Set<String> dup) {
        if(ans.contains(word) && !dup.contains(word)){
            dup.add(word);
            ans.remove(word);
        }
        else if( !dup.contains(word) && !ans.contains(word)) ans.add(word);
    }
}
