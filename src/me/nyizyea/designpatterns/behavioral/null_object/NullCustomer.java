package me.nyizyea.designpatterns.behavioral.null_object;

public class NullCustomer extends AbstractCustomer{
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getCustomer() {
        return "No customer with the given name in the database";
    }
}
