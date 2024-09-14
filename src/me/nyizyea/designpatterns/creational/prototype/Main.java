package me.nyizyea.designpatterns.creational.prototype;

/**
 * The Prototype pattern is a creational design pattern used to create new objects by copying or cloning an existing object, known as the prototype.
 * Instead of creating new instances from scratch, the pattern allows for the creation of objects based on a template, improving performance and simplifying object creation.
 *
 * We can use Prototype pattern to eliminate inheritance. This promotes object composition over inheritance, which is one of the principles of good object-oriented design.
 */
public class Main {
    public static void main(String[] args) {
        Shape square = new Square(10, 5);
        square.draw();

        Shape squareClone = square.cloneObject();
        squareClone.draw();
    }
}

/**
 * The Prototype pattern is a design pattern that helps you create new objects by copying existing ones, rather than creating new instances from scratch.
 * It’s useful when the process of creating an object is costly or complex, and you want a quick way to create duplicates.
 * Here's how it works in plain English:
 *
 *     Prototype: You have an existing object that acts as a prototype (a kind of blueprint). Instead of creating new objects from the ground up, you make a copy of this prototype.
 *
 *     Cloning: When you need a new object, you clone the prototype, which gives you an exact copy of the original object. You can then modify the clone if needed.
 *
 * Example:
 *
 *     Imagine you're designing a video game with different types of characters: Knight, Archer, and Wizard.
 *     Creating each character from scratch every time might involve a lot of settings and configurations (like health, weapons, armor, skills, etc.).
 *     Instead, you create a prototype for each character. When you need a new Knight, you clone the Knight prototype, then tweak its attributes if needed (like giving it a different weapon or more health).
 */