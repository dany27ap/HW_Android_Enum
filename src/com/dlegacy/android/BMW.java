package com.dlegacy.android;

public class BMW extends CarImplementation {

    public BMW(String name, String color, ChassisType chassisType, FuelType fuelType) {
        this.color = color;
        this.chassisType = chassisType;
        this.fuelType = fuelType;
        this.name = name;
    }

    @Override
    public void setChassisType(ChassisType type) {
        this.chassisType = type;
    }

    @Override
    public void setFuelType(FuelType fuel) {
        this.fuelType = fuel;
    }
}
