package me.nyizyea.designpatterns.behavioral.visitor.interfaces.impl;

import me.nyizyea.designpatterns.behavioral.visitor.interfaces.ShoppingCartItem;
import me.nyizyea.designpatterns.behavioral.visitor.interfaces.ShoppingCartVisitor;

public class Table implements ShoppingCartItem {
    private String type;
    private double price;

    public Table(String type, double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
