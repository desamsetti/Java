package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //String A = "abcde";
        //String B = "deabc";
        String A = "";
        String B = "";

        //System.out.println(rotate(A));
        System.out.println(rotateString(A,B));
    }

    public static boolean rotateString(String A, String B) {
        String value = A;
        if(A.equals(B)){
            return true;
        }
        for(int i=0;i<A.length();i++){
            if(value.equals(B)){
                return true;
            }
            value = rotate(value);
        }
        return false;
    }


    public static String rotate(String input){
        if(input.equals("")){
            return "";
        }
        StringBuilder str = new StringBuilder();
        if(input.length()>1){
            str.append(input.substring(1));
            str.append(input.charAt(0));
        }
        else{
            return input;
        }
        return str.toString();
    }
}
