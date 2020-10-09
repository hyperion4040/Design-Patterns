package com.akozlowski;

public interface Builder {
    void buildBody();

    void insertWheels();

    void addHeadlights();

    Product getVehicle();
}