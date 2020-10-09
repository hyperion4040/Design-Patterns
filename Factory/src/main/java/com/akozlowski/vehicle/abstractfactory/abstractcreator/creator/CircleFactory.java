package com.akozlowski.vehicle.abstractfactory.abstractcreator.creator;

import com.akozlowski.vehicle.abstractfactory.abstractcreator.product.Circle;
import com.akozlowski.vehicle.abstractfactory.abstractcreator.product.Shape;

public class CircleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}
