public class HelloWorld{

     public static void main(String []args){
        int[] inputArray = {124,123,51,26,12,-5,122};
        
        int newElement;
        for(int firstUnsortedIndex = 1;firstUnsortedIndex<inputArray.length;firstUnsortedIndex++)
        {
            int i;    
            
            newElement = inputArray[firstUnsortedIndex];
            for(i=firstUnsortedIndex;i>0 && inputArray[i-1]>newElement;i--)
            {
                inputArray[i]=inputArray[i-1];
            }
         inputArray[i] = newElement;   
        }
        
        for(int j=0;j<inputArray.length;j++)
        {
            System.out.println(inputArray[j]);
        }
        
     }
}