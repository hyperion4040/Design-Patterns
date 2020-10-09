package com.akozlowski.restaurant;

public class Director {
    MealBuilder myBuilder;

    public void construct(final MealBuilder mealBuilder) {
        this.myBuilder = mealBuilder;
        this.myBuilder.buildBurger();
        this.myBuilder.buildColdDrink();
    }
}
