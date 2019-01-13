public class HelloWorld{

     public static void main(String []args){
        int[] inputArray = {123,122,50,-4,20,30,15,6};
        
        
        for(int lastUnsortedIndex = inputArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--)
        {
            int largest = 0;
            for(int i=1;i<lastUnsortedIndex;i++)
            {
                if(inputArray[largest]<inputArray[i])
                {
                    largest = i;
                }
            }
            Swap(inputArray,lastUnsortedIndex,largest);
        }
        
        for(int i=0;i<inputArray.length;i++)
        {
            System.out.println(inputArray[i]);
        }
        
        
        System.out.println("Hello World");
     }
     
     public static void Swap(int[] input,int i,int j)
     {
         
         int temp = input[i];
         input[i] = input[j];
         input[j] = temp;
     }
}