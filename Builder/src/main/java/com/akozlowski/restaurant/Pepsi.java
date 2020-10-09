package com.akozlowski.restaurant;

public class Pepsi extends ColdDrink {
    @Override
    public String getName() {
        return "Pepsi";
    }

    @Override
    public double getPrice() {
        return 1.5;
    }
}
