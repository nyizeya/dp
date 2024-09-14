package me.nyizyea.designpatterns.structural.facade.interfaces.impl;

import me.nyizyea.designpatterns.structural.facade.interfaces.Algorithm;

public class MergeSort implements Algorithm {
    @Override
    public void sort() {
        System.out.println("Using merge sort...");
    }
}
