package me.nyizyea.designpatterns.creational.behavioral.command;


// Receiver
public class LightSwitch {
    public void turnOn() {
        System.out.println("Light is on...");
    }

    public void turnOff() {
        System.out.println("Light is off...");
    }
}
