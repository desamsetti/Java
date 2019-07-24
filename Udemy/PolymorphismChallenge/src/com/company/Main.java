package com.company;


class Car{
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name,int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }


    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }

    public String accelerate(){
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }
}

class BMW extends Car{
    public BMW(String name, int cylinders) {
        super(name,cylinders);
    }

    @Override
    public String accelerate() {
        return "BMW -> accelerate()";
    }

    @Override
    public String brake() {
        return "BMW -> brake()";
    }

    public String startEngine(){
        return "BMW -> startEngine()";
    }
}


public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car("Base Car",8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        BMW bmw = new BMW("BMW i8",6);
        System.out.println(bmw.startEngine());
        System.out.println(bmw.accelerate());
        System.out.println(bmw.brake());

        Audi audi = new Audi("Audi R8",6);
        System.out.println(audi.startEngine());
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());

    }
}
