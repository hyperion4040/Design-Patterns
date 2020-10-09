package com.akozlowski.restaurant;

public class MeatMealBuilder implements MealBuilder {

    private Meal meatMeal = new Meal();

    @Override
    public void buildBurger() {
        meatMeal.addItem(new ChickenBurger());
    }

    @Override
    public void buildColdDrink() {
        meatMeal.addItem(new Pepsi());
    }

    @Override
    public Meal getMeal() {
        return meatMeal;
    }
}
