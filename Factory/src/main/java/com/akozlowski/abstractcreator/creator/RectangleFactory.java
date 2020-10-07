package com.akozlowski.abstractcreator.creator;

import com.akozlowski.abstractcreator.product.Rectangle;
import com.akozlowski.abstractcreator.product.Shape;

public class RectangleFactory extends AbstractShapeFactory {
    @Override
    protected Shape factoryMethod() {
        return new Rectangle();
    }
}
