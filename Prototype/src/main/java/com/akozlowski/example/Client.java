package com.akozlowski.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
    public static void main(String[] args) {
        final Logger logger = LoggerFactory.getLogger(com.akozlowski.prototype.Client.class);

        CarCache.loadCache();
        final BasicCar nano = CarCache.getShape("Nano");
        logger.info("Car is: {}", nano.getInfo());
    }
}