package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //String S = "ab#c";
        //String T = "ad#c";
        String S = "ab##";
        String T = "c#d#";
        System.out.println(backspaceCompare(S,T));
    }

    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> s1 = new Stack<Character>();
        Stack<Character> s2 = new Stack<Character>();

        for(int i=0;i<S.length();i++){
            if(s1.isEmpty() && S.charAt(i)=='#'){
                continue;
            }
            else if(S.charAt(i)=='#'){
                s1.pop();
            }
            else{
                s1.push(S.charAt(i));
            }
        }

        for(int i=0;i<T.length();i++){
            if(s2.isEmpty() && T.charAt(i)=='#'){
                continue;
            }
            else if(T.charAt(i)=='#'){
                s2.pop();
            }
            else{
                s2.push(T.charAt(i));
            }
        }

        if(s1.equals(s2)){
            return true;
        }
        else{
            return false;
        }
    }


}
