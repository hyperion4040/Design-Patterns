package com.akozlowski.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rectangle extends Shape {

    private final Logger logger = LoggerFactory.getLogger(Rectangle.class);

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        logger.info("Inside Rectangle::draw method");
    }
}
