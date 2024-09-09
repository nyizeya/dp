package me.nyizyea.designpatterns.creational.behavioral.command.exercise;

import me.nyizyea.designpatterns.creational.behavioral.command.exercise.interfaces.Command;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Algorithm {
    private final int CAPACITY = 10;
    private BlockingQueue<Command> commands;

    public Algorithm() {
        commands = new ArrayBlockingQueue<>(CAPACITY);
    }

    public void produce() {
        for (int i = 1; i <= CAPACITY; i++) {
            commands.add(new TaskSolver(new Task(i)));
        }
    }

    public void consume() {
        for (int i = 0; i < CAPACITY; i++) {
            try {
                Thread.sleep(1000);
                commands.take().execute();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
