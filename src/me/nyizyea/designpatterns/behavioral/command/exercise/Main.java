package me.nyizyea.designpatterns.behavioral.command.exercise;

// Exercise to use Command Patern
public class Main {
    /**
     * Commands package a piece of computation ...
     * These computations may be invoked long after command objects have been created.
     * - it can be invoked by different threads (schedulers, thread pools, job queues)
     * @param args
     */
    public static void main(String[] args) {
        final Algorithm algorithm = new Algorithm();
        Thread t1 = new Thread(() -> {
            algorithm.produce();
        });

        Thread t2 = new Thread(() -> {
            algorithm.consume();
        });

        t1.start();
        t2.start();
    }
}
