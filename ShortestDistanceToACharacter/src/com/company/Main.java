package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] newArray = shortestToChar("loveleetcode",'e');
        for(int i=0;i<newArray.length;i++)
        {
            System.out.print(newArray[i] + ",");
        }
    }

    public static int[] shortestToChar(String S, char C) {
        int n = S.length();
        int[] res = new int[n];
        for (int i = 0; i < n; ++i)
        {
            res[i] = S.charAt(i) == C ? 0 : n;
        }

        for (int i = 1; i < n; ++i)
        {
            res[i] = Math.min(res[i], res[i - 1] + 1);
        }
        for (int i = n - 2; i >= 0; --i)
        {
            res[i] = Math.min(res[i], res[i + 1] + 1);
        }
        return res;
    }

}
