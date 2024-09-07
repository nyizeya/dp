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
