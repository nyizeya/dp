package me.nyizyea.designpatterns.creational.creational.singleton;

/**
 * The Singleton pattern is a design pattern that ensures a class has only one instance and provides a global point of access to that instance.
 * It is commonly used when exactly one object is needed to coordinate actions across a system.
 *
 * Singleton is often used for managing shared resources like database connections, logging services, or configuration settings.
 */
public class Main {
    public static void main(String[] args) {
        // Using class
        DatabaseConnector.getInstance().connect();
        DatabaseConnector.getInstance().disconnect();

        DatabaseConnector o1 = DatabaseConnector.getInstance();
        DatabaseConnector o2 = DatabaseConnector.getInstance();

        if (o1 == o2) {
            System.out.println("Objects are the same");
        }

        System.out.println();

        // Using Enum
        Database.INSTANCE.connect();
        Database.INSTANCE.disconnect();

        Database o3 = Database.INSTANCE;
        Database o4 = Database.INSTANCE;

        if (o3 == o4) {
            System.out.println("Objects are the same");
        }
    }
}
