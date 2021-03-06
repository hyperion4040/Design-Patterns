package com.akozlowski.vehicle.abstractfactory.product.shape;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Circle implements Shape {

    private final Logger logger = LoggerFactory.getLogger(Circle.class);

    @Override
    public void draw() {
        logger.info("Inside Circle::draw() method");
    }
}
