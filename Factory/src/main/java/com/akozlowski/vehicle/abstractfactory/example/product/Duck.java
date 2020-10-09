package com.akozlowski.vehicle.abstractfactory.example.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Duck implements Animal {

    private final Logger logger = LoggerFactory.getLogger(Duck.class);

    @Override
    public void walk() {
        logger.info("Duck is walking");
    }

    @Override
    public void eat() {
        logger.info("Duck is eating");
    }
}
