import java.util.Random;

public class SortProgram {
    public static void main(String[] args)
    {
        int n = Integer.valueOf(args[0]);
        String orderOfInput = args[1];
        String sortType = args[2];
        int[] sortArray = new int[n];
        Random randInt = new Random();
        if(orderOfInput.equals("R") || orderOfInput.equals("r"))
        {
            for(int i=0;i<n;i++)
            {
                sortArray[i]=randInt.nextInt(n)+1;
            }
        }
        else if(orderOfInput.equals("A") || orderOfInput.equals("a"))
        {
            int i=0;
            int j=1;
            while(i<n)
            {
                sortArray[i]=j;
                j++;
                i++;
            }
        }
        else if(orderOfInput.equals("D") || orderOfInput.equals("d"))
        {
            int i=n;
            int j=0;
            while(i>0)
            {
                sortArray[j]=i;
                j++;
                i--;
            }
        }
        for(int i=0;i<sortArray.length;i++)
        {
            System.out.print(sortArray[i]+" ");
        }
        System.out.println();
        if(sortType.equals("I"))
        {
            System.out.println("Called Insertion Sort");
            insertionSort(sortArray);
        }
        else if(sortType.equals("S"))
        {
            System.out.println("Called Selection Sort");
            selectionSort(sortArray);
        }
        for(int i=0;i<sortArray.length;i++)
        {
            System.out.print(sortArray[i]+" ");
        }
    }

    public static void insertionSort(int[] arr1)
    {

        for(int firstVal=1;firstVal<arr1.length;firstVal++)
        {
            int newElement = arr1[firstVal];
            int i;
            for(i=firstVal;i>0 && arr1[i-1]>newElement;i--)
            {
                arr1[i] = arr1[i-1];
            }
            arr1[i] = newElement;
        }
    }


    public static void selectionSort(int[] arr1) {
        for (int lastVal = arr1.length - 1; lastVal > 0; lastVal--) {
            int largestVal = 0;
            for (int i = 1; i <= lastVal; i++) {
                if (arr1[i] > arr1[largestVal]) {
                    largestVal = i;
                }
            }
            Swap(arr1, largestVal, lastVal);
        }
    }


    public static void Swap(int[] arr1,int i, int j)
    {
        if(i==j)
        {
            return;
        }
        else
        {
            int temp = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp;
        }
    }

}
