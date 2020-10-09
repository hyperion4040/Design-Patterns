package com.akozlowski.vehicle.abstractfactory.abstractcreator.creator;

import com.akozlowski.vehicle.abstractfactory.abstractcreator.product.Rectangle;
import com.akozlowski.vehicle.abstractfactory.abstractcreator.product.Shape;

public class RectangleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}
