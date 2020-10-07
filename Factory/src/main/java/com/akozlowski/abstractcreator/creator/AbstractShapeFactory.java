package com.akozlowski.abstractcreator.creator;

import com.akozlowski.abstractcreator.product.Shape;

public abstract class AbstractShapeFactory {

    protected abstract Shape factoryMethod();

    public Shape getShape() {
        return factoryMethod();
    }
}
