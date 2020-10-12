package com.akozlowski.prototype;

import java.util.Dictionary;
import java.util.Hashtable;

public class ShapeCache {

    private static final Dictionary<String, Shape> shapeMap = new Hashtable<>();

    private ShapeCache() {
    }

    public static Shape getShape(final String shapeId) {
        final Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        final Rectangle rectangle = new Rectangle();
        rectangle.setId("1");
        shapeMap.put(rectangle.getId(), rectangle);

        final Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);
    }
}
