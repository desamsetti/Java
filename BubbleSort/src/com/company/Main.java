package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here




/*Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.

Best Case Time Complexity: O(n). Best case occurs when array is already sorted.

Auxiliary Space: O(1)

Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.

Sorting In Place: Yes

Stable: Yes

Due to its simplicity, bubble sort is often used to introduce the concept of a sorting algorithm.
In computer graphics it is popular for its capability to detect a very small error (like swap of just two elements) in almost-sorted arrays and fix it with just linear complexity (2n). For example, it is used in a polygon filling algorithm, where bounding lines are sorted by their x coordinate at a specific scan line (a line parallel to x axis) and with incrementing y their order changes (two elements are swapped) only at intersections of two lines (Source: Wikipedia)
*/



        int[] intArray = {20,35,-15,7,55,1,-22};

        //Using BubbleSort algorithm to sort the array

        for(int lastUnsortedIndex = intArray.length - 1;lastUnsortedIndex>0;lastUnsortedIndex--)
        {
            for( int i = 0;i < lastUnsortedIndex;i++)
            {

        /*for(int lastUnsortedIndex = 0;lastUnsortedIndex<intArray.length-1;lastUnsortedIndex++)
        {
            for( int i = 0;i < intArray.length-lastUnsortedIndex-1;i++)
            {
           */


                if(intArray[i]>intArray[i + 1])
                {
                    Swap(intArray,i,i + 1);
                }
            }
        }



        for(int i = 0;i<intArray.length;i++)
        {
            System.out.println(intArray[i]);
        }


    }

    public static void Swap(int[] array, int i, int j)
    {
        if(i==j)
        {
            return;
        }


        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}