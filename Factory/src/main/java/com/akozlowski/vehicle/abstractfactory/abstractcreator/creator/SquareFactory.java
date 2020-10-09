package com.akozlowski.vehicle.abstractfactory.abstractcreator.creator;

import com.akozlowski.vehicle.abstractfactory.abstractcreator.product.Shape;
import com.akozlowski.vehicle.abstractfactory.abstractcreator.product.Square;

public class SquareFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Square();
    }
}
