package com.akozlowski;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Hashtable;

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
