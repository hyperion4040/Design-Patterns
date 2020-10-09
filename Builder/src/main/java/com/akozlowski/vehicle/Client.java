package com.akozlowski.vehicle;

public class Client {
    public static void main(String[] args) {
        final Director director = new Director();
        final VehicleBuilder carBuilder = new Car();
        final VehicleBuilder motorcycleBuilder = new Motorcycle();

        director.construct(carBuilder);
        final Product p1 = carBuilder.getVehicle();
        p1.show();

        director.construct(motorcycleBuilder);
        final Product p2 = motorcycleBuilder.getVehicle();
        p2.show();
    }
}
