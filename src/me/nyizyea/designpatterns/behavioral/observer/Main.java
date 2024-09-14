package me.nyizyea.designpatterns.behavioral.observer;

import me.nyizyea.designpatterns.behavioral.observer.interfaces.impl.WeatherStation;
import me.nyizyea.designpatterns.behavioral.observer.interfaces.impl.WeatherObserver;

/**
 * The Observer pattern is a behavioral design pattern that defines a one-to-many relationship between objects.
 * In this pattern, an object, known as the subject (or publisher), maintains a list of its dependents, called observers (or subscribers),
 * and notifies them of any state changes, usually by calling one of their methods.
 *
 * The core idea is that when the subject's state changes, all observers are automatically notified and updated,
 * allowing them to react accordingly. This decouples the subject from its observers,
 * as the subject doesn't need to know the specific details of how the observers will respond.
 */
public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        WeatherObserver observer = new WeatherObserver(weatherStation);

        weatherStation.setHumidity(100);
        weatherStation.setPressure(200);
        weatherStation.setTemperature(123);

        observer.showData();
    }
}

/**
 * The Observer pattern is a behavioral design pattern that defines a one-to-many dependency between objects so that when one object (the subject) changes its state, all its dependents (called observers) are notified and updated automatically.
 * This pattern is commonly used to implement distributed event-handling systems.
 * Key Concepts:
 *
 *     Subject: The object that holds the state and sends notifications to observers when its state changes.
 *     Observer: The object that wants to be notified of changes in the subject's state.
 *     Concrete Subject: A subject implementation that stores state and notifies observers.
 *     Concrete Observer: An observer implementation that updates itself based on changes in the subject.
 */