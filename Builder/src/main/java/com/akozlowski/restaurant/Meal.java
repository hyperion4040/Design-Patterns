package com.akozlowski.restaurant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Meal {
    private final Logger logger = LoggerFactory.getLogger(Meal.class);
    private final List<Item> items;

    public Meal() {
        this.items = new ArrayList<>();
    }

    public void addItem(final Item item) {
        items.add(item);
    }

    public double getCost() {
        return items.stream().collect(Collectors.summarizingDouble(Item::getPrice)).getSum();
    }

    public void showItems() {
        items.forEach(item -> logger.info("Item: " + item.getName()
                + ", Packing: " + item.getPacking().getPacking()
                + ", Price: " + item.getPrice()));
    }
}
