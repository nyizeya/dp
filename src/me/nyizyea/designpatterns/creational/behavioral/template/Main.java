package me.nyizyea.designpatterns.creational.behavioral.template;

/**
 * The Template pattern is a
 * design pattern that defines the skeleton of an algorithm in an operation, deferring some steps to subclasses.
 * This pattern lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 3, -2, 12, 8, 6};
        Algorithm bubbleSort = new BubbleSort(array);
        Algorithm selectionSort = new SelectionSort(array);

        bubbleSort.doSort();
        selectionSort.doSort();
    }
}

/**
 * The Template and Strategy patterns are both behavioral design patterns that deal with algorithms and provide flexibility in their implementation.
 *
 *  However, they have distinct use cases:
 *
 * Template Pattern:
 *
 *     When to use:
 *         When you have a common algorithm structure with variations in specific steps.
 *         When you need to enforce a specific algorithm framework while allowing subclasses to customize certain parts.
 *         When you want to avoid code duplication and promote code reuse.
 *         When you need flexibility in customizing the algorithm without changing its overall structure.
 *     How it works:
 *         Defines a skeleton of an algorithm in an operation, deferring some steps to subclasses.
 *         Subclasses can override these steps to provide their own implementations.
 *         The base class controls the overall algorithm flow.
 *
 * Strategy Pattern:
 *
 *     When to use:
 *         When you have multiple algorithms that perform the same task but differ in their implementation.
 *         When you need to switch algorithms dynamically at runtime.
 *         When you want to encapsulate algorithms and make them interchangeable.
 *         When you want to avoid tightly coupling the client code to the algorithm implementation.
 *     How it works:
 *         Defines a family of algorithms, encapsulates each algorithm, and makes them interchangeable.
 *         A client can select the appropriate algorithm at runtime and use it without knowing its specific implementation.
 *
 *         In summary:
 *
 *     Template Pattern is suitable when you have a fixed algorithm structure with variations in specific steps.
 *     Strategy Pattern is suitable when you have multiple algorithms that perform the same task but differ in their implementation and need to switch them dynamically.
 *
 * By understanding the key differences and use cases of these patterns, you can choose the appropriate pattern to improve the flexibility, maintainability, and reusability of your code.
 */