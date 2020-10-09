package com.akozlowski.vehicle.abstractfactory.creator;

public class FactoryProducer {
    public static AbstractFactory getFactory(final String factoryName) {
        if (factoryName.equals("SHAPE")) {
            return new ShapeFactory();
        } else if (factoryName.equals("COLOR")) {
            return new ColorFactory();
        }else {
            return null;
        }
    }
}
