public class HelloWorld{

     public static void main(String []args)
     {
        int[] inputArray = {123,122,50,-4,20,30,15,6};
        
        
        for(int firstUnsortedIndex=1;firstUnsortedIndex<inputArray.length;firstUnsortedIndex++)
        {
            int minimum = 0;
            for(int i=inputArray.length-1;i>0;i--)
            {
                
                if(inputArray[minimum]>inputArray[i])
                {
                    minimum = i;
                }
                
            }
            Swap(inputArray,minimum,firstUnsortedIndex);
            
        }
        
        for(int i=0;i<inputArray.length;i++)
        {
            System.out.println(inputArray[i]);
        }
        
     }
     
     public static void Swap(int[] input,int i,int j)
     {
         
         int temp = input[i];
         input[i] = input[j];
         input[j] = temp;
     }
}