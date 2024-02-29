package net.minecraft.insignia.listener;

import net.minecraft.insignia.event.Event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    private final Map<Class<? extends Event>, List<EventListener<? extends Event>>> listenersMap = new HashMap<>();

    public EventManager() {
    }

    public <T extends Event> void subscribe(final Class<T> eventType, final EventListener<T> listener) {
        listenersMap.computeIfAbsent(eventType, k -> new ArrayList<>()).add(listener);
    }

    public <T extends Event> void unsubscribe(final Class<T> eventType, final EventListener<T> listener) {
        List<EventListener<? extends Event>> listeners = listenersMap.get(eventType);
        if (listeners != null) {
            listeners.remove(listener);
        }
    }

    public <T extends Event> void publish(final T event) {
        Class<? extends Event> eventType = event.getClass();
        List<EventListener<? extends Event>> listeners = listenersMap.get(eventType);
        if (listeners != null) {
            for (EventListener<? extends Event> listener : listeners) {
                EventListener<T> typedListener = (EventListener<T>) listener;
                typedListener.onEvent(event);
            }
        }
    }
}
