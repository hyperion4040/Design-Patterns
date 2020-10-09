package com.akozlowski.vehicle.abstractfactory.example.client;

import com.akozlowski.vehicle.abstractfactory.example.creator.AbstractAnimalFactory;
import com.akozlowski.vehicle.abstractfactory.example.creator.AnimalFactory;
import com.akozlowski.vehicle.abstractfactory.example.exception.AnimalTypeNotExistException;
import com.akozlowski.vehicle.abstractfactory.example.product.Animal;

public class Client {
    private static final AbstractAnimalFactory animalFactory = new AnimalFactory();

    public static void main(String[] args) throws AnimalTypeNotExistException {

        final Animal tiger = animalFactory.getAnimalType("Tiger");
        tiger.eat();
        tiger.walk();

        final Animal duck = animalFactory.getAnimalType("Duck");
        duck.walk();
        duck.eat();

        final Animal unknown = animalFactory.getAnimalType("Unknown");
        unknown.walk();
        unknown.eat();
    }
}
