package me.nyizyea.designpatterns.creational.creational.abstract_factory;

import me.nyizyea.designpatterns.creational.creational.abstract_factory.enums.CarBrand;
import me.nyizyea.designpatterns.creational.creational.abstract_factory.enums.CarType;
import me.nyizyea.designpatterns.creational.creational.abstract_factory.factory.AbstractCarFactory;
import me.nyizyea.designpatterns.creational.creational.abstract_factory.factory.CarFactoryProducer;
import me.nyizyea.designpatterns.creational.creational.abstract_factory.interfaces.Car;

/**
 * WARNING: Check Factory pattern first to understand how Factory pattern works.
 *
 * Abstract Factory pattern can be assumed as creating Factory for Factories.
 */
public class Main {
    public static void main(String[] args) {
        AbstractCarFactory electricCarFactory = CarFactoryProducer.getCarFactory(CarType.ELECTRIC);
        AbstractCarFactory petrolCarFactory = CarFactoryProducer.getCarFactory(CarType.PETROL);

        Car electricTotyotaCar = electricCarFactory.getCar(CarBrand.TOYOTA);
        Car petrolFordCar = petrolCarFactory.getCar(CarBrand.FORD);

        electricTotyotaCar.assemble();
        petrolFordCar.assemble();

    }
}
