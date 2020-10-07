package com.akozlowski.abstractfactory.abstractcreator.creator;

import com.akozlowski.abstractfactory.abstractcreator.product.Rectangle;
import com.akozlowski.abstractfactory.abstractcreator.product.Shape;

public class RectangleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}
