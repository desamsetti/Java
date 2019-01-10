package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Om Namah Shivaaya

        //Element retrieval from an array is O(1) if the index of the element is known in the array, it is also called as Constant time complexity.
        //As it is just x + i*y, where x is start address of the array, i is the index, y is the size of the element.Hence, it is always three steps.


        //Element retrieval from an array si O(n) if the index of the element is unknown in the array.
        //The worst possible case here is if the element is in the last index of the array, then the whole array should be traversed for the element.
        //So, if there are 10 elements, all 10 elements should be checked, if there are 100 elements all 100 elements should be checked, hence a linear time complexity.



        //Adding an element to an array which is already full takes O(n) which is Linear time complexity.
        /*
        Because, as we know that arrays are not dynamic, their lengths are fixed, hence in order to add a new element
        to an already filled array, we need to create a new array which can contain all the existing elements and then
        a new element.Creating a new array, doesn't depend on the number of the elements, adiing the new integer doesn't
        depend on the number of elements, knowing the index is enough. For this, in order to fill the new array with all
        the existing elements we need to loop all the elements which is based on the number of elements, hence if there
        are 10 elements then 10 times, if there are 100 elements, then 100 times. Hence, this is O(n).
         */


        //Adding an element to an array which is having a space assuming we know the index is O(1) which is Constant time complexity.
        /*
        Because that is similar to retrieving an element, when we have the index we can figure out the memory address of where
        the new element is going just by using the simple calculation x+i*y
         */


        //For insert or update an element in an array, the time complexity is O(1), because if we know the index,
        // we can directly go there and add it.


        //For deleting an element, to set the element to null, the time complexity is O(1), because if we know the index,
        // we can directly go there and set it.


        //For deleting an element when the index is not known, the time complexity is O(n), because the element has to be
        // searched first and then deleted or set to null.

        //For deleting an element when the index is not known and to shift down the elements, the time complexity is O(n),
        // because the element has to be searched first and then deleted and then based on the number of elements next to it
        // they should be looped to shift.

        //FOR ARRAYS, TO EASILY REMEMBER, IF THE CODE REQUIRES A LOOP, WHICH IS IF THE INDEX IS NOT KNOWN THEN IT IS LINEAR TIME COMPLEXITY
        //IF THE CODE DOESN'T REQUIRE A LOOP, WHICH MEANS WHEN THE INDEX IS KNOWN, IT IS CONSTANT TIME COMPLEXITY.

        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;


        int index = -1;
        for(int i = 0 ;i <intArray.length;i++)
        {
            //System.out.println(intArray[i]);
            if(intArray[i]==7)
            {
                index = i;
                break;
            }
        }
        System.out.println("Index = "+index);

        for(int i = 0;i<intArray.length;i++)
        {
            System.out.println(intArray[i]);
        }

        int temp = 0;
        for(int i = 0;i<intArray.length;i++)
        {
           if(intArray[i]>intArray[i++])
           {
               temp = intArray[i];
               intArray[i]=intArray[i++];
               intArray[i++] = temp;
           }
        }


        System.out.println("The array after sorting is :");

        for(int i = 0;i<intArray.length;i++)
        {
            System.out.println(intArray[i]);
        }
    }
}
