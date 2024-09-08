package me.nyizyea.designpatterns.creational.behavioral.observer.interfaces.impl;

import me.nyizyea.designpatterns.creational.behavioral.observer.interfaces.Observer;
import me.nyizyea.designpatterns.creational.behavioral.observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    private int pressure;
    private int temperature;
    private int humidity;
    private List<Observer> observers;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : this.observers) {
            observer.update(this.pressure, this.temperature, this.humidity);
        }
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        this.notifyAllObservers();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        this.notifyAllObservers();
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        this.notifyAllObservers();
    }
}
