package net.minecraft.insignia.event.events;

import net.minecraft.insignia.event.Event;

public class OnKeyEvent implements Event {
    private final int key;

    public OnKeyEvent(int key) {
        this.key = key;
    }

    public int getKey() {
        return this.key;
    }
}
