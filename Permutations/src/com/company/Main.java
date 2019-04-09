package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String text="abc";
        String perm="cba";
        System.out.println(isPermutation(text,perm));
    }

    public static boolean isPermutation(String text,String perm){
        char[] textArray = text.toCharArray();
        char[] permArray = perm.toCharArray();
        Arrays.sort(textArray);
        Arrays.sort(permArray);
        for(int i=0;i<text.length();i++){
            if(textArray[i]!=permArray[i]){
                return false;
            }
        }
        return true;
    }

}
