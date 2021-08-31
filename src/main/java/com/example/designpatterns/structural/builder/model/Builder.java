package com.example.designpatterns.structural.builder.model;

import java.util.List;

public interface Builder<T> {
    void reset();
    void setSeats(int number);
    void setEngine(String engine);
    void setTripComputer();
    void setGPS();
    T getResult();
}
