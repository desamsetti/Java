package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        /*Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while(true){
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if(counter == 10){
                    break;
                }
            }else{
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
            counter++;
        }
        System.out.println("The Sum is :"+sum);
        scanner.close();

        */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name : ");
        String name = bufferedReader.readLine();
        System.out.println("The name you have entered is :"+name);
        bufferedReader.close();










    }

}
