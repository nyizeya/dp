package me.nyizyea.designpatterns.creational.behavioral.null_object;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<String> customerNames;

    public Database() {
        customerNames = new ArrayList<>();
        customerNames.add("Daniel");
        customerNames.add("Adam");
        customerNames.add("Joe");
        customerNames.add("Michael");
    }

    public boolean hasCustomer(String name) {
        for (String customer : customerNames) {
            if (customer.equals(name)) {
                return true;
            }
        }

        return false;
    }
}
