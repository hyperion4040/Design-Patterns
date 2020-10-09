package com.akozlowski.restaurant;

public class Coke extends ColdDrink {
    @Override
    public String getName() {
        return "Coke";
    }

    @Override
    public double getPrice() {
        return 1.0;
    }
}
