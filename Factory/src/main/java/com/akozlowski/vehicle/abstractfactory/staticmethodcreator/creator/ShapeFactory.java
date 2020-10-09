package com.akozlowski.vehicle.abstractfactory.staticmethodcreator.creator;


import com.akozlowski.vehicle.abstractfactory.staticmethodcreator.product.Circle;
import com.akozlowski.vehicle.abstractfactory.staticmethodcreator.product.Rectangle;
import com.akozlowski.vehicle.abstractfactory.staticmethodcreator.product.Shape;
import com.akozlowski.vehicle.abstractfactory.staticmethodcreator.product.Square;

public class ShapeFactory {

    public static Shape getShape(final String shapeTypeName) {
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
