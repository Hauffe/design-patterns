package com.example.designpatterns.structural.abstractFactory.model;

public class OldForniture implements AbstractFactory{

    @Override
    public Chair CreateChair() {
        return new Chair(4, "Large", "Square", "This is a old chair");
    }

    @Override
    public CoffeeTable CreateCoffeeTable() {
        return new CoffeeTable(4, "Large", "Square", "This is a old coffee table");
    }

    @Override
    public Sofa CreateSofa() {
        return new Sofa(4, "Large", "Square", "This is a old coffee table");
    }
}
