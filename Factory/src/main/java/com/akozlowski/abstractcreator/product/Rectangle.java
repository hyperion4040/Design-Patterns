package com.akozlowski.abstractcreator.product;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rectangle implements Shape {

    private final Logger logger = LoggerFactory.getLogger(Rectangle.class);

    @Override
    public void draw() {
        logger.info("Inside Rectangle::draw() method");
    }
}
