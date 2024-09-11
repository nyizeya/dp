package me.nyizyea.designpatterns.creational.behavioral.visitor;

import me.nyizyea.designpatterns.creational.behavioral.visitor.interfaces.ShoppingCartItem;
import me.nyizyea.designpatterns.creational.behavioral.visitor.interfaces.ShoppingCartVisitor;
import me.nyizyea.designpatterns.creational.behavioral.visitor.interfaces.impl.Chair;
import me.nyizyea.designpatterns.creational.behavioral.visitor.interfaces.impl.ShoppingCart;
import me.nyizyea.designpatterns.creational.behavioral.visitor.interfaces.impl.Table;

import java.util.ArrayList;
import java.util.List;

/**
 * The Visitor pattern is a design pattern that lets you add new operations to a group of related objects without changing their classes.
 * It’s useful when you have a lot of different types of objects, and you need to perform various actions on them, but you don’t want to change their structure every time you add a new action.
 *
 * Here’s a simple breakdown:
 *
 *     Objects (Elements): You have different objects (let's say animals like Dog, Cat, and Bird), and you want to perform various operations on them (like feeding, playing, etc.).
 *
 *     Visitor: Instead of each object knowing how to handle every action, you create a Visitor object (like a PetCareVisitor). This visitor knows how to handle each action, and each animal just accepts the visitor and lets it do its job.
 *
 *     Double Dispatch: When you send the visitor to the object (like sending PetCareVisitor to a Dog), the Dog tells the visitor "Hey, I’m a dog, do your thing!" This is called double dispatch because both the object and the visitor are involved in determining what action should happen.
 */
public class Main {
    public static void main(String[] args) {
        List<ShoppingCartItem> items = new ArrayList<>();
        items.add(new Table("Study Desk", 20));
        items.add(new Chair("Gaming Chair", 13));
        items.add(new Chair("Gaming Chair", 14));

        double sum = 0;

        ShoppingCartVisitor visitor = new ShoppingCart();

        for (ShoppingCartItem item : items) {
            sum += item.accept(visitor);
        }

        System.out.println("Sum: " + sum);

    }
}
