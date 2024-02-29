package net.minecraft.insignia.command.commands;

import net.minecraft.insignia.command.Command;
import net.minecraft.insignia.command.CommandRepository;
import net.minecraft.insignia.util.ChatUtil;

import java.util.Map;

public class HelpCommand extends Command {
    public HelpCommand() {
        super("Help command", "Shows you this message");
    }

    @Override
    public void execute(String... args) {
        for(Map.Entry<String, Command> entry : CommandRepository.getCommandMap().entrySet()) {
            String key = entry.getKey();
            Command command = entry.getValue();
            ChatUtil.printClientMsg(key + " | " + command.getName() + " - " + command.getDescription());
        }
    }
}
