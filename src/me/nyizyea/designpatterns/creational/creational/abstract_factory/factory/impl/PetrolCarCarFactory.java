package me.nyizyea.designpatterns.creational.creational.abstract_factory.factory.impl;

import me.nyizyea.designpatterns.creational.creational.abstract_factory.enums.CarBrand;
import me.nyizyea.designpatterns.creational.creational.abstract_factory.factory.AbstractCarFactory;
import me.nyizyea.designpatterns.creational.creational.abstract_factory.interfaces.Car;
import me.nyizyea.designpatterns.creational.creational.abstract_factory.interfaces.impl.petrol.PetrolFord;
import me.nyizyea.designpatterns.creational.creational.abstract_factory.interfaces.impl.petrol.PetrolToyota;

/**
 * Since this is Petrol car factory, it will create only petrol cars based on CarType.
 */
public class PetrolCarCarFactory implements AbstractCarFactory {
    @Override
    public Car getCar(CarBrand carBrand) {
        switch (carBrand) {
            case FORD:
                return new PetrolFord();
            default:
                return new PetrolToyota();
        }
    }
}
