package me.nyizyea.designpatterns.structural.decorator.interfaces.impl;

import me.nyizyea.designpatterns.structural.decorator.interfaces.Beverage;

public class Sugar extends BeverageDecorator {
    private Beverage beverage;

    public Sugar(Beverage beverage) {
        super(beverage);
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 1;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + Sugar";
    }
}
