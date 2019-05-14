package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print(addDigits(19));
    }

    public static int addDigits(int num) {
        while(num>=10){
            int newNum = num;
            int newSum = 0;
            while(newNum!=0)
            {
                newSum = newSum + newNum%10;
                newNum = newNum/10;
            }
            num = newSum;

            if(num>=10){
                addDigits(num);
            }
            else{
                return num;
            }
        }
        return num;
    }

    /**
     *  public int addDigits(int num) {
     *         if(num == 0) {
     *             return 0;
     *         }
     * 		if(num % 9 == 0) {
     *             return 9;
     *         }
     *         return num % 9;
     *        }
     */

    /**
     *  public int addDigits(int num) {
     *         return num / 10 < 1 ? num : addDigits(addDigits(num/10) + addDigits(num%10));
     *     }
     */
}
