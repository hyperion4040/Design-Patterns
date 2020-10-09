package com.akozlowski.restaurant;

public class VegBurger extends Burger {
    @Override
    public String getName() {
        return "VegBurger";
    }

    @Override
    public double getPrice() {
        return 2.5;
    }
}
