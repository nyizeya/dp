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

/**
 * The Abstract Factory pattern is a design pattern that provides an interface for creating families of related or dependent objects without specifying their exact classes.
 * It allows you to create a set of related objects (like buttons, checkboxes, etc.) while ensuring that these objects work together, and the client doesn’t need to know the specifics of their creation.
 * Key Idea:
 *
 * Instead of just one factory producing one type of object, the Abstract Factory provides a factory that creates a group of related objects (or products), ensuring that they’re compatible with one another.
 * How it works:
 *
 *     Abstract Factory: This is the interface that defines methods for creating abstract products (related objects).
 *
 *     Concrete Factory: These are the specific factories that implement the Abstract Factory and provide actual instances of the related products.
 *
 *     Abstract Products: These are interfaces or abstract classes that define the types of products that the factory will create.
 *
 *     Concrete Products: These are the actual objects that the Concrete Factory creates, and they implement the abstract product interfaces.
 *
 * Example:
 *
 * Imagine you’re designing a UI toolkit that should work on two different platforms: Windows and macOS. Each platform needs its own type of button, checkbox, etc., but you want to ensure that a Windows button works with a Windows checkbox, and the same for macOS.
 *
 * Without Abstract Factory, you might end up writing a lot of if-else or switch statements to handle different UI components for each platform.
 *
 * With Abstract Factory, you define a family of UI components:
 */