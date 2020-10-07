package com.akozlowski.abstractcreator.factory;

import com.akozlowski.abstractcreator.product.Circle;
import com.akozlowski.abstractcreator.product.Shape;

public class CircleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Circle();
    }
}
