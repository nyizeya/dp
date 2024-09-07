package me.nyizyea.designpatterns.creational.creational.prototype;

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
