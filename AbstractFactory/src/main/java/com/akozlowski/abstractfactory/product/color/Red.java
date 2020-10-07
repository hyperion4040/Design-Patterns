package com.akozlowski.abstractfactory.product.color;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Red implements Color {

    private final Logger logger = LoggerFactory.getLogger(Red.class);

    @Override
    public void fill() {
        logger.info("Inside Red::fill() method");
    }
}
