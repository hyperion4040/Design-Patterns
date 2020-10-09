package com.akozlowski.restaurant;

public interface MealBuilder {
    void buildBurger();

    void buildColdDrink();

    Meal getMeal();
}
