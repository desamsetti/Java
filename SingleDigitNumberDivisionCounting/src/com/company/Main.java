package com.company;

import java.util.ArrayList;
import java.util.List;
/*
* 1.  39 = 3*9 = 27
2.  27 = 2*7 = 14
3.  14 = 1*4 = 4

1.  45 = 4*5 = 20
2.  20 = 2*0 = 0

1.  49 = 4*9 = 36
2.  36 = 3*6 = 18
3.  18 = 1*8 = 8

1.  729 = 7*2*9 = 126
2.  126 = 1*2*6 = 12
3.  12  = 1*2 = 2

* */
public class Main {
    public static int counter = 0;
    public static void main(String[] args) {
	// write your code here
        System.out.print(getNumber(9999));
    }


    /*private static int getNumber(int num)
    {
        List<Integer> newList = new ArrayList<Integer>();
        counter += 1;
        while(num!=0)
        {
            int digit = num%10;
            num /= 10;
            newList.add(digit);
        }

        int multiplyVal = 1;
        for(int i=0;i<newList.size();i++)
        {
            multiplyVal = multiplyVal*newList.get(i);
        }

        if(String.valueOf(multiplyVal).length()!=1)
        {
            getNumber(multiplyVal);
        }
        if(String.valueOf(multiplyVal).length()==1)
        {
            return counter;
        }
        return counter;
    }*/

    private static int getNumber(int num)
    {
        String val = String.valueOf(num);
        char[] array1 = new char[val.length()];
        array1 = val.toCharArray();
        int mulVal = 1;

        counter += 1;

        for(int i=0;i<array1.length;i++)
        {
            mulVal = mulVal*Integer.valueOf(array1[i]);
        }

        /*if(String.valueOf(mulVal).length()==1)
        {
            return counter;
        }*/

        {
            getNumber(mulVal);
        }

        return counter;
    }


}
