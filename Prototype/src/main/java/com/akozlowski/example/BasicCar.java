package com.akozlowski.example;

public abstract class BasicCar implements Cloneable {

    protected String name;
    protected double price;

    abstract String getInfo();

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    @Override
    protected Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
