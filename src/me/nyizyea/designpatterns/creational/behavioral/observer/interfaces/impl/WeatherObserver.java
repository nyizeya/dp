package me.nyizyea.designpatterns.creational.behavioral.observer.interfaces.impl;

import me.nyizyea.designpatterns.creational.behavioral.observer.interfaces.Observer;
import me.nyizyea.designpatterns.creational.behavioral.observer.interfaces.Subject;

public class WeatherObserver implements Observer {
    private int pressure;
    private int temperature;
    private int humidity;
    private Subject subject;

    public WeatherObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update(int pressure, int temperature, int humidity) {
        this.pressure = pressure;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public void showData() {
        System.out.println(
                "Pressure: " + pressure + ", temperature: " + temperature + ", humidity: " + humidity
        );
    }

    public int getPressure() {
        return pressure;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }
}
