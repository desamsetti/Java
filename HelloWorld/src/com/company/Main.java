package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Patient patient1 = new Patient("Ikshwak",23,true);

        /*patient1.name = "Ikshwak";
        patient1.age = 23;
        patient1.allergy = true;*/


        System.out.println("Name : "+ patient1.name);
        System.out.println("Age : "+patient1.age);
        System.out.println("Does have allergy : "+patient1.allergy);

    }
}
