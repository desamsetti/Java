package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Enter the number of elements to be entered : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the elements to the array : ");
        int[] inputArray = new int[n];
        for(int i=0;i<n;i++)
        {
            inputArray[i] = sc.nextInt();
        }


        /*for(int i=0;i<inputArray.length;i++)
        {
            System.out.print(inputArray[i]+" ");
        }*/
        System.out.print("Enter the chunk value to split the array into : ");
        int chunkValue = sc.nextInt();
        sc.close();
        ArrayChunks(inputArray,chunkValue);


    }

    /*public static void ArrayChunks(int[] inputArray, int chunkValue)
    {
        List[][] chunked = new ArrayList[inputArray.length/chunkValue][];

        for(int i=0;i<inputArray.length;i++)
        {
            List[] last = chunked[chunked.length-1];
            if(last.length==chunkValue)
            {

            }
        }

*/

    public static void ArrayChunks(int[] inputArray,int chunkValue) {
        List<int[]> chunked = new ArrayList<int[]>();
        int index = 0;

        while(index<inputArray.length)
        {
            int a1[] = Arrays.copyOfRange(inputArray, index, index+chunkValue);
            index += chunkValue;
            chunked.add(a1);
        }

        /*for (int i=0;i<chunked.size();i++)
        {
            System.out.println(chunked.get(i));
        }*/

        //System.out.println(chunked.toString());


        for(int[] var : chunked)
        {
            System.out.println(Arrays.toString(var));
        }




        //int[][] arrayOfArrays = new int[inputArray.length/chunkValue][];
        /*int i=0;
        int counter = 0;
        while(i<inputArray.length)
        {
            i++;
            counter++;
            if(i%chunkValue==0)
            {
                int a1[] = Arrays.copyOfRange(inputArray, i,counter);
                num.add(a1);
            }
        }*/



    }
}
