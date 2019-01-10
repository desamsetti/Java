package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a value to find its factorial : ");
                int value = sc.nextInt();

                System.out.println(Recursive(value));
            }

            public static int Recursive(int value)
            {
                if(value == 0)
                {
                    System.out.println(1);
                    return 1;
                }
                else if(value>1)
                {
                    return value*Recursive(value-1);
                }
                else if(value<0)
                {
                    System.out.println("Enter a value greater than 0");
                }
                return value;
            }
        }