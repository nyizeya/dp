package me.nyizyea.designpatterns.structural.adapter.interfaces.impl;

import me.nyizyea.designpatterns.structural.adapter.interfaces.Vehicle;

public class Car implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Car is accelerating...");
    }
}
