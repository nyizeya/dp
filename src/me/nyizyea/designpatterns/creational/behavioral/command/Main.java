package me.nyizyea.designpatterns.creational.behavioral.command;

import me.nyizyea.designpatterns.creational.behavioral.command.interfaces.impl.TurnOffCommand;
import me.nyizyea.designpatterns.creational.behavioral.command.interfaces.impl.TurnOnCommand;

/**
 * The Command pattern is a behavioral design pattern that encapsulates a request or action as an object,
 * allowing you to parameterize other objects with different requests, queue or log requests, and support undoable operations.
 *
 * In this pattern, an object is used to represent and encapsulate all the information needed to call a method at a later time.
 * This information includes the method name, the object that owns the method, and any parameters required by the method.
 */
public class Main {
    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        LightSwitch lightSwitch = new LightSwitch();
        TurnOnCommand turnOnCommand = new TurnOnCommand(lightSwitch);
        TurnOffCommand turnOffCommand = new TurnOffCommand(lightSwitch);

        switcher.addCommand(turnOnCommand);
        switcher.addCommand(turnOffCommand);

        switcher.executeCommands();
    }
}
