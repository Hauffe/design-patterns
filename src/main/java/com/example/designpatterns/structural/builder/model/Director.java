package com.example.designpatterns.structural.builder.model;

public class Director {

    public String makeSUV(Builder builder){
        builder.reset();
        builder.setEngine("1.8V");
        builder.setSeats(6);
        builder.setTripComputer();
        builder.setGPS();
        return builder.getResult().toString();
    }

    public String makeSportsCar(Builder builder){
        builder.reset();
        builder.setEngine("2.0V");
        builder.setSeats(2);
        builder.setTripComputer();
        builder.setGPS();
        return builder.getResult().toString();
    }
}
