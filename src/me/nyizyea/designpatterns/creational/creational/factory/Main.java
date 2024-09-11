package me.nyizyea.designpatterns.creational.creational.factory;

import me.nyizyea.designpatterns.creational.creational.factory.enums.AnimalType;
import me.nyizyea.designpatterns.creational.creational.factory.interfaces.Animal;

/**
 * Factory pattern is mainly used to separate the object instantiation process from domain logic.
 * We don't want to use 'new' keyword everytime we create an object.
 *
 * Here, we can get the animal we prefer by calling getAnimal() method providing AnimalType.
 * We don't have to care how the object is instantiated.
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal(AnimalType.DOG);
        animal.makeNoise();
    }
}

/**
 * The Factory pattern is a design pattern that provides an interface for creating objects, but lets the subclass decide which class to instantiate.
 * Instead of creating objects directly with the new keyword, the factory method handles the object creation, allowing for more flexibility and control.
 * Key Idea:
 *
 * The Factory pattern is used when:
 *
 *     You don’t want to expose the exact class of an object you’re creating.
 *     The process of creating objects is complex, involves some logic, or depends on conditions.
 *     You want to centralize object creation, making it easier to change or extend.
 *
 * How it works:
 *
 *     Factory (Creator): This is where the logic for creating objects lives. It decides which object to create based on inputs or conditions.
 *
 *     Product (Object): The actual objects that are created by the factory. These can be various subclasses or types of a common interface or parent class.
 *
 *     Client: The client asks the factory to create objects, but doesn’t need to know the details of how they are created.
 *
 * Example:
 *
 * Imagine you’re creating an app where users can select a type of transportation: Car, Bike, or Bus.
 *
 *     Without the factory pattern, every time the user selects a transport, you might write code like new Car(), new Bike(), or new Bus(). If later you want to add a new vehicle, you have to change the code in many places.
 *
 *     With the factory pattern, you create a VehicleFactory. The factory has a method like createVehicle(type) which, based on the input (Car, Bike, Bus), returns the appropriate object.
 */
