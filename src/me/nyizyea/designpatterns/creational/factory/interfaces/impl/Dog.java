package me.nyizyea.designpatterns.creational.factory.interfaces.impl;

import me.nyizyea.designpatterns.creational.factory.interfaces.Animal;

public class Dog implements Animal {
    @Override
    public void makeNoise() {
        System.out.println("Woof woof... ");
    }
}
