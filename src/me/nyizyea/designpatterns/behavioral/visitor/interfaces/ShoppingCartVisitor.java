package me.nyizyea.designpatterns.behavioral.visitor.interfaces;

import me.nyizyea.designpatterns.behavioral.visitor.interfaces.impl.Table;
import me.nyizyea.designpatterns.behavioral.visitor.interfaces.impl.Chair;

public interface ShoppingCartVisitor {
    double visit(Table table);

    double visit(Chair chair);
}
