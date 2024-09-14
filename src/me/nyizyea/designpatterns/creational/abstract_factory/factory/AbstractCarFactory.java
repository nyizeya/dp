package me.nyizyea.designpatterns.creational.abstract_factory.factory;

import me.nyizyea.designpatterns.creational.abstract_factory.enums.CarBrand;
import me.nyizyea.designpatterns.creational.abstract_factory.interfaces.Car;

public interface AbstractCarFactory {
    Car getCar(CarBrand carBrand);
}
