package me.nyizyea.designpatterns.creational.behavioral.strategy.interfaces.impl;

import me.nyizyea.designpatterns.creational.behavioral.strategy.interfaces.Strategy;

public class Multiplication implements Strategy {
    @Override
    public int execute(int num1, int num2) {
        return num1 * num2;
    }
}
