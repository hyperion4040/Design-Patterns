package com.akozlowski.vehicle.abstractfactory.example.creator;

import com.akozlowski.vehicle.abstractfactory.example.exception.AnimalTypeNotExistException;
import com.akozlowski.vehicle.abstractfactory.example.product.Animal;
import com.akozlowski.vehicle.abstractfactory.example.product.Duck;
import com.akozlowski.vehicle.abstractfactory.example.product.Tiger;

public class AnimalFactory extends AbstractAnimalFactory {

    public Animal getAnimalType(final String animalTypeName) throws AnimalTypeNotExistException {
        if (animalTypeName == null) {
            throw new AnimalTypeNotExistException(getAnimalTypeNotExistExceptionMessage(animalTypeName));
        } else if (animalTypeName.equals("Tiger")) {
            return new Tiger();
        } else if (animalTypeName.equals("Duck")) {
            return new Duck();
        } else {
            throw new AnimalTypeNotExistException(getAnimalTypeNotExistExceptionMessage(animalTypeName));
        }
    }

    private String getAnimalTypeNotExistExceptionMessage(final String animalTypeName) {
        return "Animal type: "+ animalTypeName + " cannot be created";
    }
}
