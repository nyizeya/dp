package me.nyizyea.designpatterns.structural.adapter;

import me.nyizyea.designpatterns.structural.adapter.interfaces.Vehicle;
import me.nyizyea.designpatterns.structural.adapter.interfaces.impl.Bicycle;
import me.nyizyea.designpatterns.structural.adapter.interfaces.impl.BicycleAdapter;
import me.nyizyea.designpatterns.structural.adapter.interfaces.impl.Bus;
import me.nyizyea.designpatterns.structural.adapter.interfaces.impl.Car;

/**
 * The Adapter Pattern is a structural design pattern used to allow two incompatible interfaces to work together. It acts as a bridge between two incompatible classes by converting the interface of a class into another interface that a client expects. This pattern is particularly useful when you want to integrate classes into a system that doesn’t natively support their interface.
 * Key Concepts of the Adapter Pattern:
 *
 *     Client:
 *         This is the object that wants to use a service or functionality but expects a certain interface.
 *
 *     Target Interface:
 *         This is the interface that the client expects to work with.
 *
 *     Adaptee:
 *         This is the class with an incompatible interface that needs to be adapted to work with the client.
 *
 *     Adapter:
 *         The adapter is the class that implements the target interface and converts the requests from the client into calls that the adaptee can understand.
 *
 * How It Works:
 *
 * The Adapter Pattern involves creating an adapter class that wraps around the incompatible class (the adaptee) and implements the target interface. The adapter class translates the requests from the client into a format the adaptee can handle, allowing the two classes to work together.
 * Structure:
 *
 *     Client:
 *         Makes requests that comply with the target interface.
 *     Target Interface:
 *         Defines the interface that the client expects.
 *     Adaptee:
 *         The class with an incompatible interface.
 *     Adapter:
 *         Implements the target interface and adapts the adaptee’s methods to match what the client expects.
 */
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bus = new Bus();
        Vehicle bicycle = new BicycleAdapter(new Bicycle());

        car.accelerate();
        bus.accelerate();
        bicycle.accelerate();
    }
}
