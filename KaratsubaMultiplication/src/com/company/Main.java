package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(karatsuba(24061994,28563));

    }


    public static long karatsuba(long x, long y)
    {
        int size1 = getSize(x);
        int size2 = getSize(y);

        int N = Math.max(size1,size2);

        if(N<10)
        {
            return x*y;
        }



        N = (N / 2) + (N % 2);

        long m = (long)Math.pow(10, N);

        long b = x / m;
        long a = x - (b * m);
        long d = y / m;
        long c = y - (d * N);

        long z0 = karatsuba(a, c);
        long z1 = karatsuba(a + b, c + d);
        long z2 = karatsuba(b, d);

        return z0 + ((z1 - z0 - z2) * m) + (z2 * (long)(Math.pow(10, 2 * N)));








        /*long a,b,c,d =0;
        String x1String = "";
        String x2String = "";
        String y1String = "";
        String y2String = "";

        x1String = String.valueOf(x).substring(0,String.valueOf(x).length()/2);
        x2String = String.valueOf(x).substring(String.valueOf(x).length()/2,String.valueOf(x).length());
        y1String = String.valueOf(y).substring(0,String.valueOf(y).length()/2);
        y2String = String.valueOf(y).substring(String.valueOf(y).length()/2,String.valueOf(y).length());


        a = Integer.valueOf(x1String);
        b = Integer.valueOf(x2String);
        c = Integer.valueOf(y1String);
        d = Integer.valueOf(y2String);

        long acVal = a*c;
        long bdVal = b*d;

        long awithbVal = a+b;
        long cwithdVal = c+d;

        long awithbAndcWithdVal = (awithbVal)*(cwithdVal);

        long subtractionVal = awithbAndcWithdVal - bdVal - acVal;





        System.out.println(" a : "+a);
        System.out.println(" b : "+b);
        System.out.println(" c : "+c);
        System.out.println(" d : "+d);*/
    }


    public static int getSize(long num)
    {
        int counter = 0;
        while(num!=0)
        {
            counter++;
            num /= 10;
        }
        return counter;
    }
}
