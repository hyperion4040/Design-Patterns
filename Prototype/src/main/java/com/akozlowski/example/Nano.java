package com.akozlowski.example;

public class Nano extends BasicCar {

    public Nano() {
        name = "Nano";
        price = 25.0;
    }

    @Override
    String getInfo() {
        return "Car type: " + getName() + ", Price: " + getPrice();
    }
}
