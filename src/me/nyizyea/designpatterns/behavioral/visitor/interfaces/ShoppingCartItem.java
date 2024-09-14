package me.nyizyea.designpatterns.behavioral.visitor.interfaces;

public interface ShoppingCartItem {
    double accept(ShoppingCartVisitor visitor);
}
