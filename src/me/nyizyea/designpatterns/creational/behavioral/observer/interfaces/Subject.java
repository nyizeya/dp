package me.nyizyea.designpatterns.creational.behavioral.observer.interfaces;

public interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);
    void notifyAllObservers();
}
