package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name = "alex", typed = "aaleex";
        System.out.println(isLongPressedName(name,typed));
    }

    public static boolean isLongPressedName(String name, String typed) {
        int i=0,j=0;
        for(;i<name.length()&& j<typed.length();){
            if(name.charAt(i) != typed.charAt(j)){
                return false;
            }
            int k=i+1,l=j+1;
            for(;k<name.length() && name.charAt(k)==name.charAt(i);k++);
            for(;l<typed.length() && typed.charAt(l)==typed.charAt(j);l++);
            if(k-i > l-j){
                return false;
            }
            i = k;
            j = l;
        }
        return name.length()== i && j == typed.length();
    }
}
