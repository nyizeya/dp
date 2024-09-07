package me.nyizyea.designpatterns.creational.creational.factory.interfaces.impl;

import me.nyizyea.designpatterns.creational.creational.factory.interfaces.Animal;

public class Lion implements Animal {
    @Override
    public void makeNoise() {
        System.out.println("Roar roar...");
    }
}
