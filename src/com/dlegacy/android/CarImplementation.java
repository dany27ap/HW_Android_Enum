package com.dlegacy.android;

public abstract class CarImplementation implements Car {

    public String name;
    public String color;
    public ChassisType chassisType;
    public FuelType fuelType;

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void setChassisType(ChassisType type);

    public abstract void setFuelType(FuelType fuel);

    public final void printCar() {
        System.out.println(this.name + ", " + this.color + ", " + chassisType + ", " + fuelType);
    }
}
