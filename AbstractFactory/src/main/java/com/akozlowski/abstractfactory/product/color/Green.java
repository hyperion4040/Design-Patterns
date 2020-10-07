package com.akozlowski.abstractfactory.product.color;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Green implements Color {

    private final Logger logger = LoggerFactory.getLogger(Green.class);

    @Override
    public void fill() {
        logger.info("Inside Green::fill() method");
    }
}
