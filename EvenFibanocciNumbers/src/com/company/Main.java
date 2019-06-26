package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    static HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        int total = 0;
        int total1 = 0;
        for(int i=1;i<4000000 || total1<4000000;i++)
        {
            total = fibanocci(i);
            total1+=fibanocci(i);
            //total = fib(i);
            //total1+=fib(i);
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

    public static int fib(int n){

        if(n<=1){
            return n;
        }
        else{
            if (map.containsKey(n)) {return map.get(n); }
            else{
                int nthVal = fib(n-1)+fib(n-2);
                map.put(n,nthVal);
                return nthVal;
                //map.put(n,fib(n-1)+fib(n-2));
                /*Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry pairs = (Map.Entry) it.next();
                    System.out.println(pairs.getKey() + " = " + pairs.getValue());
                }*/
                //return fib(n-1)+fib(n-2);
            }
        }
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
