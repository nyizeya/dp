package me.nyizyea.designpatterns.behavioral.command.interfaces.impl;

import me.nyizyea.designpatterns.behavioral.command.interfaces.Command;
import me.nyizyea.designpatterns.behavioral.command.LightSwitch;

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
