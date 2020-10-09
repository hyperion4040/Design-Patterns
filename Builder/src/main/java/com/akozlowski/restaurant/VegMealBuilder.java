package com.akozlowski.restaurant;

public class VegMealBuilder implements MealBuilder {

    private Meal vegMeal = new Meal();

    @Override
    public void buildBurger() {
        vegMeal.addItem(new VegBurger());
    }

    @Override
    public void buildColdDrink() {
        vegMeal.addItem(new Coke());
    }

    @Override
    public Meal getMeal() {
        return vegMeal;
    }
}
