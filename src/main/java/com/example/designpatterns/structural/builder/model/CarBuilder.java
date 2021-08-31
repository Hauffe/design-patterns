package com.example.designpatterns.structural.builder.model;

public class CarBuilder implements Builder<Car>{

    private Car car;

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int number) {
        car.setSeats(number);
    }

    @Override
    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    @Override
    public void setTripComputer() {
        car.setTripComputer("This trip computer has a lot to offer");
    }

    @Override
    public void setGPS() {
        car.setGPS("This GPS is kind of good");
    }

    @Override
    public Car getResult() {
        return car;
    }

}
