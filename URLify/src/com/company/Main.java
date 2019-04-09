package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String url = "Welcome to the World";
        int length = 25;
        System.out.print(URLify(url,length));

    }

    public static String URLify(String url, int length){
        char[] result = new char[length];

        url = url.trim();

        char[] urlChars = url.toCharArray();

        int pointer = 0;

        for(int i=0;i<urlChars.length;i++){
            if(urlChars[i]!=' '){
                result[pointer] = urlChars[i];
                pointer++;
            }else{
                result[pointer] = '%';
                result[pointer+1]='2';
                result[pointer+2]='0';
                pointer = pointer+3;
            }
            prettyPrint(result);
        }
        return String.valueOf(result);
    }

    private static void prettyPrint(char[] chars){
        for(int i=0;i<chars.length;i++){
            System.out.println("c["+chars[i]+"]");
        }
    }
}
