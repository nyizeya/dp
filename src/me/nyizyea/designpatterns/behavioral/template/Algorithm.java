package me.nyizyea.designpatterns.behavioral.template;

public abstract class Algorithm {
    protected int[] numbers;

    public Algorithm(int[] numbers) {
        this.numbers = numbers;
    }

    protected void swap(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    protected abstract void initialize();
    protected abstract void sort();
    protected abstract void showResult();
    protected void doSort() {
        initialize();
        sort();
        showResult();
    }
}
