package me.nyizyea.designpatterns.behavioral.command.exercise;

public class Task {
    private int id;

    public Task(int id) {
        this.id = id;
    }

    public void doTask() {
        System.out.println("Doing task with ID: " + id);
    }


}
