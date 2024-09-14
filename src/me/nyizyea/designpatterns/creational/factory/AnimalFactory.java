package me.nyizyea.designpatterns.creational.factory;

import me.nyizyea.designpatterns.creational.factory.enums.AnimalType;
import me.nyizyea.designpatterns.creational.factory.interfaces.Animal;
import me.nyizyea.designpatterns.creational.factory.interfaces.impl.Cat;
import me.nyizyea.designpatterns.creational.factory.interfaces.impl.Dog;
import me.nyizyea.designpatterns.creational.factory.interfaces.impl.Lion;

public class AnimalFactory {
    public static Animal getAnimal(AnimalType animalType) {
        switch (animalType) {
            case CAT:
                return new Cat();
            case DOG:
                return new Dog();
            default:
                return new Lion();
        }
    }
}
