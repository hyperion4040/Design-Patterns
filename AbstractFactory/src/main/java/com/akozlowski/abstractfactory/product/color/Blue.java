package com.akozlowski.abstractfactory.product.color;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Blue implements Color {

    private final Logger logger = LoggerFactory.getLogger(Blue.class);

    @Override
    public void fill() {
        logger.info("Inside Blue::fill() method");

    }
}
