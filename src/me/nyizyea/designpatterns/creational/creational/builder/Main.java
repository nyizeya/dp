package me.nyizyea.designpatterns.creational.creational.builder;

/**
 * The Builder pattern is used to simplify the construction of complex objects by breaking the process into smaller steps.
 * It is especially useful when an object has many optional parameters or when the construction process involves multiple stages.
 */
public class Main {
    public static void main(String[] args) {
        Person nyizeya = new Person.Builder("Nyi Zeya")
                .email("nyizeya@google.com")
                .address("Tamwe Tsp, Yangon")
                .age(23)
                .build();

        System.out.println(nyizeya);
    }
}
