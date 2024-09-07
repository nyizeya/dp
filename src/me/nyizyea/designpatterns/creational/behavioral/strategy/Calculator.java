package me.nyizyea.designpatterns.creational.behavioral.strategy;

import me.nyizyea.designpatterns.creational.behavioral.strategy.interfaces.Strategy;

/**
 * Abstract layer between high level modules(interface, abstract class) and low level modules(implementing classes)
 */
public class Calculator {
    // We have to use COMPOSITION here
    // SO THE BEHAVIOR CAN BE CHANGED AT RUNTIME
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        if (strategy == null) throw new IllegalArgumentException("Strategy cannot be null");
        this.strategy = strategy;
    }

    public int calculate(int num1, int num2) {
        if (strategy == null) throw new IllegalStateException("Strategy must be set");
        return strategy.execute(num1, num2);
    }
}
