package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String input = "ABC";
        int l = 0;
        int r = input.length()-1;
        permute(input,l,r);
    }

    public static void permute(String input,int l,int r){
        if(l==r){
            System.out.println(input);
        }else{
            for(int i=0;i<input.length();i++){
                input = swap(input,l,i);
                permute(input,l+1,r);
                input = swap(input,l,i);
            }
        }
    }

    public static String swap(String input,int i,int j){
        char[] inputArray = input.toCharArray();
        if(i==j){
            return input;
        }

        else{
            char temp = inputArray[i];
            inputArray[i] = inputArray[j];
            inputArray[j] = temp;
        }
        return String.valueOf(inputArray);
    }
}
