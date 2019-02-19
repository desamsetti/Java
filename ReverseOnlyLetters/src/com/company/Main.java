package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //String sample = "Test1ng-Leet=code-Q!";
        //String sample = "ab-cd";
        String sample = "a-bC-dEf-ghIj";
        System.out.print(reverseOnlyLetters(sample));
        //String[] elements = sample.split(Character.toString((char)61));
        //String[] elements = sample.split("[^a-zA-Z0-9']+");

        /*System.out.println("The size is :"+elements.length);
        for(String s:elements)
        {
            System.out.println(s);
        }*/
    }

    public static String reverseOnlyLetters(String S) {
        if(S.length()<2)
        {
            return S;
        }

        char[] inputArray = S.toCharArray();
        int i=0;
        int j=inputArray.length-1;

        while(i<j)
        {
            if(Character.isLetter(inputArray[i]) && Character.isLetter(inputArray[j]))
            {
                swap(inputArray,i,j);
                i++;
                j--;
            }
            if(!Character.isLetter(inputArray[i])) {
                i++;
            }
            if(!Character.isLetter(inputArray[j]))
            {
                j--;
            }
        }
        return new String(inputArray);





        /*while(i<j)
        {
            if(Character.isLetter(inputArray[i]) && Character.isLetter(inputArray[j]))
            {
                swap(inputArray,i,j);
                i++;
                j--;
            }
            else if(!Character.isLetter(inputArray[i]) && Character.isLetter((inputArray[j])))
            {
                i++;
                swap(inputArray,i,j);
                j--;
            }
            else if(Character.isLetter(inputArray[i]) && !Character.isLetter(inputArray[j]))
            {
                j++;
                swap(inputArray,i,j);
                j--;
            }
        }*/

    }

    public static void swap(char[] inputArray,int i,int j)
    {
        if(i==j)
        {
            return;
        }
        char temp = inputArray[i];
        inputArray[i] = inputArray[j];
        inputArray[j] = temp;
    }

}
