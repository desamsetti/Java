package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str = "()";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String s) {
        if (s != null) {
            Stack<Character> st = new Stack<Character>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(' || c == '[' || c == '{')
                    st.push(c);
                else if (st.isEmpty())
                    return false;
                else {
                    char temp = st.pop();
                    if ((c == ')' && temp != '(') || (c == ']' && temp != '[') || (c == '}' && temp != '{'))
                        return false;
                }
            }
            if (!st.isEmpty())
                return false;
        }
        return true;
    }
}
