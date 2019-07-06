package com.company;

public class Person {
    String name;
    double height;
    double weight;

    Person(){
        this.name = "Not Found";
        this.height = 20;
        this.weight = 5;
    }


    Person(String xName,double xHeight, double xWeight){
        this.name = xName;
        this.weight = xWeight;
        this.height = xHeight;
    }

    void sayHello(){
        System.out.println("Hello "+this.name);
    }
}
