package net.minecraft.insignia.command;

import net.minecraft.insignia.command.commands.BindCommand;
import net.minecraft.insignia.command.commands.HelpCommand;

import java.util.HashMap;

public final class CommandRepository {
    private static final HashMap<String, Command> commands = new HashMap<>();

    static {
        commands.put("bind", new BindCommand());
        commands.put("help", new HelpCommand());
    }

    public static HashMap<String, Command> getCommandMap() {
        return commands;
    }

}
