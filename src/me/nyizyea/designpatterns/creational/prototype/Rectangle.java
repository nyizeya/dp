package me.nyizyea.designpatterns.creational.prototype;

public class Rectangle extends Shape{
    public Rectangle(int width, int height) {
        super(width, height);
    }

    @Override
    public void draw() {
        System.out.printf("Drawing Rectangle with width: %d, height: %d\n", width, height);
    }

    @Override
    public Shape cloneObject() {
        return new Rectangle(width, height);
    }
}
