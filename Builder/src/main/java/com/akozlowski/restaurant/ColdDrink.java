package com.akozlowski.restaurant;

import java.sql.Wrapper;

public abstract class ColdDrink implements Item {

    @Override
    public Packing getPacking() {
        return new Bottle();
    }

    @Override
    public abstract double getPrice();
}
