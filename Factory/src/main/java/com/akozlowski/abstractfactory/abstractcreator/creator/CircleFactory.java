package com.akozlowski.abstractfactory.abstractcreator.creator;

import com.akozlowski.abstractfactory.abstractcreator.product.Circle;
import com.akozlowski.abstractfactory.abstractcreator.product.Shape;

public class CircleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}
