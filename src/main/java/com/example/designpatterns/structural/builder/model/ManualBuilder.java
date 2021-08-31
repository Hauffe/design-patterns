package com.example.designpatterns.structural.builder.model;

public class ManualBuilder implements Builder<Manual>{

    private Manual manual;

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int number) {
        manual.setSeats(number);
    }

    @Override
    public void setEngine(String engine) {
        manual.setEngine(engine);
    }

    @Override
    public void setTripComputer() {
        manual.setTripComputer("This trip computer has a lot to offer");
    }

    @Override
    public void setGPS() {
        manual.setGPS("This GPS is kind of good");
    }

    @Override
    public Manual getResult() {
        return manual;
    }
}
