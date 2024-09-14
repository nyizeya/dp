package me.nyizyea.designpatterns.creational.factory.interfaces.impl;

import me.nyizyea.designpatterns.creational.factory.interfaces.Animal;

public class Cat implements Animal {
    @Override
    public void makeNoise() {
        System.out.println("Meow meow...");
    }
}
