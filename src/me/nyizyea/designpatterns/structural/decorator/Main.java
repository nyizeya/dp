package me.nyizyea.designpatterns.structural.decorator;

import me.nyizyea.designpatterns.structural.decorator.interfaces.Beverage;
import me.nyizyea.designpatterns.structural.decorator.interfaces.impl.Milk;
import me.nyizyea.designpatterns.structural.decorator.interfaces.impl.PlainBeverage;
import me.nyizyea.designpatterns.structural.decorator.interfaces.impl.Sugar;

/**
 * The Decorator Pattern is a structural design pattern used to add behavior or functionality to individual objects dynamically, without modifying the class itself.
 * It provides a flexible alternative to subclassing for extending functionality.
 * Key Concepts of the Decorator Pattern:
 *
 *     Component Interface: This defines the interface for objects that can have responsibilities added to them.
 *     Both the base object and the decorator implement this interface, ensuring they are interchangeable.
 *
 *     Concrete Component: This is the original object or class that we want to add new behavior to.
 *     It implements the component interface and contains the core functionality.
 *
 *     Decorator Class: The decorator class implements the component interface and contains a reference to a component object (which could be either the concrete component or another decorator).
 *     It "wraps" the original object and can extend or modify its behavior.
 *
 *     Concrete Decorator: These are classes that extend the functionality of the component by adding new behavior,
 *     either before or after delegating to the original object.
 *
 *                     Component
 *                         |
 *              -------------------
 *             |                  |
 *          Concrete           Decorator
 *          Component             |
 *                                |
 *                        Concrete Decorator 1
 *                        Concrete Decorator 2
 */
public class Main {
    public static void main(String[] args) {
        Beverage b = new Sugar(new Milk(new PlainBeverage()));
        System.out.println(b.getCost());
        System.out.println(b.getDescription());
    }
}
