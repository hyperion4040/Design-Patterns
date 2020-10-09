package com.akozlowski.vehicle;

public class Director {
    private VehicleBuilder vehicleBuilder;

    public void construct(final VehicleBuilder vehicleBuilder) {
        this.vehicleBuilder = vehicleBuilder;
        this.vehicleBuilder.buildBody();
        this.vehicleBuilder.addHeadlights();
        this.vehicleBuilder.insertWheels();
    }
}
