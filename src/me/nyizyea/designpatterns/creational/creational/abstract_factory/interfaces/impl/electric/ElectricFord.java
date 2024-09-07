package me.nyizyea.designpatterns.creational.creational.abstract_factory.interfaces.impl.electric;

import me.nyizyea.designpatterns.creational.creational.abstract_factory.interfaces.Car;

public class ElectricFord implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling electric Ford...");
    }
}
