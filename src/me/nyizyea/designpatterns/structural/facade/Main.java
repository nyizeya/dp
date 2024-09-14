package me.nyizyea.designpatterns.structural.facade;

/**
 * The Facade Pattern is a structural design pattern that provides a simplified interface to a complex system of classes, libraries, or frameworks. The goal is to make the system easier to use by hiding its complexity behind a more straightforward, high-level interface.
 * Key Concepts of the Facade Pattern:
 *
 *     Simplification:
 *         The primary purpose of a facade is to simplify the interaction with a complex subsystem by providing a clear and easy-to-use interface.
 *
 *     Encapsulation of Complexity:
 *         It hides the internal workings of a system, ensuring that users of the facade don't need to know the intricate details of how the subsystem operates.
 *
 *     Reduces Dependency:
 *         The facade reduces the number of objects that the client code interacts with, minimizing direct dependencies on the underlying subsystem components.
 *
 * Structure of the Facade Pattern:
 *
 *     Facade:
 *         This is the simplified interface that clients use. It knows which subsystem classes are responsible for which tasks and delegates the requests to the appropriate objects.
 *
 *     Subsystem Classes:
 *         These are the classes that perform the actual work. The facade forwards client requests to these classes, which contain the complex functionality of the system.
 *
 *     Client:
 *         The client interacts only with the facade, not directly with the subsystem classes. This allows the client to work with a simple interface and not worry about the complex internals.
 *
 * How It Works:
 *
 *     The facade defines a unified, high-level interface that makes the subsystem easier to use.
 *     It delegates client requests to appropriate subsystem classes but doesn’t hide the subsystem entirely; if the client needs more control, it can access the subsystem classes directly.
 *
 * Example Without Code:
 *
 * Imagine you're staying at a hotel:
 *
 *     Subsystems:
 *         The hotel has different subsystems like the restaurant, housekeeping, laundry, and the concierge.
 *
 *     Client:
 *         You, as a guest, need to interact with these subsystems, but you don't want to deal with each one directly.
 *
 *     Facade (Hotel Reception Desk):
 *         The reception desk is the facade. You simply make your request at the reception desk, and they handle the rest by interacting with the subsystems behind the scenes (e.g., they call the restaurant, arrange housekeeping, or book a tour with the concierge).
 *
 * The facade shields you from the complexity of dealing with different departments, making your experience seamless and easier.
 *
 *                                               Client -------> Facade -------> Subsystem 1
 *                                                                               Subsystem 2
 *                                                                               Subsystem 3
 */
public class Main {
    public static void main(String[] args) {
        SortingManager sortingManager = new SortingManager();
        sortingManager.doMergeSort();
        sortingManager.doBubbleSort();
        sortingManager.doQuickSort();
    }
}
