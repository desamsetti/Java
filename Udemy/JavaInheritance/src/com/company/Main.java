package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal("Animal",1,1,5,5);

        Dog dog = new Dog("Snowie",8,20,2,4,1,20,"Long Silky");
        dog.eat();
        //sdog.walk();
        dog.run();
    }
}
