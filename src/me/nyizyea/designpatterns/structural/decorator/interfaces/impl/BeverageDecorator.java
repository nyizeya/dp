package me.nyizyea.designpatterns.structural.decorator.interfaces.impl;

import me.nyizyea.designpatterns.structural.decorator.interfaces.Beverage;

public abstract class BeverageDecorator implements Beverage {

    protected Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return beverage.getCost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }
}
