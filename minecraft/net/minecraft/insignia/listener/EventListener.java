package net.minecraft.insignia.listener;

import net.minecraft.insignia.event.Event;

public interface EventListener<T extends  Event> {
    void onEvent(T event);
}