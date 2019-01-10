package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        int total = 0;
        int total1 = 0;
        for(int i=1;i<4000000 || total1<4000000;i++)
        {
            total = fibanocci(i);
            total1+=fibanocci(i);
            list1.add(total);
        }
        int sum = 0;
        for(int i=0;i<list1.size();i++)
        {
            if(i%2==0)
            {
                sum+=list1.get(i);
            }
        }

        System.out.println("The fibanocci value is "+sum);
    }


    public static int fibanocci(int x)
    {
        if(x==0)
        {
            return 0;
        }
        else if(x==1)
        {
            return 1;
        }
        else
        {
            return fibanocci(x-1)+fibanocci(x-2);
        }
    }



}
