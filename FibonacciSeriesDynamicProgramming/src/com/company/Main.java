package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    static HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
    public static void main(String[] args) {
	// write your code here
        //int output = getFibonacciNumberTopDown(6);
        long startTime = System.nanoTime();
        //methodToTime();

        //int output = fib(30);
        //int output = fibonacci(30);
        //int output = getFibonacciNumberTopDown(30);
        long endTime = System.nanoTime();



        System.out.println(output);
        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.println(duration+" is the duration");

    }


    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
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


    public static HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    public static int getFibonacciNumberTopDown(int n) {
        if(hm.containsKey(n)) return hm.get(n);
        if(n == 0) return 0;
        if(n == 1) return 1;
        int nthValue = getFibonacciNumberTopDown(n - 1) + getFibonacciNumberTopDown(n - 2);
        hm.put(n, nthValue);
        return nthValue;
    }
}
