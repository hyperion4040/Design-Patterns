package com.akozlowski.vehicle;

public interface VehicleBuilder {
    void buildBody();

    void insertWheels();

    void addHeadlights();

    Product getVehicle();
}
