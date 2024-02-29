package net.minecraft.insignia.event.events;

import net.minecraft.insignia.event.Cancellable;
import net.minecraft.insignia.event.Event;

public class OnClientChatMessageEvent extends Cancellable implements Event {
    public final String message;

    public OnClientChatMessageEvent(final String message) {
        this.message = message;
    }

}
