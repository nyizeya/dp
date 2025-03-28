package me.nyizyea.designpatterns.creational.prototype;

public class Square extends Shape {
    public Square(int width, int height) {
        super(width, height);
    }

    @Override
    public void draw() {
        System.out.printf("Drawing square with width: %d, height: %d\n", width, height);
    }

    @Override
    public Shape cloneObject() {
        return new Square(width, height);
    }
}
