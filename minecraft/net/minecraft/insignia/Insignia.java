package net.minecraft.insignia;

import net.minecraft.insignia.command.CommandExecutor;
import net.minecraft.insignia.event.events.OnClientChatMessageEvent;
import net.minecraft.insignia.event.events.OnKeyEvent;
import net.minecraft.insignia.listener.EventListener;
import net.minecraft.insignia.listener.EventManager;
import net.minecraft.insignia.module.Module;
import net.minecraft.insignia.module.ModuleRepository;

public final class Insignia {
    private static final EventManager eventManager = new EventManager();
    private static final ModuleRepository moduleRepository = new ModuleRepository();

    static {
        CommandExecutor.init();
        eventManager.subscribe(OnKeyEvent.class, event -> {
            for(final Module m : moduleRepository.getModules()) {
                if(event.getKey() == m.getKey()) {
                    m.toggle();
                }
            }
        });


    }

    public static ModuleRepository getModuleRepository() {
        return moduleRepository;
    }

    public static EventManager getEventManager() {
        return eventManager;
    }


}
