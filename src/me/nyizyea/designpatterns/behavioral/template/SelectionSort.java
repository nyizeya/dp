package me.nyizyea.designpatterns.behavioral.template;

public class SelectionSort extends Algorithm {

    public SelectionSort(int[] numbers) {
        super(numbers);
    }

    @Override
    protected void initialize() {
        System.out.println("Selection sort starts...");
    }

    @Override
    protected void sort() {
        for (int i = 0; i < numbers.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > numbers[index]) {
                    index = j;
                }
            }

            if (index != i)
            {
                swap(i, index);
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
