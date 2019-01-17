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


1. 9999 = 9*9*9*9 = 4608
2. 4608 = 4*6*0*8 = 0


1. 999 = 9*9*9 = 729
2. 729 = 7*2*9 = 126
3. 126 = 1*2*6 = 12
4. 12 = 1*2 = 2


* */ public class Main {
        public static int counter = 0;
        public static void main(String[] args) {
            // write your code here
            System.out.print(getNumber(999));
        }


        private static int getNumber(int num)
        {
            int multiplyVal = 1;

            List<Integer> newList = new ArrayList<Integer>();


            while(num!=0)
            {
                int digit = num%10;
                num /= 10;
                newList.add(digit);
            }



            for(int i=0;i<newList.size();i++)
            {
                multiplyVal = multiplyVal*newList.get(i);
            }

            if(String.valueOf(multiplyVal).length()!=1)
            {
                getNumber(multiplyVal);
            }

            if(String.valueOf(multiplyVal).length()==1||multiplyVal==0)
            {
                return counter;
            }

            counter += 1;
            return counter;
        }
    }