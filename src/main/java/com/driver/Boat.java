package com.driver;

public class Boat implements WaterVehicle{
    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public Boat() {
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    int capacity;
    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}
