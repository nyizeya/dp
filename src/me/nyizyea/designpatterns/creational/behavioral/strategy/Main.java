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

/**
 * The Strategy pattern is a behavioral design pattern that allows you to define a family of algorithms, encapsulate each one as a separate class, and make them interchangeable.
 * The client can select the algorithm at runtime without altering the code that uses the algorithm.
 * This pattern promotes the Open/Closed Principle, allowing new strategies to be added without modifying existing code.
 * Key Concepts:
 *
 *     Strategy Interface: Declares a common interface for all supported algorithms.
 *     Concrete Strategy: Implements the algorithm defined by the strategy interface.
 *     Context: Maintains a reference to a strategy object and allows the client to set or change the strategy at runtime.
 */