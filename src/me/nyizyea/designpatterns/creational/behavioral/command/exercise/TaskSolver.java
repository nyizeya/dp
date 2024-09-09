package me.nyizyea.designpatterns.creational.behavioral.command.exercise;

import me.nyizyea.designpatterns.creational.behavioral.command.exercise.interfaces.Command;

public class TaskSolver implements Command {

    private final Task task;

    public TaskSolver(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        task.doTask();
    }
}
