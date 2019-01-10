package com.company;

public class Main {


    public static int hammingDistance(int x, int y) {
        int binaryArray1[] = new int[1000];
        int binaryArray2[] = new int[1000];
        int i=0;
        int j=0;
        int counter = 0;
        while(x>0)
        {
            binaryArray1[i]=x%2;
            x=x/2;
            i++;
        }
        while(y>0)
        {
            binaryArray2[j]=y%2;
            y=y/2;
            j++;
        }

        System.out.println("The array 1 starts here");
        for(int s=0;s<i;s++)
        {
            System.out.print(binaryArray2[s]+" ");
        }

        System.out.println("The array has been printed");
        for(int z=0;z<=i;z++)
        {

            if(binaryArray1[z]!=binaryArray2[z])
            {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(hammingDistance(1,4));
    }
}
