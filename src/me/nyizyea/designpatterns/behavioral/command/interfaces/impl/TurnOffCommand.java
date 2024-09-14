package me.nyizyea.designpatterns.behavioral.command.interfaces.impl;

import me.nyizyea.designpatterns.behavioral.command.interfaces.Command;
import me.nyizyea.designpatterns.behavioral.command.LightSwitch;

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
