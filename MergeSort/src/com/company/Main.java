package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        int[] intArray = {1,3,5,2,4,6};

        mergeSort(intArray,0,intArray.length);

        for(int i = 0;i<intArray.length;i++)
        {
            System.out.print(intArray[i] + " ");
        }
    }


    //{20, 35, -15, 7, 55, 1, -22}
    public static void mergeSort(int[] input, int start, int end)
    {
        if(end-start<2)
        {
            //If the array is having just one element, then no need to call the function recursively.
            return ;
        }
        int mid = (start+end)/2;
        mergeSort(input,start,mid);
        mergeSort(input,mid,end);
        merge(input,start,mid,end);
    }
    //{20, 35, -15, 7, 55, 1, -22}
    public static void merge(int[] input,int start,int mid,int end)
    {
      if(input[mid-1]<=input[mid])
      {
          return;
      }

      int i = start;
      int j = mid;
      int tempIndex = 0;

        int counter = 0;
      int[] temp = new int[end-start];
      while(i<mid && j<end)
      {
          if(input[j]<input[i])
          {
              counter++;
          }
          temp[tempIndex++] = input[i]<=input[j]?input[i++]:input[j++];
      }
      System.out.println("Counter val is :" + counter);

      //To handle any elements that are left in the left array, we need to copy that element to the right side
      //If any elements are left on the right hand side, they need not be handled as they will be overwritten with themselves if they are handled
      //Here, from input, the element at i, to input array, at position start+tempIndex, and the jumping length is mid-i
      System.arraycopy(input,i,input,start+tempIndex,mid-i);

      //The temp array should be copied to input array
      System.arraycopy(temp,0,input,start,tempIndex);
      //Here, the source array is temp, should be from 0, to input array, starting from start, the length to copy is tempIndex

    }
}
