public class HelloWorld{

     public static void main(String []args){
         int sumValue = 0;
        for(int i=1;i<1000;i++)
        {
            if(i%3==0 || i%5==0)
            {
                sumValue += i;
            }
        }
        System.out.println("The Sum of all multiples of 3 or 5 less than 1000 is : "+sumValue);
     }
}