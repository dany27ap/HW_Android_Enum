package com.dlegacy.android;

public enum FuelType {
    DISEL,
    PETROL;

    @Override
    public String toString() {
        return this.name();
    }
}
