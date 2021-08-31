package com.example.designpatterns.structural.abstractFactory.model;

public final class AppConfigurator {
    public static AbstractFactory factoryConfig(String type){
        AbstractFactory factory = null;
        switch (type){
            case "old":
                factory = new OldForniture();
                break;
            case "fancy":
                factory = new FancyForniture();
                break;
        }
        return factory;
    }
}
