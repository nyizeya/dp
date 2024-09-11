package me.nyizyea.designpatterns.creational.behavioral.null_object;

/**
 * The Null Object pattern is a design pattern that provides a way to represent the absence of an object in a meaningful way. Instead of returning null when an object is not found or available, it returns a special object called a "null object" that represents the absence of an object.
 *
 * Key benefits of using the Null Object pattern:
 *
 *     Avoids null pointer exceptions: By returning a null object instead of null, you can avoid potential null pointer exceptions that can lead to runtime errors.
 *     Improves code readability: Using a null object can make your code more readable and easier to understand, as it clearly indicates the absence of an object.
 *     Provides a default behavior: A null object can provide a default behavior when an object is not available, making your code more robust and less error-prone.
 *
 * Example:
 *
 * Consider a Customer class that has a getOrders() method.
 * If a customer has no orders, the method could return null.
 * However, using the Null Object pattern, we could return a NullOrders object instead.
 */
public class Main {
    public static void main(String[] args) {
        CustomerFactory customerFactory = new CustomerFactory();
        System.out.println(customerFactory.getCustomerByName("Joe").getCustomer());
        System.out.println(customerFactory.getCustomerByName("Naruto").getCustomer());
    }
}
