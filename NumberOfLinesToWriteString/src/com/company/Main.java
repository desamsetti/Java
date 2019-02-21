package com.company;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String S = "abcdefghijklmnopqrstuvwxyz";

        //int[] widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        //String S = "bbbcccdddaaa";
        int[] outputArray = numberOfLines(widths,S);
        for(int i=0;i<outputArray.length;i++)
        {
            System.out.println(outputArray[i]);
        }
    }


    public static int[] numberOfLines(int[] widths, String S) {
        if(widths.length==0 || S.length()==0)
        {
            return new int[]{0,0};
        }
        else {
            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            Map<Character, Integer> map1 = new HashMap<Character, Integer>();

            //HashMap with Character and Integer Widths
            for (int i = 0; i < alphabet.length(); i++) {
                map1.put(alphabet.charAt(i), widths[i]);
            }

            int widthSum = 0;
            int lineCounter = 1;
            for (int i = 0; i < S.length(); i++) {
                widthSum += map1.get(S.charAt(i));
                if (widthSum > 100) {
                    lineCounter = lineCounter + 1;
                    widthSum = 0 + map1.get(S.charAt(i));
                }
            }

            return new int[]{lineCounter,widthSum};
        }
    }
}