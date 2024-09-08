package me.nyizyea.designpatterns.creational.behavioral.command.interfaces.impl;

import me.nyizyea.designpatterns.creational.behavioral.command.LightSwitch;
import me.nyizyea.designpatterns.creational.behavioral.command.interfaces.Command;

public class TurnOnCommand implements Command {

    private final LightSwitch lightSwitch;

    public TurnOnCommand(LightSwitch lightSwitch) {
        this.lightSwitch = lightSwitch;
    }

    @Override
    public void execute() {
        this.lightSwitch.turnOn();
    }
}
