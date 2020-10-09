package com.akozlowski;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;

public class Product {
    private final Logger logger = LoggerFactory.getLogger(Product.class);
    private final LinkedList<String> parts;

    public Product() {
        this.parts = new LinkedList<>();
    }

    public void add(final String part) {
        parts.addLast(part);
    }

    public void show() {
        logger.info("\n Product completed as below");
        parts.forEach(logger::info);
    }
}
