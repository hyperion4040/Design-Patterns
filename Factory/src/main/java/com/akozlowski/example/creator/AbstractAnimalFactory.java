package com.akozlowski.example.creator;

import com.akozlowski.example.exception.AnimalTypeNotExistException;
import com.akozlowski.example.product.Animal;

public abstract class AbstractAnimalFactory {

    public abstract Animal getAnimalType(final String animalTypeName) throws AnimalTypeNotExistException;
}
