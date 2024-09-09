package me.nyizyea.designpatterns.creational.behavioral.null_object;

public class CustomerFactory {
    private Database database;

    public CustomerFactory() {
        this.database = new Database();
    }

    public AbstractCustomer getCustomerByName(String name) {
        if (checkName(name)) {
            return new RealCustomer(name);
        }

        return new NullCustomer();
    }

    private boolean checkName(String name) {
        return this.database.hasCustomer(name);
    }
}
