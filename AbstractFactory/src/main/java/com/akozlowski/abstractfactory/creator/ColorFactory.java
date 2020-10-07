package com.akozlowski.abstractfactory.creator;

import com.akozlowski.abstractfactory.product.color.Color;
import com.akozlowski.abstractfactory.product.color.Red;
import com.akozlowski.abstractfactory.product.shape.Shape;
import com.akozlowski.abstractfactory.product.color.Blue;
import com.akozlowski.abstractfactory.product.color.Green;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(final String colorName) {
        if (colorName == null) {
            return null;
        } else if (colorName.equals("RED")) {
            return new Red();
        } else if (colorName.equals("BLUE")) {
            return new Blue();
        } else if (colorName.equals("GREEN")) {
            return new Green();
        } else {
            return null;
        }
    }

    // The code smell where the integration segregation principle is not followed
    // The interface/ abstract has methods which will not be implemented by child class
    @Override
    public Shape getShape(final String shapeTypeName) {
        return null;
    }
}
