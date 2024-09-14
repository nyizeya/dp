package me.nyizyea.designpatterns.structural.facade;

import me.nyizyea.designpatterns.structural.facade.interfaces.Algorithm;
import me.nyizyea.designpatterns.structural.facade.interfaces.impl.BubbleSort;
import me.nyizyea.designpatterns.structural.facade.interfaces.impl.MergeSort;
import me.nyizyea.designpatterns.structural.facade.interfaces.impl.QuickSort;

public class SortingManager {
    private Algorithm bubbleSort;
    private Algorithm quickSort;
    private Algorithm mergeSort;

    public SortingManager() {
        this.bubbleSort = new BubbleSort();
        this.quickSort = new QuickSort();
        this.mergeSort = new MergeSort();
    }

    public void doBubbleSort() {
        bubbleSort.sort();
    }

    public void doQuickSort() {
        quickSort.sort();
    }

    public void doMergeSort() {
        mergeSort.sort();
    }
}
