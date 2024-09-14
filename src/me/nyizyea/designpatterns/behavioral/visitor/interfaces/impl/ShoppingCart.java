package me.nyizyea.designpatterns.behavioral.visitor.interfaces.impl;

import me.nyizyea.designpatterns.behavioral.visitor.interfaces.ShoppingCartVisitor;

public class ShoppingCart implements ShoppingCartVisitor {
    @Override
    public double visit(Table table) {
        return table.getPrice() * 1.3;
    }

    @Override
    public double visit(Chair chair) {
        return chair.getPrice() * 1.5;
    }
}
