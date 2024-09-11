package me.nyizyea.designpatterns.creational.behavioral.visitor.interfaces;

import me.nyizyea.designpatterns.creational.behavioral.visitor.interfaces.impl.Chair;
import me.nyizyea.designpatterns.creational.behavioral.visitor.interfaces.impl.Table;

public interface ShoppingCartVisitor {
    double visit(Table table);

    double visit(Chair chair);
}
