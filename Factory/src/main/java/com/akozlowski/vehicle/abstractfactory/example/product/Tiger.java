package com.akozlowski.vehicle.abstractfactory.example.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tiger implements Animal {

    private final Logger logger = LoggerFactory.getLogger(Tiger.class);

    @Override
    public void walk() {
        logger.info("Tiger is walking");
    }

    @Override
    public void eat() {
        logger.info("Tiger is eating");
    }
}
