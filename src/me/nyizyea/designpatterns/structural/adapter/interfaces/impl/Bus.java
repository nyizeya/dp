package me.nyizyea.designpatterns.structural.adapter.interfaces.impl;

import me.nyizyea.designpatterns.structural.adapter.interfaces.Vehicle;

public class Bus implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bus is accelerating...");
    }
}
