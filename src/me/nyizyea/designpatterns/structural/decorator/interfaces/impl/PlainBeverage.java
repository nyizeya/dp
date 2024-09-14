package me.nyizyea.designpatterns.structural.decorator.interfaces.impl;

import me.nyizyea.designpatterns.structural.decorator.interfaces.Beverage;

public class PlainBeverage implements Beverage {
    @Override
    public int getCost() {
        return 5;
    }

    @Override
    public String getDescription() {
        return "Plain Beverage";
    }
}
