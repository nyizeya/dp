package me.nyizyea.designpatterns.structural.facade.interfaces.impl;

import me.nyizyea.designpatterns.structural.facade.interfaces.Algorithm;

public class BubbleSort implements Algorithm {
    @Override
    public void sort() {
        System.out.println("Using bubble sort...");
    }
}
