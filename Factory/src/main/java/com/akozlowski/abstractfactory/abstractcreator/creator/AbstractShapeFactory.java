package com.akozlowski.abstractfactory.abstractcreator.creator;

import com.akozlowski.abstractfactory.abstractcreator.product.Shape;

public abstract class AbstractShapeFactory {

    protected abstract Shape factoryMethod();

    public Shape getShape() {
        return factoryMethod();
    }
}
