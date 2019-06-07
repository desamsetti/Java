package com.company;

import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String input = "(()())(())";
        System.out.println(removeOuterParentheses(input));
    }

    public static String removeOuterParentheses(String S) {
        ArrayDeque queue = new ArrayDeque();
        int count = 0;
        String output = "";
        for (char c : S.toCharArray()) {
            if (c == '(' ) {
                queue.add(c);
                count++;
            }else if (c == ')'){
                count--;
                if (count == 0) {
                    queue.remove();
                    while(!queue.isEmpty()) {
                        output = output + queue.remove();
                    }
                }else {
                    queue.add(c);
                }
            }
        }
        return output;
    }
}
