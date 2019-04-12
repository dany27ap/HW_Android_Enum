package com.dlegacy.android;

public class Main {

    public static void main(String[] args) {
        BMW bmw = new BMW("BMW", "black", ChassisType.sedan, FuelType.DISEL);
        bmw.printCar();
    }
}
