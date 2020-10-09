package com.akozlowski.vehicle.abstractfactory.creator;

import com.akozlowski.vehicle.abstractfactory.product.color.Color;
import com.akozlowski.vehicle.abstractfactory.product.shape.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(final String colorName);

    public abstract Shape getShape(final String shapeTypeName);
}
