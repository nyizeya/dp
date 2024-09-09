package me.nyizyea.designpatterns.creational.behavioral.template;

public class BubbleSort extends Algorithm{
    public BubbleSort(int[] numbers) {
        super(numbers);
    }

    @Override
    protected void initialize() {
        System.out.println("Bubble sort starts...");
    }

    @Override
    protected void sort() {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }

    @Override
    protected void showResult() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
    }
}
