package me.nyizyea.designpatterns.structural.adapter.interfaces.impl;

import me.nyizyea.designpatterns.structural.adapter.interfaces.Vehicle;

public class BicycleAdapter implements Vehicle {
    private Bicycle bicycle;

    public BicycleAdapter(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void accelerate() {
        bicycle.go();
    }
}
