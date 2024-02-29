package net.minecraft.insignia.command;

import net.minecraft.insignia.Insignia;
import net.minecraft.insignia.event.events.OnClientChatMessageEvent;
import net.minecraft.insignia.listener.EventListener;
import net.minecraft.insignia.util.ChatUtil;

public final class CommandExecutor {

    public static void executeCommand(String message) {
        String[] args = message.split(" ");
        Command command = CommandRepository.getCommandMap().get(args[0]);
        if(command != null) {
            command.execute(args);
        }
        else {
            ChatUtil.printClientMsg("Command '" + args[0] + "' not found!");
        }
    }

    public static void init() {
        Insignia.getEventManager().subscribe(OnClientChatMessageEvent.class, event -> {
            String message = event.message;
            if(message.charAt(0) == '.') {
                event.setCancelled();
                executeCommand(message.substring(1));
            }
        });
    }
}



