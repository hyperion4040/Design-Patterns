package com.akozlowski.vehicle.doublecheckedlocking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        singleton.setData(55);

        logger.info("First reference is: {}", singleton);
        logger.info("Singleton data value is: {} ", singleton.getData());

        singleton = null;
        singleton = Singleton.getInstance();

        logger.info("First reference is: {}", singleton);
        logger.info("Singleton data value is: {} ", singleton.getData());
    }
}
