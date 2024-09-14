package me.nyizyea.designpatterns.creational.abstract_factory.factory.impl;

import me.nyizyea.designpatterns.creational.abstract_factory.interfaces.Car;
import me.nyizyea.designpatterns.creational.abstract_factory.interfaces.impl.electric.ElectricFord;
import me.nyizyea.designpatterns.creational.abstract_factory.interfaces.impl.electric.ElectricToyota;
import me.nyizyea.designpatterns.creational.abstract_factory.enums.CarBrand;
import me.nyizyea.designpatterns.creational.abstract_factory.factory.AbstractCarFactory;

/**
 * Since this is Electric car factory, it will create only electric cars based on CarType.
 */
public class ElectricCarCarFactory implements AbstractCarFactory {
    @Override
    public Car getCar(CarBrand carBrand) {
        switch (carBrand) {
            case FORD:
                return new ElectricFord();
            default:
                return new ElectricToyota();
        }
    }
}
