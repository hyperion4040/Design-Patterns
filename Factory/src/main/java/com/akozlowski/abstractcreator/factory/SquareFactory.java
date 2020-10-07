package com.akozlowski.abstractcreator.factory;

import com.akozlowski.abstractcreator.product.Shape;
import com.akozlowski.abstractcreator.product.Square;

public class SquareFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Square();
    }
}
