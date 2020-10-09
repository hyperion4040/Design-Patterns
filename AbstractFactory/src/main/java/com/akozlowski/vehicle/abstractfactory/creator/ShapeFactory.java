package com.akozlowski.vehicle.abstractfactory.creator;

import com.akozlowski.vehicle.abstractfactory.product.color.Color;
import com.akozlowski.vehicle.abstractfactory.product.shape.Circle;
import com.akozlowski.vehicle.abstractfactory.product.shape.Rectangle;
import com.akozlowski.vehicle.abstractfactory.product.shape.Shape;
import com.akozlowski.vehicle.abstractfactory.product.shape.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(final String colorName) {
        return null;
    }

    @Override
    public Shape getShape(final String shapeTypeName) {
        if (shapeTypeName == null) {
            return null;
        } else if (shapeTypeName.equals("CIRCLE")) {
            return new Circle();
        } else if (shapeTypeName.equals("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeTypeName.equals("SQUARE")) {
            return new Square();
        } else {
            return null;
        }
    }

}
