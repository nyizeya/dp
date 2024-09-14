package me.nyizyea.designpatterns.creational.singleton;

public class DatabaseConnector {
    private static DatabaseConnector INSTANCE;

    // cannot instantiate the class outside the class
    private DatabaseConnector() {}

    // Does not instantiate until it's used
    // One weakness is that when multiple threads access, need to synchronize the instantiation
    // And synchronization is slow as fuck
    public static DatabaseConnector getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DatabaseConnector();
        }

        return INSTANCE;
    }

    public void connect() {
        System.out.println("connecting to database...");
    }

    public void disconnect() {
        System.out.println("disconnecting from database...");
    }
}
