package me.nyizyea.designpatterns.behavioral.visitor.interfaces.impl;

import me.nyizyea.designpatterns.behavioral.visitor.interfaces.ShoppingCartItem;
import me.nyizyea.designpatterns.behavioral.visitor.interfaces.ShoppingCartVisitor;

public class Chair implements ShoppingCartItem {
    private String type;
    private double price;

    public Chair(String type, double price) {
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

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
