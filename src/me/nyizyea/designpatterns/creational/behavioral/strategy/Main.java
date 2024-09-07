package me.nyizyea.designpatterns.creational.behavioral.strategy;

import me.nyizyea.designpatterns.creational.behavioral.strategy.interfaces.impl.Addition;
import me.nyizyea.designpatterns.creational.behavioral.strategy.interfaces.impl.Multiplication;

/**
 * The Strategy pattern is a behavioral design pattern that defines a family of algorithms, encapsulates each one, and makes them interchangeable.
 * This pattern allows the algorithm to vary independently from the clients that use it, promoting flexibility and cleaner code.
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setStrategy(new Addition());
        System.out.println("Addition: " + calculator.calculate(15, 13));

        calculator.setStrategy(new Multiplication());
        System.out.println("Multiplication: " + calculator.calculate(18, 19));

        /**
         * The thing is we can add new strategies here without having to change existing codes.
         */
    }
}
