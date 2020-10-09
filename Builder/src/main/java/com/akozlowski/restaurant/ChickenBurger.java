package com.akozlowski.restaurant;

public class ChickenBurger extends Burger {
    @Override
    public String getName() {
        return "Chicken burger";
    }

    @Override
    public double getPrice() {
        return 3.0;
    }
}
