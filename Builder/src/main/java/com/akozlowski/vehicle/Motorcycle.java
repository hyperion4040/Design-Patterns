package com.akozlowski.vehicle;

public class Motorcycle implements VehicleBuilder {

    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of the motorcycle");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are added");
    }

    @Override
    public void addHeadlights() {
        product.add("1 headlight is added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
