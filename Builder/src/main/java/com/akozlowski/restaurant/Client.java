package com.akozlowski.restaurant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
    public static void main(String[] args) {
        final Logger logger = LoggerFactory.getLogger(Client.class);
        final Director director = new Director();
        final MealBuilder vegMealBuilder = new VegMealBuilder();
        final MealBuilder meatMealBuilder = new MeatMealBuilder();

        director.construct(vegMealBuilder);
        final Meal vegMeal = vegMealBuilder.getMeal();

        logger.info("Veg Meal");
        vegMeal.showItems();
        logger.info("Cost: "+ vegMeal.getCost());
        director.construct(meatMealBuilder);
        final Meal meatMeal = meatMealBuilder.getMeal();

        logger.info("Meat Meal");
        meatMeal.showItems();
        logger.info("Cost: "+ meatMeal.getCost());

    }
}
