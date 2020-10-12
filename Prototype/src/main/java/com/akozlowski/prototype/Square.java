package com.akozlowski.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Square extends Shape {

    private final Logger logger = LoggerFactory.getLogger(Square.class);

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        logger.info("Inside Square::draw method");
    }
}
