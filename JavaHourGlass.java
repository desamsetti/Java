import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[6][6];
        
        Boolean first = true;
        for (int i = 0; i < 6; i++)
        {
            for (int j =0; j<6; j++)
            {
                array[i][j] = sc.nextInt();
            }
        }
        int maxSum,sum;
        maxSum = -64;
        
        for(int row=0;row<4;row++)
        {
            for(int col=0;col<4;col++)
                {
                    sum = 0;
                    sum = array[row][col]+array[row][col+1]+array[row][col+2]+array[row+1][col+1]+array[row+2][col]+array[row+2][col+1]+array[row+2][col+2];
                if(sum>maxSum)
                {
                    maxSum = sum;
                }        
            }
        }
    
        System.out.println(maxSum);
    }
    
}

