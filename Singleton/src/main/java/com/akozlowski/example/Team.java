package com.akozlowski.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Team {
    private final static Logger logger = LoggerFactory.getLogger(Team.class);

    public static void main(String[] args) {
        Captain captain1 = Captain.getInstance();
        logger.info("Choosing captain");
        logger.info("The captain info: {}", captain1);

        Captain captain2 = Captain.getInstance();
        logger.info("The captain info after getting captain again: {} ",captain2);
        logger.info("Checking if the same person is the captain: {}", captain1 == captain2 );

    }
}
