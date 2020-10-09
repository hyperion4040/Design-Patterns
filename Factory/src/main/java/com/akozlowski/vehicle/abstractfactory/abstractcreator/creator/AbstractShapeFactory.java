package com.akozlowski.vehicle.abstractfactory.abstractcreator.creator;

import com.akozlowski.vehicle.abstractfactory.abstractcreator.product.Shape;

public abstract class AbstractShapeFactory {

    protected abstract Shape factoryMethod();

    public Shape getShape() {
        return factoryMethod();
    }
}
