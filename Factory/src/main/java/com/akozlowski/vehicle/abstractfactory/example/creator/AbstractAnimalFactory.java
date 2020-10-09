package com.akozlowski.vehicle.abstractfactory.example.creator;

import com.akozlowski.vehicle.abstractfactory.example.exception.AnimalTypeNotExistException;
import com.akozlowski.vehicle.abstractfactory.example.product.Animal;

public abstract class AbstractAnimalFactory {

    public abstract Animal getAnimalType(final String animalTypeName) throws AnimalTypeNotExistException;
}
