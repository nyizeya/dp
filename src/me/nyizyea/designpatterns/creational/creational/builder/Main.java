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

/**
 * The Builder pattern is a creational design pattern used to construct complex objects step by step.
 * Unlike other creational patterns that focus on instantiating an object in one step (e.g., Factory), the Builder pattern separates the construction of an object from its representation.
 * This allows the same construction process to create different representations of the object.
 * Key Concepts:
 *
 *     Builder Interface/Abstract Class: Defines the methods required for creating the parts of the product.
 *     Concrete Builder: Implements the builder interface and provides specific implementations to construct the product.
 *     Director: Manages the construction process. It uses the builder to create a product but does not know the specifics of what is being built.
 *     Product: The final object that is created by the builder. It can have multiple representations.
 */