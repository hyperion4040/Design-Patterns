package com.akozlowski.vehicle.abstractfactory.product.shape;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Square implements Shape {

    private final Logger logger = LoggerFactory.getLogger(Square.class);

    @Override
    public void draw() {
        logger.info("Inside Square::draw() method");
    }
}
