package com.example.designpatterns.structural.abstractFactory.model;

public interface AbstractFactory {
    public Chair CreateChair();
    public CoffeeTable CreateCoffeeTable();
    public Sofa CreateSofa();
}
