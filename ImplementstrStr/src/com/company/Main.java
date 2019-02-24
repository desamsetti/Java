package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String haystack = "hello", needle = "ll";
        int output = strStr(haystack,needle);
        System.out.println(output);
    }

    public static int strStr(String haystack, String needle) {
        //return haystack.indexOf(needle);
        if(needle==null || needle.length()==0)
        {
            return 0;
        }

        if(haystack==null || needle.length()==0)
        {
            return -1;
        }
        if(haystack.length()<needle.length())
        {
            return -1;
        }
        int hlen = haystack.length();
        int nlen = needle.length();

        for(int i=0;i<hlen;i++)
        {
            if(nlen>hlen-i)
            {
                break;
            }
            if(haystack.charAt(i) == needle.charAt(0))
            {
                boolean success = true;
                for(int j=1;j<nlen;j++)
                {
                    if(haystack.charAt(i+j)!=needle.charAt(j))
                    {
                        success = false;
                        break;
                    }
                }
                if(success)
                {
                    return i;
                }
            }
        }
        return -1;

    }
}
