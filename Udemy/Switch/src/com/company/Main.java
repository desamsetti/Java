package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int switchValue = 3;
        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a "+switchValue);
                break;
            default:
                System.out.println("Was not 1,2,3,4 or 5");
                break;
        }
    }
}
