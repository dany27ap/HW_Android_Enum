package com.dlegacy.android;

public enum ChassisType {
    mini,
    sedan;

    @Override
    public String toString() {
        return this.name();
    }
}
