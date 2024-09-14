package me.nyizyea.designpatterns.structural.decorator.interfaces.impl;

import me.nyizyea.designpatterns.structural.decorator.interfaces.Beverage;

public class Milk extends BeverageDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        super(beverage);
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 3;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + milk";
    }
}
