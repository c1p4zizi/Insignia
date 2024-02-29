package net.minecraft.insignia.command.commands;

import net.minecraft.insignia.Insignia;
import net.minecraft.insignia.command.Command;
import net.minecraft.insignia.module.Module;
import net.minecraft.insignia.util.ChatUtil;
import org.lwjgl.input.Keyboard;

import java.util.Locale;

public class BindCommand extends Command {
    public BindCommand() {
        super("Bind Command", "Binds a Module to your desired keybind.");
    }


    //TODO: ADD AUTO CORRECT

    @Override
    public void execute(String... args) {
        if(args.length != 3) {
            ChatUtil.printClientMsg("Expected 3 arguments, received " + args.length + ".");
            return;
        }
        args[2] = args[2].toUpperCase();
        for(final Module m : Insignia.getModuleRepository().getModules()) {
            if(m.getName().equalsIgnoreCase(args[1])) {
                m.setKey(Keyboard.getKeyIndex(args[2]));
                ChatUtil.printClientMsg("Bound " + m.getName() + " to " + args[2] + "!");
                return;
            }
        }

        ChatUtil.printClientMsg("Could not find module: " + args[1]);

    }
}
