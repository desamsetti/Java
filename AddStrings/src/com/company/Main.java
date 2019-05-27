package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String num1 = "15";
        String num2 = "20";
        System.out.println(addStrings(num1,num2));
    }

    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int l1 = num1.length()-1;
        int l2 = num2.length()-1;
        int up = 0;
        while((l1>=0 && l2>=0)){
            int n1 = Character.getNumericValue(num1.charAt(l1--));
            int n2 = Character.getNumericValue(num2.charAt(l2--));
            sb.append((n1+n2+up)%10);
            up = (n1+n2+up)/10;
        }
        while(l1>=0){
            int n = Character.getNumericValue(num1.charAt(l1--));
            sb.append((n+up)%10);
            up = (n+up)/10;
        }
        while(l2>=0){
            int n = Character.getNumericValue(num2.charAt(l2--));
            sb.append((n+up)%10);
            up = (n+up)/10;
        }
        if(up==1) sb.append(1);
        return sb.reverse().toString();
    }
}
