package com.example.designpatterns.structural.abstractFactory.model;

public class FancyForniture implements AbstractFactory{

    @Override
    public Chair CreateChair() {
        return new Chair(3, "Small", "Abstract", "This is a fancy chair");
    }

    @Override
    public CoffeeTable CreateCoffeeTable() {
        return new CoffeeTable(1, "Small", "Abstract", "This is a fancy coffee table");
    }

    @Override
    public Sofa CreateSofa() {
        return new Sofa(0, "Small", "Abstract", "This is a fancy coffee table");
    }
}
