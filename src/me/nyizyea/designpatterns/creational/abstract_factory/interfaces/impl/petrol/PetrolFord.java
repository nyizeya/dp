package me.nyizyea.designpatterns.creational.abstract_factory.interfaces.impl.petrol;

import me.nyizyea.designpatterns.creational.abstract_factory.interfaces.Car;

public class PetrolFord implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling petrol Ford...");
    }
}
