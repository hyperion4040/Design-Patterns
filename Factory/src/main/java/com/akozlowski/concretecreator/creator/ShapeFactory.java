package com.akozlowski.concretecreator.creator;

import com.akozlowski.concretecreator.product.Circle;
import com.akozlowski.concretecreator.product.Rectangle;
import com.akozlowski.concretecreator.product.Shape;
import com.akozlowski.concretecreator.product.Square;

public class ShapeFactory {

    public Shape getShape(final String shapeTypeName) {
        if (shapeTypeName == null) {
            return null;
        } else if (shapeTypeName.equals("CIRCLE")) {
            return new Circle();
        } else if (shapeTypeName.equals("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeTypeName.equals("SQUARE")) {
            return new Square();
        } else {
            return null;
        }
    }
}
