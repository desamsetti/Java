package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // write your code here
        long result = 0;
        long value = 600851475143L;
        for (int i = 2; i < value; i++)

        {
            if (value % i == 0 && isPrime(value / i)) {
                result = value / i;
                break;
            }
        }
        System.out.println(result);

    }

    private static boolean isPrime(long l)
    {
        for(long num = 2, max = l / 2 ; num < max; num++) {
            if(l % num == 0) {
                return false;
            }
        }
        return true;
    }
    }




