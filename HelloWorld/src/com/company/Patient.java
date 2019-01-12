package com.company;

public class Patient {
    String name;
    int age;
    Boolean allergy;

    Patient()
    {
        name = "No Name";
        age = 0;
        allergy = true;
    }


    Patient(String name1,int age1,Boolean allery1)
    {
        this.name = name1;
        this.age = age1;
        this.allergy = allery1;
    }
}
