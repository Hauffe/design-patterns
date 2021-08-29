package com.example.designpatterns.structural.factory.model;

public class SeaTransport extends TransportType{

    public SeaTransport() {
        this.vehicle = "ship";
        this.pathType = "sea";
    }
}
