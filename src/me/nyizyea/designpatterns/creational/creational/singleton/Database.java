package me.nyizyea.designpatterns.creational.creational.singleton;

/**
 * Enums are compile time constant.
 * It's guaranteed that INSTANCE is thread safe by default.
 */
public enum Database {
    INSTANCE;

    public void connect() {
        System.out.println("connecting...");
    }

    public void disconnect() {
        System.out.println("disconnecting...");
    }
}
