package com.alex.cmd;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Alexandru on 5/26/2017.
 */
public class CommandManager {

    private static final int A = 30;
    private static final int B = 6;
    private List<Command> commands = new LinkedList<>();


    public CommandManager() {
        commands.add(new Addition());
        commands.add(new Subtraction());
        commands.add(new Division());
        commands.add(new Multiplication());
    }

    public void executeCommands() {
        commands.forEach(command -> System.out.println(command.compute(A, B)));
    }
}
