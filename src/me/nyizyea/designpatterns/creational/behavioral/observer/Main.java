package me.nyizyea.designpatterns.creational.behavioral.observer;

import me.nyizyea.designpatterns.creational.behavioral.observer.interfaces.impl.WeatherObserver;
import me.nyizyea.designpatterns.creational.behavioral.observer.interfaces.impl.WeatherStation;

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
