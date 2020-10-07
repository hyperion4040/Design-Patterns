package com.akozlowski.abstractfactory.creator;

import com.akozlowski.abstractfactory.product.color.Color;
import com.akozlowski.abstractfactory.product.shape.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(final String colorName);

    public abstract Shape getShape(final String shapeTypeName);
}
