package com.akozlowski.vehicle;

public class Car implements VehicleBuilder {

    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of the car");
    }

    @Override
    public void insertWheels() {
        product.add("4 wheels are added");
    }

    @Override
    public void addHeadlights() {
        product.add("2 headlights are added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}