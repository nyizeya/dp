package me.nyizyea.designpatterns.creational.behavioral.command.interfaces.impl;

import me.nyizyea.designpatterns.creational.behavioral.command.LightSwitch;
import me.nyizyea.designpatterns.creational.behavioral.command.interfaces.Command;

public class TurnOffCommand implements Command {
    private final LightSwitch lightSwitch;

    public TurnOffCommand(LightSwitch lightSwitch) {
        this.lightSwitch = lightSwitch;
    }

    @Override
    public void execute() {
        this.lightSwitch.turnOff();
    }
}
