public class HelloWorld{

     public static void main(String []args){
        int[] inputArray = {124,123,51,26,12,-5,122,52};
        
        for(int lastUnsortedIndex = inputArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--)
        {
            int largest = 0;
            for(int i=0;i<lastUnsortedIndex;i++)
            {
                if(inputArray[i]>inputArray[largest])
                {
                    largest = i;
                }
            }
            Swap(inputArray,largest,lastUnsortedIndex);
        }
        
        for(int j=0;j<inputArray.length;j++)
        {
            System.out.println(inputArray[j]);
        }
        
     }
     
     public static void Swap(int[] input,int i,int j)
     {
         if(i==j)
         {
             return;
         }
         int temp = input[i];
         input[i] = input[j];
         input[j] = temp;
     }
}