package com.example.designpatterns.structural.factory.model;

public abstract class TransportType implements Transport{
    public String pathType;
    public String vehicle;

    public String showTransport() {
        return this.pathType + " using a " + this.vehicle;
    }
}
