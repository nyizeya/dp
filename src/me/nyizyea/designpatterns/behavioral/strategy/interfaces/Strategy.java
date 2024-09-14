package me.nyizyea.designpatterns.behavioral.strategy.interfaces;

/**
 * Always program to Supertype.
 * The actual runtime object should not be locked into the code.
 * The type of variable should be abstract (interface, abstract class) - so runtime object can be instance of any concrete implementing classes.
 */
public interface Strategy {
    int execute(int num1, int num2);
}
