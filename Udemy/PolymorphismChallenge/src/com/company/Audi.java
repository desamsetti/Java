package com.company;


class Audi extends Car{
    public Audi(String name,int cylinders) {
        super(name,cylinders);
    }

    @Override
    public String accelerate() {
        return "Audi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Audi -> brake()";
    }

    public String startEngine(){
        return "Audi -> startEngine()";
    }
}


