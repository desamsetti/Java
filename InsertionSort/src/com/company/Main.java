package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] intArray = {20,35,-15,7,55,1,-22};

        //The Inser
        // tion Algorithm is being executed as from left to right.
        //Hence, the first index which is 0 is assumed to be already sorted and hence the firstUnsortedIndex starts from 1.
        for(int firstUnsortedIndex = 1;firstUnsortedIndex<intArray.length;firstUnsortedIndex++)
        {
            int newElement = intArray[firstUnsortedIndex];
            //The value of the element that is to be shifted is stored in a new variable.
            //Because, in Insertion sort, elements are overwritten.
            int i;
            for(i = firstUnsortedIndex;i > 0 && intArray[i-1]>newElement;i--)
            {
                intArray[i] = intArray[i-1];

            }
            intArray[i] = newElement;
        }


        for(int i = 0;i<intArray.length;i++)
        {
            System.out.println(intArray[i]);
        }
    }

}
