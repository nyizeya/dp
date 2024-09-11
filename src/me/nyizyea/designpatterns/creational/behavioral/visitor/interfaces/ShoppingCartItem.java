package me.nyizyea.designpatterns.creational.behavioral.visitor.interfaces;

public interface ShoppingCartItem {
    double accept(ShoppingCartVisitor visitor);
}
