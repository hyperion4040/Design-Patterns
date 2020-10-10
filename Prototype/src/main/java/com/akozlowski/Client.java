package com.akozlowski;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
    public static void main(String[] args) {
        final Logger logger = LoggerFactory.getLogger(Client.class);

        ShapeCache.loadCache();

        final Shape shape = (Shape) ShapeCache.getShape("1");
        logger.info("Shape is: "+shape.getType());

        final Shape shape1 = ShapeCache.getShape("2");
        logger.info("Shape is: " + shape1.getType());
    }
}
