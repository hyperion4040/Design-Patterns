package com.akozlowski.abstractfactory.abstractcreator.creator;

import com.akozlowski.abstractfactory.abstractcreator.product.Shape;
import com.akozlowski.abstractfactory.abstractcreator.product.Square;

public class SquareFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Square();
    }
}
