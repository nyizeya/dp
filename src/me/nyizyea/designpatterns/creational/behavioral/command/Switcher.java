package me.nyizyea.designpatterns.creational.behavioral.command;

import me.nyizyea.designpatterns.creational.behavioral.command.interfaces.Command;

import java.util.ArrayList;
import java.util.List;

// Invoker
// Invoker does not know about any concrete implementation of the command. It's only responsible for executing the commands.
public class Switcher {
    public List<Command> commands;

    public Switcher() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        this.commands.add(command);
    }

    public void executeCommands() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
