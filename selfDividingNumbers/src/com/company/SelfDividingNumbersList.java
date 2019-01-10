package com.company;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbersList {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list1 = new ArrayList<Integer>();
        for(int i=left;i<=right;i++)
        {
            if(helper(i))
            {
                list1.add(i);
            }
        }
        return list1;
    }

    private boolean helper(int num)
    {
        if(num<10)
        {
            return true;
        }
        int k = num;
        int m = 10;
        while(k != 0){
            if(k % 10 != 0){
                if(num % (k % 10) != 0){
                    return false;
                }
            }else{
                return false;
            }
            k /= 10;
        }
        return true;
    }
}
