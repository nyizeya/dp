package me.nyizyea.designpatterns.creational.creational.abstract_factory.factory;

import me.nyizyea.designpatterns.creational.creational.abstract_factory.enums.CarType;
import me.nyizyea.designpatterns.creational.creational.abstract_factory.factory.impl.ElectricCarCarFactory;
import me.nyizyea.designpatterns.creational.creational.abstract_factory.factory.impl.PetrolCarCarFactory;

public class CarFactoryProducer {
    public static AbstractCarFactory getCarFactory(CarType carType) {
        switch (carType) {
            case ELECTRIC:
                return new ElectricCarCarFactory();
            default:
                return new PetrolCarCarFactory();
        }
    }
}
