package com.company;

public class Main {
    //public static int[][] flipAndInvertImage(int[][] A) {
    public static void flipAndInvertImage(int[][] A) {
        int[][] newArray = new int[A.length][A.length];
        int[][] finalArray = new int[A.length][A.length];
        int arraylength = A.length-1;

        for(int i=0;i<A.length;i++) {
            for (int j = 0; j < A.length; j++) {

                //System.out.print(A[i][j] +" ");
                newArray[i][arraylength] = A[i][j];
                arraylength = arraylength - 1;

            }
            arraylength = A.length - 1;
            System.out.println();

        }

        System.out.println("The array has been horizontally flipped");


        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A.length;j++)
            {
                System.out.print(newArray[i][j]+" ");
            }
            System.out.println();
        }


        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A.length;j++)
            {
                if(newArray[i][j]==0)
                {
                    finalArray[i][j]=1;
                }
                else if(newArray[i][j]==1)
                {
                    finalArray[i][j]=0;
                }
            }
        }
        System.out.println("The array has been flipped and reversed");
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A.length;j++)
            {
                System.out.print(finalArray[i][j]+ " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
	// write your code here
        //int[][] A = new int[3][3];
        int[][] A = {{1,1,0},{1,0,1},{0,0,0}};
    flipAndInvertImage(A);

    }
}
